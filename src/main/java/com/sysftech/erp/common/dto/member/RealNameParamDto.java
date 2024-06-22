package com.sysftech.erp.common.dto.member;

import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class RealNameParamDto {
    @NotNull(message = "姓名不能为空")
    String name;
    @NotNull(message = "身份证号不能为空")
    String idCard;
}
