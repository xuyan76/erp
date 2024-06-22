package com.sysftech.erp.system.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.time.LocalDateTime;

@Data
@TableName("sys_app")
public class App {
    Integer id;
    String title;
    Integer source;
    Integer status;
    String clientId;
    String clientSecurity;

    Long createBy;
    @TableField(fill = FieldFill.INSERT)
    LocalDateTime createTime;
    Long updateBy;
    @TableField(fill = FieldFill.UPDATE)
    LocalDateTime updateTime;
}
