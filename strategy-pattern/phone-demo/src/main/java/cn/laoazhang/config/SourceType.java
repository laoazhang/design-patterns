package cn.laoazhang.config;

import cn.laoazhang.enums.SourceTypeEnum;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 厂商来源注解
 */
@Inherited
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface SourceType {

    SourceTypeEnum value();
}
