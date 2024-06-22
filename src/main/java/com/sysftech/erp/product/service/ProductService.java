package com.sysftech.erp.product.service;

import com.sysftech.erp.product.repository.ProductCategoryDao;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductService {
    @Resource
    ProductCategoryDao productCategoryDao;
}
