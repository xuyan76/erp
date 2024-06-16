package com.sysftech.erp.member.repository;

import com.sysftech.erp.member.entity.RealName;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RealNameRepository extends CrudRepository<RealName, Long> {

    @Query(value = "from RealName  where realName = :name and idCard = :idcard")
    Optional<RealName> findByNameAndId(String name, String idcard);
}
