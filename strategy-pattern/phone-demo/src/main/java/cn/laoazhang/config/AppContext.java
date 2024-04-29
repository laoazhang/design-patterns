package cn.laoazhang.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 初始化配置容器
 */
@Component
@Slf4j
public class AppContext implements ApplicationContextAware {

    private static ApplicationContext appContext;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (null == appContext){
            if (null != applicationContext) {
//                AppContext.appContext = applicationContext;
                this.appContext = applicationContext;
            }
            log.info("Spring init successfully");
        }
    }

    public static ApplicationContext getContext() {
        if (appContext == null) {
            throw new IllegalStateException("applicationContext inject failure,please use restart the service");
        }
        return appContext;
    }
}
