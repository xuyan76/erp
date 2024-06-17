package com.sysftech.erp.admin.web;

import com.sysftech.erp.system.service.SystemService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Slf4j
public class AdminController {
    @Resource
    SystemService systemService;

}
