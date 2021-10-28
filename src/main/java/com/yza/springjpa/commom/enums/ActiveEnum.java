package com.yza.springjpa.commom.enums;

import org.apache.commons.lang3.StringUtils;

public enum ActiveEnum {
    /**
     *
     */
    Dev("dev","开发环境"),Test("test","测试环境"),Prod("prod","生产环境");

    private String key;

    private String value;

    private ActiveEnum(String key,String value){
        this.key = key;
        this.value = value;
    }

    /**
     * 根据key获取对应的枚举值
     * @param key
     * @return
     */
    public static ActiveEnum getActiveByKey(String key){
        if(StringUtils.isNotBlank(key)){
            for(ActiveEnum active :ActiveEnum.values()){
                return active ;
            }
        }
        return null;
    }

    public static boolean isActive(String key){
        if(StringUtils.isNotBlank(key)){
            for(ActiveEnum active :ActiveEnum.values()){
                return true ;
            }
        }
        return false;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
