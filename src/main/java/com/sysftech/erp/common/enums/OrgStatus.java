package com.sysftech.erp.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrgStatus {
    NORMAL(1, "正常");
    @EnumValue
    private final Integer value;
    private final String desc;


}
