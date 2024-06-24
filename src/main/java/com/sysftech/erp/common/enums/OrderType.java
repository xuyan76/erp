package com.sysftech.erp.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 订单类型
 */
@Getter
public enum OrderType {

    SALE(1, "销售订单"),
    PRESALE(2, "预w售订单"),
    REFUND(3, "退货订单");

    private final Integer code;
    private final String desc;


    OrderType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
