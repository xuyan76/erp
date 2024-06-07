package com.sysftech.erp.system.repository;

import com.sysftech.erp.system.entriy.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
