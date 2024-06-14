package com.sysftech.erp.member.service;

import com.sysftech.erp.member.repository.LevelRepository;
import com.sysftech.erp.member.repository.MemberRepository;
import com.sysftech.erp.member.repository.MemberThirdRepository;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
}
