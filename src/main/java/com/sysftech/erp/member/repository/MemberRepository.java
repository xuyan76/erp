package com.sysftech.erp.member.repository;

import com.sysftech.erp.member.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
