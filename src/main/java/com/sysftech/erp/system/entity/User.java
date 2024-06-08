package com.sysftech.erp.system.entity;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "sys_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotNull
    String code;
    @NotNull
    String name;
    Integer status;
    String mobile;
    Long orgId;

    @NotNull
    Long createBy;
    @NotNull
    LocalDateTime createTime;
    Long updateBy;
    LocalDateTime updateTime;
}
