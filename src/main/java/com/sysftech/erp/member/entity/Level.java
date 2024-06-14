package com.sysftech.erp.member.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "cms_level")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Level {
    @Id
    Integer id;
    String name;
    Integer status;
    Integer sortNo;

}
