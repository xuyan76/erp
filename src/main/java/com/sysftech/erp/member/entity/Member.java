package com.sysftech.erp.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.time.LocalDateTime;

/**
 * 会员信息
 */
@Data
@TableName("cms_member")
public class Member {
    @TableId
    Long id;
    String code;
    Integer source;
    LocalDateTime regTime;
}
