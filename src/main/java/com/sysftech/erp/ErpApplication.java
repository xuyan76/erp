package com.sysftech.erp;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sysftech.erp.**.dao")
public class ErpApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(ErpApplication.class, args);
	}

}
