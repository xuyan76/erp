package com.sysftech.erp.admin.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 门店端前端
 * @author xuyan
 * @since 2024-06-17
 */
@Controller
@Slf4j
@RequestMapping("/outlet")
public class OutletController {

    /**
     * 登录门店端
     */
    @GetMapping("/login")
    public String login(){
        return "outlet/login";
    }


    public void logout(){

    }
}