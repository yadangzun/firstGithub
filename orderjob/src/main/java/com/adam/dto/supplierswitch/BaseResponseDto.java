package com.adam.dto.supplierswitch;

public class BaseResponseDto {
    /**
     * 返回code
     * Success("0", "成功"), fail("-1", "http异常"), exception("1", "处理异常");
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
