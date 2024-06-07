package com.sysftech.erp.service;

import com.sysftech.erp.system.repository.OrgRepository;
import com.sysftech.erp.system.repository.UserRepository;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SystemService {

    @Resource
    private UserRepository userDao;

    @Resource
    private OrgRepository orgDao;

}
