package com.sysftech.erp.system.service;

import com.sysftech.erp.system.dao.OrgDao;
import com.sysftech.erp.system.dao.UserDao;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SystemService {

    @Resource
    private UserDao userDao;

    @Resource
    private OrgDao orgDao;

}
