package com.sysftech.erp.system.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * 三方平台
 */
@Entity
@Table(name = "sys_third")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Third {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    Integer status;
    String logo;
    String ico;
    Long createBy;
    LocalDateTime createTime;
    Long updateBy;
    LocalDateTime updateTime;
}
