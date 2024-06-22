package com.sysftech.erp.contract.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@TableName("bus_contract")
public class Contract {

    Long id;
    String code;
    Long supplierId;
    LocalDate signDate;
    LocalDate validStart;
    LocalDate validEnd;

    Long createBy;
    @TableField(fill = FieldFill.INSERT)
    LocalDateTime createTime;
    Long updateBy;
    @TableField(fill = FieldFill.UPDATE)
    LocalDateTime updateTime;

}
