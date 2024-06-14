package com.sysftech.erp.member.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cms_member_third")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class MemberThird {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long memberId;
    Integer thirdId;
    String openId;

}
