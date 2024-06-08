package com.sysftech.erp.api;

import com.sysftech.erp.common.ApiResponse;
import com.sysftech.erp.common.dto.AppDto;
import com.sysftech.erp.common.utils.ResultBuilder;
import com.sysftech.erp.system.entity.App;
import com.sysftech.erp.system.service.AppService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/pos/api")
public class PosController {

    @Resource
    AppService appService;

    @PostMapping("/echo")
    public ApiResponse<AppDto> echo(@RequestBody AppDto json){
        log.debug(json.toString());
        return ResultBuilder.success(json);
    }

    @PostMapping("/saveapp")
    public String saveApp(@RequestBody AppDto json){
        return appService.save(json);
    }
}
