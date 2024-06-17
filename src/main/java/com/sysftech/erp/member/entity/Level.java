package com.sysftech.erp.member.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cms_level")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    Integer status;
    Integer sortNo;

}
