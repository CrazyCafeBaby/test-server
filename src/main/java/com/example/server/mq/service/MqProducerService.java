package com.example.server.mq.service;

/**
 * 消息生产者接口类
 */
public interface MqProducerService {

    /**
     * 发送消息
     * @param msg 消息内容
     * @return 成功与否
     * @throws Exception 异常
     */
    boolean sendMessage(String msg) throws Exception;
}
