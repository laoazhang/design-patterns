package cn.laoazhang.controller;

import cn.laoazhang.enums.SourceTypeEnum;
import cn.laoazhang.service.PhoneManufacturerService;
import cn.laoazhang.strategy.FactoryHandlerStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phone")
public class PhoneController {

    private final FactoryHandlerStrategy factoryHandlerStrategy;

    public PhoneController(FactoryHandlerStrategy factoryHandlerStrategy) {
        this.factoryHandlerStrategy = factoryHandlerStrategy;
    }

    @GetMapping("/get")
    public String getPhone(@RequestParam Integer type) {
        PhoneManufacturerService manufacturerService = factoryHandlerStrategy.getPhoneManufacturer(SourceTypeEnum.getInstance(type));
        if (null != manufacturerService) {
            return manufacturerService.getPhone(type);
        }
        return "获取失败了";
    }

    @RequestMapping("/buy")
    public String buyPhone(@RequestParam Integer type) {
        PhoneManufacturerService manufacturerService = factoryHandlerStrategy.getPhoneManufacturer(SourceTypeEnum.getInstance(type));
        if (null != manufacturerService) {
            return manufacturerService.buyPhone(type);
        }
        return "获取失败了";
    }

}
