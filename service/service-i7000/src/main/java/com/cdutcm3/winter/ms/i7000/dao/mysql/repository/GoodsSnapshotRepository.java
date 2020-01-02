package com.cdutcm3.winter.ms.i7000.dao.mysql.repository;

import com.cdutcm3.winter.ms.i7000.dao.mysql.po.GoodsSnapshot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * *****************************************************
 *
 * @ClassName GoodsSnapshotRepository
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/2 0002 13:51
 * @Version 1.0
 * *****************************************************
 **/
public interface GoodsSnapshotRepository extends JpaRepository<GoodsSnapshot,Long> , JpaSpecificationExecutor<GoodsSnapshot> {
}
