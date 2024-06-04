package com.sysftech.erp.service;

import com.sysftech.erp.repsitories.UserRepository;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SystemService {

    @Resource
    private UserRepository userDao;

}
