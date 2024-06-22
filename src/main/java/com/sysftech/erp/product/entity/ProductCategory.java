package com.sysftech.erp.product.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.time.LocalDateTime;

@Data
@TableName("bus_product_category")
public class ProductCategory {
    @TableId
    Integer id;
    String name;
    String desc;
    String ico;
    Integer sortNo;
    Integer parentId;
    String keywords;
    Integer status;

    Long createBy;
    @TableField(fill = FieldFill.INSERT)
    LocalDateTime createTime;
    Long updateBy;
    @TableField(fill = FieldFill.UPDATE)
    LocalDateTime updateTime;
}
