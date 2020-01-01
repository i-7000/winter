package com.cdutcm3.winter.ms.cat.dao.mysql.repository;

import com.cdutcm3.winter.ms.cat.dao.mysql.po.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * *****************************************************
 *
 * @ClassName CatRepository
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 3:20
 * @Version 1.0
 * *****************************************************
 **/
public interface CatRepository extends JpaRepository<Cat, Long>, JpaSpecificationExecutor<Cat> {
}
