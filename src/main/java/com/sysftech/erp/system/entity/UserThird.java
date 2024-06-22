package com.sysftech.erp.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@TableName("sys_user_third")
public class UserThird {
    Long id;
    Integer thirdId;
    Long userId;
    String openId;


}
