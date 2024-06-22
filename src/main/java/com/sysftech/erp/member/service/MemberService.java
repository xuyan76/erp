package com.sysftech.erp.member.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sysftech.erp.member.entity.RealName;
import com.sysftech.erp.member.dao.LevelDao;
import com.sysftech.erp.member.dao.MemberDao;
import com.sysftech.erp.member.dao.MemberThirdDao;
import com.sysftech.erp.member.dao.RealNameDao;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

/**
 * 会员服务
 * Author xuyan
 * since 2024-06-15
 */
@Service
@Slf4j
public class MemberService {

    @Resource
    MemberDao memberDao;
    @Resource
    MemberThirdDao memberThirdDao;
    @Resource
    LevelDao levelDao;
    @Resource
    RealNameDao realNameDao;

    /**
     * 实名认下服务
     * @param idCard 身份证号
     * @param name 姓名
     */
    public RealName realNameVerify(String idCard, String name){
        QueryWrapper<RealName> wrapper = new QueryWrapper<>();
        wrapper.allEq(Map.of("id_card", idCard, "real_name", name));

        return realNameDao.selectOne(wrapper);
    }
}
