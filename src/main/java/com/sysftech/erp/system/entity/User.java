package com.sysftech.erp.system.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.time.LocalDateTime;

@Data
@TableName("sys_user")
public class User {
    @TableId
    Long id;
    String code;
    String name;
    String password;
    Integer status;
    String mobile;
    Long orgId;
    String email;
    Long createBy;
    @TableField(fill = FieldFill.INSERT)
    LocalDateTime createTime;
    Long updateBy;
    @TableField(fill = FieldFill.UPDATE)
    LocalDateTime updateTime;
}
