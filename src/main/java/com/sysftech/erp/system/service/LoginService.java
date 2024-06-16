package com.sysftech.erp.system.service;

import com.sysftech.erp.common.dto.system.UserDto;
import com.sysftech.erp.system.repository.UserRepository;
import com.sysftech.erp.system.repository.UserThirdRepository;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoginService {

    @Resource
    UserRepository userDao;
    @Resource
    UserThirdRepository userThirdDao;

    public UserDto login(String user, String password) {
        // 查询用户
        // 查询第三方登录信息
        // 返回用户信息
        return null;
    }
    public void logout() {}
}
