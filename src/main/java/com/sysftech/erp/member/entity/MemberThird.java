package com.sysftech.erp.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@TableName("cms_member_third")
public class MemberThird {
    @TableId
    Long id;
    Long memberId;
    Integer thirdId;
    String openId;
}
