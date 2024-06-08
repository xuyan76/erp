package com.sysftech.erp.system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "sys_app_whitelist")
public class AppWhitelist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer appId;
    Integer ipAddress;
}
