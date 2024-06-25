package com.sysftech.erp.system.web;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sysftech.erp.common.ApiResponse;
import com.sysftech.erp.common.utils.ResultBuilder;
import com.sysftech.erp.system.dao.OrgDao;
import com.sysftech.erp.system.entity.Org;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/org")
public class OrgController {
    @Resource
    OrgDao orgDao;

    @GetMapping("/all")
    public ApiResponse<List<Org>> getOrgDao() {
        return ResultBuilder.success(orgDao.selectList(Wrappers.emptyWrapper()));
    }

}
