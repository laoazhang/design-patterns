package cn.laoazhang.config;

import cn.laoazhang.strategy.FactoryHandlerStrategy;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 初始配置
 */
@Component
public class InitContext implements ApplicationRunner {

    private final FactoryHandlerStrategy factoryHandlerStrategy;

    public InitContext(FactoryHandlerStrategy factoryHandlerStrategy){
        this.factoryHandlerStrategy = factoryHandlerStrategy;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        /**
         * 容器启动完成把实现InitProcess的实现类都执行init初始化操作，根据实际需要实现
         */
        factoryHandlerStrategy.init();
    }
}
