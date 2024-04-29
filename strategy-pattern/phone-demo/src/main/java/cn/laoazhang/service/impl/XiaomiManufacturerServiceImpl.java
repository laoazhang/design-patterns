package cn.laoazhang.service.impl;

import cn.laoazhang.config.SourceType;
import cn.laoazhang.enums.SourceTypeEnum;
import cn.laoazhang.service.PhoneManufacturerService;

/**
 * 小米厂商
 */
@SourceType(SourceTypeEnum.XIAOMI)
public class XiaomiManufacturerServiceImpl implements PhoneManufacturerService {
    @Override
    public String getPhone(Integer type) {
        return "一台小米100pro旗舰手机";
    }

    @Override
    public String buyPhone(Integer type) {
        return "购买了小米100pro旗舰手机";
    }
}
