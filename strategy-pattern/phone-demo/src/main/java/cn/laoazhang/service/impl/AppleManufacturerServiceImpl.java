package cn.laoazhang.service.impl;

import cn.laoazhang.config.SourceType;
import cn.laoazhang.enums.SourceTypeEnum;
import cn.laoazhang.service.PhoneManufacturerService;

@SourceType(SourceTypeEnum.APPLE)
public class AppleManufacturerServiceImpl implements PhoneManufacturerService {
    @Override
    public String getPhone(Integer type) {
        return "一台苹果iPhoneX旗舰手机";
    }

    @Override
    public String buyPhone(Integer type) {
        return "购买了一台苹果iPhoneX旗舰手机";
    }
}
