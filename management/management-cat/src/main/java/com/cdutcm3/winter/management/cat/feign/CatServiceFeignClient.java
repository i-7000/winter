package com.cdutcm3.winter.management.cat.feign;

import com.cdutcm3.winter.management.cat.degraded.DegradedCatFeignClient;
import com.cdutcm3.winter.model.cat.vo.req.CatReqVO;
import com.cdutcm3.winter.model.cat.vo.resp.CatRespVO;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * *****************************************************
 *
 * @ClassName A
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 12:43
 * @Version 1.0
 * *****************************************************
 **/
@FeignClient(qualifier = "catFeignClient", name = "service-cat", fallback = DegradedCatFeignClient.class)
public interface CatServiceFeignClient {

    /**
     * 查询示例猫
     */
    @GetMapping("soa/cat/findById")
    CatRespVO findCatById(@ApiParam(example = "1",name = "id") @RequestParam("id")Long id);

    /**
     * 保存示例猫
     */
    @PostMapping("soa/cat/save")
    Boolean saveCat(@RequestBody CatReqVO vo);
}
