package cn.laoazhang.service.impl;

import cn.laoazhang.config.SourceType;
import cn.laoazhang.enums.SourceTypeEnum;
import cn.laoazhang.service.PhoneManufacturerService;

@SourceType(SourceTypeEnum.OPPO)
public class OppoManufacturerServiceImpl implements PhoneManufacturerService {

    public String getPhone(Integer type){
        return "一台OPPOFindX500旗舰手机";
    }

    public String buyPhone(Integer type){
        return "购买了OPPOFindX500旗舰手机";
    }
}
