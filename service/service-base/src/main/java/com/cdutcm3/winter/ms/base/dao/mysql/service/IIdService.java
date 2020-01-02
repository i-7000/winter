package com.cdutcm3.winter.ms.base.dao.mysql.service;

import java.util.UUID;

/**
 * *****************************************************
 *
 * @ClassName IIdService
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/2 0002 21:46
 * @Version 1.0
 * *****************************************************
 **/
public interface IIdService {

    Long nextLongId();

    String nextStringId();

    default String nextUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
