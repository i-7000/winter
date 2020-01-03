package com.cdutcm3.winter.ms.i7000.service;

import com.cdutcm3.winter.model.cat.vo.resp.CatRespVO;
import com.cdutcm3.winter.model.i7000.vo.req.GoodsSnapshotQuery;
import com.cdutcm3.winter.model.i7000.vo.resp.GoodsSnapshotRespVO;

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
public interface GoodsSnapshotService {

    /**
     * 查询示例猫
     * @param id
     * @return
     */
    CatRespVO findCatById(Long id);

    /**
     * 保存商品快照
     */
    void saveGoodsSnapshot();

    /**
     * 查询商品快照
     * @param query
     * @return
     */
    List<GoodsSnapshotRespVO> findGoodsSnapshot(GoodsSnapshotQuery query);
}
