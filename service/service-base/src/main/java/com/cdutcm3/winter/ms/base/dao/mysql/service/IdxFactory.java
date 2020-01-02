package com.cdutcm3.winter.ms.base.dao.mysql.service;

/**
 * *****************************************************
 *
 * @ClassName IdxFactory
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/2 0002 21:48
 * @Version 1.0
 * *****************************************************
 **/
public interface IdxFactory {


    long MAX_WORKER_ID = 1 << 9;
    long MAX_DATA_CENTER_ID = 1;

    /**
     * 返回一个数据中心id
     * @return
     */
    default long getDataCenterIdx(){
        return 0;
    }

    /**
     * 返回一个workerId
     * @return
     */
    long getWorkerIdx();
}
