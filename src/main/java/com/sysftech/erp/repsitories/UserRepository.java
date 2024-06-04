package com.sysftech.erp.repsitories;

import com.sysftech.erp.entries.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
