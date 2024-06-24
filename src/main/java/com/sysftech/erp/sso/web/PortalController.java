package com.sysftech.erp.sso.web;

import com.sysftech.erp.common.dto.portal.LoginDto;
import com.sysftech.erp.system.service.LoginService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/portal")
@Slf4j
public class PortalController {

    @Resource
    LoginService loginService;

    @RequestMapping("/login")
    public String login(LoginDto loginDto) {
        log.debug(loginDto.toString());
        return "portal/login";
    }
}
