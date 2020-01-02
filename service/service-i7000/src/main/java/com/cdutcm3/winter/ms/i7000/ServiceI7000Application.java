package com.cdutcm3.winter.ms.i7000;

import com.cdutcm3.winter.ms.base.dao.mysql.config.BaseConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringCloudApplication
@Import({
        BaseConfiguration.class,
//        ClusterMongoConfiguration.class
})
@EnableJpaRepositories("com.cdutcm3.winter.ms.i7000.dao")
@EnableFeignClients
@EnableSwagger2
@EnableAsync
public class ServiceI7000Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceI7000Application.class, args);
    }

}
