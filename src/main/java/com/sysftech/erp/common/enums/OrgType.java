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
    final Integer code;
    final String desc;

    public static OrgType fromValue(int value) {
        for (OrgType orgType : OrgType.values()) {
            if (orgType.getCode() == value) {
                return orgType;
            }
        }
        throw new IllegalArgumentException(String.format("无效的部门类型[%d]", value));
    }
}
