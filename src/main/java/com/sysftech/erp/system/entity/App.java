package com.sysftech.erp.system.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "sys_app")
public class App implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String title;
    Integer status;
    String clientId;
    String clientSecurity;
    Long createBy;
    LocalDateTime createTime;
    Long updateBy;
    LocalDateTime updateTime;
}
