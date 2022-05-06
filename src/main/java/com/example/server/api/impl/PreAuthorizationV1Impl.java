package com.example.server.api.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.example.server.api.PreAuthorizationV1;
import org.springframework.stereotype.Component;

/**
 * 账单预授权，返回授权码
 */
@SofaService(interfaceType = PreAuthorizationV1.class, bindings = { @SofaServiceBinding(bindingType = "bolt") })
@Component
public class PreAuthorizationV1Impl implements PreAuthorizationV1 {

    /**
     * @see PreAuthorizationV1#authorization()
     */
    @Override
    public String authorization() {
        return "123456";
    }
}
