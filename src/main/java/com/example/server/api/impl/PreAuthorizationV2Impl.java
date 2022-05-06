package com.example.server.api.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.example.server.api.PreAuthorizationV1;
import com.example.server.api.PreAuthorizationV2;
import org.springframework.stereotype.Component;

/**
 * 账单预授权，返回授权码
 */
@SofaService(interfaceType = PreAuthorizationV2.class, bindings = { @SofaServiceBinding(bindingType = "bolt") })
@Component
public class PreAuthorizationV2Impl implements PreAuthorizationV2 {

    /**
     * @see PreAuthorizationV2#authorization()
     */
    @Override
    public String authorization() {
        return "654321";
    }
}
