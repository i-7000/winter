package com.cdutcm3.winter.ms.i7000.service.impl;

import com.cdutcm3.winter.model.cat.vo.resp.CatRespVO;
import com.cdutcm3.winter.model.i7000.vo.req.GoodsSnapshotQuery;
import com.cdutcm3.winter.model.i7000.vo.resp.GoodsSnapshotRespVO;
import com.cdutcm3.winter.ms.base.dao.mysql.service.AbstractBaseService;
import com.cdutcm3.winter.ms.i7000.dao.mysql.mapper.GoodsSnapshotMapper;
import com.cdutcm3.winter.ms.i7000.dao.mysql.po.GoodsSnapshot;
import com.cdutcm3.winter.ms.i7000.dao.mysql.repository.GoodsSnapshotRepository;
import com.cdutcm3.winter.ms.i7000.feign.CatServiceFeignClient;
import com.cdutcm3.winter.ms.i7000.service.GoodsSnapshotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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
public class GoodsSnapshotServiceImpl extends AbstractBaseService implements GoodsSnapshotService {

    @Resource
    private CatServiceFeignClient catServiceFeignClient;

    @Resource
    private GoodsSnapshotRepository goodsSnapshotRepository;

    @Resource
    private GoodsSnapshotMapper goodsSnapshotMapper;

    @Override
    public CatRespVO findCatById(Long id) {
        return catServiceFeignClient.findCatById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveGoodsSnapshot() {
        GoodsSnapshot po = new GoodsSnapshot();
        po.setBarCode("barcode1");
        po.setGoodsCode("7001");
        po.setGoodsName("7000的商品");
        po.setGoodsRegisterInfoId(idService.nextLongId());
        po.setId(idService.nextLongId());
        po.setProductionAreaId("01");
        po.setSupplierCode("8001");
        po.setSupplierName("康师傅");
        po.setProductionAreaName("四川");
        goodsSnapshotRepository.save(po);
    }

    @Override
    public List<GoodsSnapshotRespVO> findGoodsSnapshot(GoodsSnapshotQuery query) {
        return goodsSnapshotMapper.findByGoodsId(query);
    }
}
