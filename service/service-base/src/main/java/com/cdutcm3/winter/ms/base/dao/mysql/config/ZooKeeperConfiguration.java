package com.cdutcm3.winter.ms.base.dao.mysql.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *****************************************************
 *
 * @ClassName ZooKeeperConfiguration
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/2 0002 21:43
 * @Version 1.0
 * *****************************************************
 **/
@Slf4j
@Configuration
public class ZooKeeperConfiguration {

    @Bean(destroyMethod = "close")
    CuratorFramework curator(@Value("${winter.zookeeper.url}") String zookeeperUrl) {
        log.info("zookeeper url = {}", zookeeperUrl);
        CuratorFramework client = CuratorFrameworkFactory.builder().connectString(zookeeperUrl)
                .retryPolicy(new RetryNTimes(Integer.MAX_VALUE, 1000))
                .connectionTimeoutMs(8000).build();
        client.start();
        return client;
    }
}
