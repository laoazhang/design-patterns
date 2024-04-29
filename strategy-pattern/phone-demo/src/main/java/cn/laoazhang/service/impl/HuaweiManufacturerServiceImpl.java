package cn.laoazhang.service.impl;

import cn.laoazhang.config.SourceType;
import cn.laoazhang.enums.SourceTypeEnum;
import cn.laoazhang.service.PhoneManufacturerService;

/**
 * 华为厂商手机
 */
@SourceType(SourceTypeEnum.HUAWEI)
public class HuaweiManufacturerServiceImpl implements PhoneManufacturerService {
    @Override
    public String getPhone(Integer type) {
        return "一台华为Mete100旗舰手机";
    }

    @Override
    public String buyPhone(Integer type) {
        return "购买了华为Mete100旗舰手机";
    }
}
