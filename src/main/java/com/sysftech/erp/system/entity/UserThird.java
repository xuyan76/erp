package com.sysftech.erp.system.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@TableName("sys_user_third")
public class UserThird {
    @TableId
    Long id;
    Integer thirdId;
    Long userId;
    String openId;


}
