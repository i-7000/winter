package com.cdutcm3.winter.ms.cat.service.impl;

import com.cdutcm3.winter.model.base.exception.BusinessSilentException;
import com.cdutcm3.winter.model.base.exception.ExceptionType;
import com.cdutcm3.winter.model.cat.exception.CatExceptionType;
import com.cdutcm3.winter.model.cat.vo.req.CatReqVO;
import com.cdutcm3.winter.model.cat.vo.resp.CatRespVO;
import com.cdutcm3.winter.ms.cat.dao.mysql.po.Cat;
import com.cdutcm3.winter.ms.cat.dao.mysql.repository.CatRepository;
import com.cdutcm3.winter.ms.cat.service.CatService;
import com.cdutcm3.winter.ms.cat.transfer.CatMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * *****************************************************
 *
 * @ClassName CatServiceImpl
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 2:57
 * @Version 1.0
 * *****************************************************
 **/
@Service
@Slf4j
public class CatServiceImpl implements CatService {


    @Resource
    private CatRepository catRepository;

    @Override
    public CatRespVO findById(Long id) {
        Optional<Cat> catOpt = catRepository.findById(id);
        Cat cat = catOpt.orElseThrow(() -> new BusinessSilentException(CatExceptionType.DATA_NOT_EXIST));
        CatMapper instance = CatMapper.INSTANCE;
        return instance.cat2RespVO(cat);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveCat(CatReqVO reqVO) {
        Gson gson = new Gson();
        log.info("保存示例猫 参数 ={}",gson.toJson(reqVO) );
        Cat cat = CatMapper.INSTANCE.catReq2PO(reqVO);
        cat.setId(1L);
        catRepository.save(cat);
    }
}
