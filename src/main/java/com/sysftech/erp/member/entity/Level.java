package com.sysftech.erp.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@TableName("sys_level")
public class Level {
    Integer id;
    String name;
    Integer status;
    Integer sortNo;
}
