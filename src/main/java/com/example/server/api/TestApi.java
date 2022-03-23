package com.example.server.api;

/**
 * 测试的sofa rpc接口
 */
public interface TestApi {

    /**
     * 发送消息
     *
     * @param msg 消息内容
     * @return 消息内容
     */
    String sendMessage(String msg);
}
