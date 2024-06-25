package com.sysftech.erp.system.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.handlers.MybatisEnumTypeHandler;
import com.sysftech.erp.common.enums.OrgStatus;
import com.sysftech.erp.common.enums.OrgType;
import lombok.*;
import org.apache.ibatis.type.EnumTypeHandler;

import java.time.LocalDateTime;

@Data
@TableName("sys_org")
public class Org {
    @TableId
    Long id;
    String shortName;
    String name;
    Long parentId;
    String casCode;
    @TableField(typeHandler = MybatisEnumTypeHandler.class)
    OrgType type;
    @TableField(typeHandler = MybatisEnumTypeHandler.class)
    OrgStatus status;

    String fax;
    String province;
    String city;
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

    String description;
    Integer sortNo;
}
