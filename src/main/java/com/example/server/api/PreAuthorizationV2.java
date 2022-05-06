package com.example.server.api;

/**
 * 账单预授权，返回授权码 V2
 */
public interface PreAuthorizationV2 {

    /**
     * 账单预授权，返回授权码
     *
     * @return 授权码
     */
    String authorization();
}
