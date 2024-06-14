package com.sysftech.erp.system.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "sys_app_whitelist")
public class AppWhitelist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer appId;
    Integer ipAddress;
}
