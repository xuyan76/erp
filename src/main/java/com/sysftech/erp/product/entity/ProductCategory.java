package com.sysftech.erp.product.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "bus_product_category")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String desc;
    String ico;
    Integer sortNo;
    Integer parentId;
    String keywords;
    Integer status;
    Long createBy;
    LocalDateTime createTime;
    Long updateBy;
    LocalDateTime updateTime;
}
