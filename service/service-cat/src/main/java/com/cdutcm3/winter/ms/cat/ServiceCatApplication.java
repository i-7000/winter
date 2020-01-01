package com.cdutcm3.winter.ms.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringCloudApplication
@Import({
//        BaseConfiguration.class,
//        XxlJobConfig.class,
//        CxfConfig.class,
//        ClusterMongoConfiguration.class
})
@EnableJpaRepositories("com.cdutcm3.winter.ms.cat.dao")
//@EnableElasticsearchRepositories(basePackages = "cn.wine")
@EnableFeignClients
@EnableSwagger2
//@EnableConfigurationProperties({MongoClientProperties.class})
public class ServiceCatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCatApplication.class, args);
    }

}
