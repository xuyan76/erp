package com.sysftech.erp.member.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * 实名认证信息
 * @author xuyan
 * @since 2024-06-15
 */
@Entity
@Table(name = "cms_real_name")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class RealName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String realName;
    String idCard;
    String mobile;
    Integer byWay;
    LocalDateTime createTime;
}
