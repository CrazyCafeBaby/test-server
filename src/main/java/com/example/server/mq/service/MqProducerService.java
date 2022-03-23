package com.example.server.mq.service;

public interface MqProducerService {

    boolean sendMessage(String msg) throws Exception;
}
