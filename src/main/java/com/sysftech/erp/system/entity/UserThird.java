package com.sysftech.erp.system.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "sys_user_third")
public class UserThird {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer thirdId;
    Long userId;
    String openId;


}
