package com.sysftech.erp.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sysftech.erp.common.enums.OrderStatus;
import com.sysftech.erp.common.enums.OrderType;
import com.sysftech.erp.common.enums.RefundStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("bus_order")
public class Order {
    @TableId
    Long id;
    String code;
    OrderType type;
    LocalDateTime orderTime;
    OrderStatus status;

    Long cashier;
    Integer deviceId;
    Integer prints;
    RefundStatus refundStatus;
    Long refundOrderId;
    String refundReason;

    Long memberId;

}