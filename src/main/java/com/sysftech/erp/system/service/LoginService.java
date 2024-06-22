package com.sysftech.erp.system.service;

import com.sysftech.erp.common.dto.system.UserDto;
import com.sysftech.erp.system.dao.UserDao;
import com.sysftech.erp.system.dao.UserThirdDao;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoginService {

    @Resource
    UserDao userDao;
    @Resource
    UserThirdDao userThirdDao;

    public UserDto login(String user, String password) {
        // 查询用户
        // 查询第三方登录信息
        // 返回用户信息
        return null;
    }
    public void logout() {}
}
