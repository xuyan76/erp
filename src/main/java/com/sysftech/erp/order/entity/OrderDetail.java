package com.sysftech.erp.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("bus_order_detail")
public class OrderDetail {
    @TableId
    Long id;
    Long orderId;
}
