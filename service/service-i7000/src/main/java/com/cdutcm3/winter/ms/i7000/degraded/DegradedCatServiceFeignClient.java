package com.cdutcm3.winter.ms.i7000.degraded;

import com.cdutcm3.winter.model.cat.vo.resp.CatRespVO;
import com.cdutcm3.winter.ms.i7000.feign.CatServiceFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * *****************************************************
 *
 * @ClassName DegradedCatServiceFeignClient
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/2 0002 14:01
 * @Version 1.0
 * *****************************************************
 **/
@Slf4j
@Component
public class DegradedCatServiceFeignClient implements CatServiceFeignClient {

    @Override
    public CatRespVO findCatById(Long id) {
        log.error("feign 调用查询示例猫报错 id = {}",id);
        return null;
    }
}
