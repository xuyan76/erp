package com.sysftech.erp.system.entriy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "sys_role")
public class Role {
    @Id
    Long Id;
    @NotNull
    String name;
    Integer status;
    String desc;
    Long createBy;
    LocalDateTime createTime;
    Long updateBy;
    LocalDateTime updateTime;

    String dashboard;
}
