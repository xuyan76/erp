package com.sysftech.erp.system.service;

import com.sysftech.erp.common.dto.AppDto;
import com.sysftech.erp.system.entity.App;
import com.sysftech.erp.system.entity.AppWhitelist;
import com.sysftech.erp.system.repository.AppRepository;
import com.sysftech.erp.system.repository.AppWhitelistRepository;
import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class AppService {

    @Resource
    AppRepository appDao;
    @Resource
    AppWhitelistRepository appWhitelistDao;

    @Transactional(rollbackOn = Exception.class)
    public String save(AppDto appDto){
        App app = new App();
        app.setTitle(appDto.getName());
        app.setStatus(Integer.valueOf("1"));
        app.setCreateBy(Long.valueOf("1"));
        app.setCreateTime(LocalDateTime.now());
        appDao.save(app);
        Integer i = app.getId();

        AppWhitelist ab = new AppWhitelist();
        ab.setAppId(i);
        ab.setIpAddress(i);
        appWhitelistDao.save(ab);
        return i.toString();
    }
}
