package com.sysftech.erp.system.service;

import com.sysftech.erp.system.dao.DictDao;
import com.sysftech.erp.system.dao.DictDetailDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DictService {
    DictDao dictDao;
    DictDetailDao dictDetailDao;

}
