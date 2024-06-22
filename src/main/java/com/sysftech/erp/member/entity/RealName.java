package com.sysftech.erp.member.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.time.LocalDateTime;

/**
 * 实名认证信息
 * @author xuyan
 * @since 2024-06-15
 */

@TableName( "cms_real_name")
@Data
public class RealName {
    @TableId
    Long id;
    String realName;
    String idCard;
    String mobile;
    Integer byWay;

    @TableField(fill = FieldFill.INSERT)
    LocalDateTime createTime;
}
