package com.adam.dto.dsfagentplus;

/**
 * 服务返回体基类
 */
public class BaseResponseEntity {
    /**
     * 返回code
     */
    private Integer code;

    /**
     * 返回详情描述
     */
    private String msg;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "BaseResponseEntity{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
