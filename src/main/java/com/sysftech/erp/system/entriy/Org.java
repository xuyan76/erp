package com.sysftech.erp.system.entriy;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "sys_org")
public class Org {
    @Id
    Long id;
    @NotNull
    String shortName;
    String fullName;
    @NotNull
    Long parentId;
    @NotNull
    String casCode;
    Integer orgType;
    Integer status;

    String fax;
    String address;
    Double latitude;
    Double longitude;
    String geoHash;

    @NotNull
    Long createBy;
    @NotNull
    LocalDateTime createTime;
    Long updateBy;
    LocalDateTime updateTime;

    String desc;
    Integer orderNo;
}
