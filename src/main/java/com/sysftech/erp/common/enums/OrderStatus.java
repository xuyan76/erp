package com.sysftech.erp.common.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 订单状态
 */
@Getter
@AllArgsConstructor
public enum OrderStatus {
    Pending(1);

    final int value;

    public static OrderStatus fromValue(int value){
        for (OrderStatus status: OrderStatus.values()){
            if (status.getValue() == value){
                return status;
            }
        }
        throw new IllegalArgumentException(String.format("无效的订单状态[%d]", value));
    }


}
