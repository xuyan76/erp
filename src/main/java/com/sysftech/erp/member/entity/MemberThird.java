package com.sysftech.erp.member.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@TableName("cms_member_third")
public class MemberThird {
    Long id;
    Long memberId;
    Integer thirdId;
    String openId;
}
