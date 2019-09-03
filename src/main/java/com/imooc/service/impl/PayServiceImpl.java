package com.imooc.service.impl;

import com.imooc.dto.OrderDTO;
import com.imooc.service.PayService;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {

    @Override
    public void create(OrderDTO orderDTO) {

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();

    }
}
