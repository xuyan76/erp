package com.sysftech.erp.member.web;

import cn.hutool.json.JSONObject;
import com.sysftech.erp.common.ApiResponse;
import com.sysftech.erp.common.dto.BaseSignDto;
import com.sysftech.erp.common.dto.member.RealNameParamDto;
import com.sysftech.erp.common.utils.ResultBuilder;
import com.sysftech.erp.member.entity.RealName;
import com.sysftech.erp.member.service.MemberService;
import jakarta.annotation.Resource;
import jakarta.enterprise.inject.build.compatible.spi.Validation;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/member")
public class MemberController {

    @Resource
    MemberService memberService;

    @PostMapping("/realname/verify")
    public ApiResponse<Optional<RealName>> realNameVerify(@RequestBody @Valid RealNameParamDto rnDto){
        log.info("realNameVerify:{}" ,rnDto);
        BaseSignDto bt = new BaseSignDto();
        return ResultBuilder.success(memberService.realNameVerify(rnDto.getIdCard(), rnDto.getName()));
    }

}
