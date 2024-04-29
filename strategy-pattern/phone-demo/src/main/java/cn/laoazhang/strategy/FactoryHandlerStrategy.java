package cn.laoazhang.strategy;

import cn.hutool.core.map.MapUtil;
import cn.laoazhang.config.AppContext;
import cn.laoazhang.config.SourceType;
import cn.laoazhang.enums.SourceTypeEnum;
import cn.laoazhang.factory.InitProcess;
import cn.laoazhang.service.PhoneManufacturerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Slf4j
public class FactoryHandlerStrategy implements InitProcess {

    private static ConcurrentHashMap<SourceTypeEnum, PhoneManufacturerService> phoneManufactureMap = new ConcurrentHashMap<>();

    @Override
    public void init() {
        initPhoneManufacturer();
    }

    /**
     * 初始化phoneManufacturerMap
     */
    private void initPhoneManufacturer() {
        // 加载PhoneManufacturerService 厂商处理实现类
        Map<String, PhoneManufacturerService> mapPhoneManufacturer = AppContext.getContext().getBeansOfType(PhoneManufacturerService.class);
        mapPhoneManufacturer.entrySet().stream()
                .forEach(entry -> {
                    Class<? extends PhoneManufacturerService> clazz = entry.getValue().getClass();
                    SourceType annotation = clazz.getAnnotation(SourceType.class);

                   /* if (null == annotation) {
                        // 这里为处理方法使用@Async,SourceType类型获取失效问题
                        Map<String, Object> map = JSON.parseObject(JSON.toJSONString(entry.getValue()));
                        Object decoratedClass = map.get("decoratedClass");
                        try {
                            clazz = Class.forName(decoratedClass.toString());
                            annotation = clazz.getAnnotation(SourceType.class);
                        } catch (Exception e) {
                            log.error("class forName error:{}", e);
                        }
                    }*/

                    if (null == annotation) {
                        return;
                    }
                    SourceTypeEnum sourceType = annotation.value();
                    if (null != sourceType) {
                        PhoneManufacturerService phoneManufacturerService = phoneManufactureMap.get(sourceType);
                        if (null != phoneManufacturerService) {
                            phoneManufactureMap.remove(sourceType);
                        }
                        phoneManufactureMap.put(sourceType, entry.getValue());
                    }
                });
    }


    /**
     * 根据厂商来源获取实现类
     *
     * @param sourceTypeEnum
     * @return
     */
    public PhoneManufacturerService getPhoneManufacturer(SourceTypeEnum sourceTypeEnum) {
        if (MapUtil.isEmpty(phoneManufactureMap)) {
            initPhoneManufacturer();
        }
        return phoneManufactureMap.get(sourceTypeEnum);
    }


}
