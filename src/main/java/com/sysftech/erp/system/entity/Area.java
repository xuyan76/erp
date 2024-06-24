package com.sysftech.erp.system.entity;

import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sys_area")
public class Area {
    @TableId
    Integer id;
    String code;
    String name;
    String fullName;
    Integer parentId;

}
