package com.sysftech.erp.member.service;

import com.sysftech.erp.member.entity.RealName;
import com.sysftech.erp.member.repository.LevelRepository;
import com.sysftech.erp.member.repository.MemberRepository;
import com.sysftech.erp.member.repository.MemberThirdRepository;
import com.sysftech.erp.member.repository.RealNameRepository;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 会员服务
 *
 * Author xuyan
 * since 2024-06-15
 */
@Service
@Slf4j
public class MemberService {

    @Resource
    MemberRepository memberDao;
    @Resource
    MemberThirdRepository memberThirdDao;
    @Resource
    LevelRepository levelDao;
    @Resource
    RealNameRepository realNameDao;

    /**
     * 实名认下服务
     * @param idCard 身份证号
     * @param name 姓名
     */
    public Optional<RealName> realNameVerify(String idCard, String name){
        return realNameDao.findByNameAndId(name, idCard);
    }
}
