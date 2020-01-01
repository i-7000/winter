package com.cdutcm3.winter.ms.cat.service;

import com.cdutcm3.winter.model.cat.vo.req.CatReqVO;
import com.cdutcm3.winter.model.cat.vo.resp.CatRespVO;

/**
 * *****************************************************
 *
 * @ClassName CatService
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 2:56
 * @Version 1.0
 * *****************************************************
 **/
public interface CatService {

    CatRespVO findById(Long id);

    void saveCat(CatReqVO reqVO);
}
