package cn.laoazhang.enums;

/**
 * 手机厂商枚举
 */
public enum SourceTypeEnum {
    HUAWEI(1, "华为厂商"),
    XIAOMI(2, "小米厂商"),
    OPPO(3, "OPPO厂商"),
    APPLE(4,"苹果厂商");


    private Integer type;
    private String memo;

    SourceTypeEnum(Integer type,String memo) {
        this.type = type;
        this.memo = memo;
    }

    public Integer getType() {
        return type;
    }

    public String getMemo() {
        return memo;
    }

    /**
     * 根据类型获取实例
     * @param type
     * @return
     */
    public static SourceTypeEnum getInstance(Integer type) {
        if (null == type) {
            return null;
        }
        for (SourceTypeEnum typeEnum : SourceTypeEnum.values()) {
            if (typeEnum.type.equals(type)) {
                return typeEnum;
            }
        }
        return null;
    }
}
