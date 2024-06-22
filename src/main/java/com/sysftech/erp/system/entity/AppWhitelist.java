package com.sysftech.erp.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@TableName("sys_app_whitelist")
public class AppWhitelist {
    @TableId
    Integer id;
    Integer appId;
    Integer ipAddress;
}
