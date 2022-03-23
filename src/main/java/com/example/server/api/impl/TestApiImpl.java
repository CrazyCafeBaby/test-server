package com.example.server.api.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.example.server.api.TestApi;
import com.example.server.mq.service.MqProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SofaService(interfaceType = TestApi.class, bindings = { @SofaServiceBinding(bindingType = "bolt") })
@Component
public class TestApiImpl implements TestApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestApiImpl.class);

    @Autowired
    private MqProducerService mqProducerService;

    public String sendMessage(String msg) {
        System.out.println("abc");

        try {
            mqProducerService.sendMessage(msg);
        } catch (Exception e) {
            LOGGER.info("发送异常，e", e);
        }
        return msg;
    }
}
