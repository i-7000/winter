package com.cdutcm3.winter.ms.base.dao.mysql.config;

import com.cdutcm3.winter.ms.base.dao.mysql.service.IdService;
import com.cdutcm3.winter.ms.base.dao.mysql.service.IdxFactory;
import com.cdutcm3.winter.ms.base.dao.mysql.service.ZooKeeperIdxFactory;
import org.apache.curator.framework.CuratorFramework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * *****************************************************
 *
 * @ClassName BaseConfiguration
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/2 0002 21:59
 * @Version 1.0
 * *****************************************************
 **/
@Configuration
@Component
@Import({
        ZooKeeperConfiguration.class,
})
public class BaseConfiguration {

    @Resource
    private CuratorFramework curatorFramework;

    @Bean
    IdxFactory idxFactory() {
        return new ZooKeeperIdxFactory(curatorFramework);
    }

    @Bean
    IdService idService() {
        return new IdService(idxFactory());
    }

}
