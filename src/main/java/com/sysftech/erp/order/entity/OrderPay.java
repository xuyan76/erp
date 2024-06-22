package com.sysftech.erp.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("bus_order_pay")
public class OrderPay {
    @TableId
    Long id;
    Long orderId;
}
