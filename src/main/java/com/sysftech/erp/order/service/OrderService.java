package com.sysftech.erp.order.service;

import com.sysftech.erp.order.dao.OrderDao;
import com.sysftech.erp.order.dao.OrderDetailDao;
import com.sysftech.erp.order.dao.OrderPayDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    OrderDao orderDao;
    OrderDetailDao  orderDetailDao;
    OrderPayDao orderPayDao;
}
