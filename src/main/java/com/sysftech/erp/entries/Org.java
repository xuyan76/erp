package com.sysftech.erp.entries;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Entity
@Data
public class Org {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long parentId;
    private Long createBy;
    private LocalDateTime createTime;
    @Nullable
    private Long updateBy;
    @Nullable
    @Comment("更新时间")
    private LocalDateTime updateTime;
}
