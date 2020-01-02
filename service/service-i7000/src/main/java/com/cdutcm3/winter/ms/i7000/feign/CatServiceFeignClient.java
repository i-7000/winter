package com.cdutcm3.winter.ms.i7000.feign;

import com.cdutcm3.winter.model.cat.vo.resp.CatRespVO;
import com.cdutcm3.winter.ms.i7000.degraded.DegradedCatServiceFeignClient;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * *****************************************************
 *
 * @ClassName GoodsSnapshotFeignClient
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/2 0002 13:57
 * @Version 1.0
 * *****************************************************
 **/
@FeignClient(qualifier = "CatServiceFeignClient", name = "service-cat", fallback = DegradedCatServiceFeignClient.class)
public interface CatServiceFeignClient {

    /**
     * 查询示例猫
     */
    @GetMapping("soa/cat/findById")
    CatRespVO findCatById(@ApiParam(example = "1",name = "id") @RequestParam("id")Long id);
}
