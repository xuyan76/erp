package com.sysftech.erp.system.repository;

import com.sysftech.erp.system.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query(value = "from User where mobile = :mobile or email = :mobile")
    public Optional<User> findByMobileAndEmail(String mobile);


}
