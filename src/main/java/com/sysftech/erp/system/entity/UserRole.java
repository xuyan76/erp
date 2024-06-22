package com.sysftech.erp.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@TableName("sys_user_role")
public class UserRole {
    Long id;
    Long userId;
    Long roleId;
}
