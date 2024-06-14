package com.sysftech.erp.system.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
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
