package com.sysftech.erp.contract.repository;

import com.sysftech.erp.contract.entity.Contract;
import org.springframework.data.repository.CrudRepository;

public interface ContractRepository extends CrudRepository<Contract, Long> {
}
