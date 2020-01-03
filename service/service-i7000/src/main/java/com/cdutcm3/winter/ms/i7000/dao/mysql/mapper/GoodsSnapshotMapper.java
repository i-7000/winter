package com.cdutcm3.winter.ms.i7000.dao.mysql.mapper;

import com.cdutcm3.winter.model.i7000.vo.req.GoodsSnapshotQuery;
import com.cdutcm3.winter.model.i7000.vo.resp.GoodsSnapshotRespVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * *****************************************************
 *
 * @ClassName GoodsSnapshotMapper
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/2 0002 20:02
 * @Version 1.0
 * *****************************************************
 **/
@Mapper
public interface GoodsSnapshotMapper {

    /**
     * 根据商品唯一id查询商品
     * @param query
     * @return
     */
    List<GoodsSnapshotRespVO> findByGoodsId(@Param("query") GoodsSnapshotQuery query);
}
