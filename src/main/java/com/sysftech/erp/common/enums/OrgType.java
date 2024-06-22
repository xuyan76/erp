package com.sysftech.erp.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.checkerframework.checker.units.qual.A;

/**
 *  部门类型
 */
@Getter
@AllArgsConstructor
public enum OrgType {

    HQ(1, "总部"),
    COMPANY(2, "公司"),
    DEPARTMENT(3, "部门"),
    OUTLET(4,"门店");

    @EnumValue
    @JsonValue
    final int code;
    final String desc;

}
