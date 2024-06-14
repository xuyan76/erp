package com.sysftech.erp.member.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * 会员信息
 */
@Entity
@Table(name = "cms_member")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String code;
    Integer source;
    LocalDateTime regTime;
}
