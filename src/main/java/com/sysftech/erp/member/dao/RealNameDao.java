package com.sysftech.erp.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sysftech.erp.member.entity.RealName;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RealNameDao extends BaseMapper<RealName> {

    @Query(value = "from RealName  where realName = :name and idCard = :idcard")
    RealName findByNameAndId(String name, String idcard);
}
