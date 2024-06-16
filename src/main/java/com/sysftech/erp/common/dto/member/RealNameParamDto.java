package com.sysftech.erp.common.dto.member;

import com.sysftech.erp.common.dto.BaseSignDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class RealNameParamDto extends BaseSignDto {
    @NotNull(message = "姓名不能为空")
    String name;
    @NotNull(message = "身份证号不能为空")
    String idCard;
}
