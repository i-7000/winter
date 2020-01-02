package com.cdutcm3.winter.ms.i7000.service.impl;

import com.cdutcm3.winter.model.cat.vo.resp.CatRespVO;
import com.cdutcm3.winter.ms.i7000.feign.CatServiceFeignClient;
import com.cdutcm3.winter.ms.i7000.service.GoodsSnapshotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * *****************************************************
 *
 * @ClassName Test
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/2 0002 9:52
 * @Version 1.0
 * *****************************************************
 **/
@Service
@Slf4j
public class GoodsSnapshotServiceImpl implements GoodsSnapshotService {

    @Resource
    private CatServiceFeignClient catServiceFeignClient;

    @Override
    public CatRespVO findCatById(Long id) {
        return catServiceFeignClient.findCatById(id);
    }
}
