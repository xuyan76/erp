package com.sysftech.erp.contract.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "bus_contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String code;
    Long supplierId;
    LocalDate signDate;
    LocalDate validStart;
    LocalDate validEnd;

    Long createBy;
    LocalDateTime createTime;
    Long updateBy;
    LocalDateTime updateTime;

}
