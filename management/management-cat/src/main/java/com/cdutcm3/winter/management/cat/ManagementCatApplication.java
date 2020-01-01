package com.cdutcm3.winter.management.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringCloudApplication
//@Import(BaseConfiguration.class)
@EnableFeignClients
@EnableSwagger2
public class ManagementCatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementCatApplication.class, args);
    }

}
