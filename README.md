
com.example.server.api.TestApi 提供对外的sofa rpc接口，该接口在收到rpc请求后，会将收到的内容通过rocketmq发送消息

启动类：com.example.server.ClientApplication

# 提示
application.yml 配置需要根据实际情况进行替换
+ `com.alipay.sofa.rpc.registry.address` 为sofa-registry地址
+ `rocketmq.producer.namesrvAddr` 为rocket的namesrv地址
+ `rocketmq.producer.group` 为rocket的group配置

使用命令：`mvn clean package spring-boot:repackage` 可打包可执行文件

在打jar包的时候，需要修改下 pom.xml 中plugin中配置，将注释的内容放开，否则打出来的jar包不能被正确引用
