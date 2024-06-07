package com.sysftech.erp.system.web;

import com.sysftech.erp.system.service.SystemService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/system")
public class LoginController {

    @Resource
    private SystemService systemService;


    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
