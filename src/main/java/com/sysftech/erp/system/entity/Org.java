package com.sysftech.erp.system.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.time.LocalDateTime;

@Data
@TableName("sys_org")
public class Org {
    Long id;
    String shortName;
    String fullName;
    Long parentId;
    String casCode;
    Integer orgType;
    Integer status;

    String fax;
    String address;
    Double latitude;
    Double longitude;
    String geoHash;


    Long createBy;
    @TableField(fill = FieldFill.INSERT)
    LocalDateTime createTime;
    Long updateBy;
    @TableField(fill = FieldFill.UPDATE)
    LocalDateTime updateTime;

    String desc;
    Integer orderNo;
}
