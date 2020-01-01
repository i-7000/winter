package com.cdutcm3.winter.management.cat.degraded;

import com.cdutcm3.winter.management.cat.feign.CatServiceFeignClient;
import com.cdutcm3.winter.model.cat.vo.req.CatReqVO;
import com.cdutcm3.winter.model.cat.vo.resp.CatRespVO;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * *****************************************************
 *
 * @ClassName DegradedCatFeignClient
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 12:45
 * @Version 1.0
 * *****************************************************
 **/
@Slf4j
@Component
public class DegradedCatFeignClient implements CatServiceFeignClient {
    @Override
    public CatRespVO findCatById(Long id) {
        log.error("查询示例猫熔断 参数= {}",id);
        return null;
    }

    @Override
    public Boolean saveCat(CatReqVO vo) {
        Gson gson = new Gson();
        log.error("保存示例猫进入熔断 参数 = {}",gson.toJson(vo));
        return false;
    }
}
