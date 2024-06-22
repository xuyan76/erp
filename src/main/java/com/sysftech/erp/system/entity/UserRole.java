package com.sysftech.erp.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@TableName("sys_user_role")
public class UserRole {
    @TableId
    Long id;
    Long userId;
    Long roleId;
}
