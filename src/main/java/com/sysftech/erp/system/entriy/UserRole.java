package com.sysftech.erp.system.entriy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sys_user_role")
public class UserRole {
    @Id
    Long id;
    Long userId;
    Long roleId;
}
