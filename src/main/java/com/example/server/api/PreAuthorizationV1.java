package com.example.server.api;

/**
 * 账单预授权，返回授权码 V1
 */
public interface PreAuthorizationV1 {

    /**
     * 账单预授权，返回授权码
     *
     * @return 授权码
     */
    String authorization();
}
