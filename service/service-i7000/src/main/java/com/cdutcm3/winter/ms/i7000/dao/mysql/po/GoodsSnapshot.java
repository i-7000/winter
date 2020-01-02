package com.cdutcm3.winter.ms.i7000.dao.mysql.po;

import com.cdutcm3.winter.ms.base.dao.mysql.po.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * *****************************************************
 *
 * @ClassName GoodsSnapshot
 * @Description 商品快照表
 * @Author 7000
 * @Date 2020/1/2 0002 9:57
 * @Version 1.0
 * *****************************************************
 **/
@Entity
@Table(name = "y_goods_snapshot", indexes = {
        @Index(columnList = "goodsCode",name = "goods_goods_code"),
        @Index(columnList = "goodsRegisterInfoId",name = "goods_goods_register_info_id"),
})
@Setter
@Getter
public class GoodsSnapshot extends BaseEntity {

    /**
     * 商品名称
     */
    @Column(columnDefinition = "varchar(100) comment '商品名称'")
    private String goodsName;

    @Column(columnDefinition = "varchar(32) comment '供应商编码'")
    private String goodsCode;

    /**
     * 国际条码
     */
    @Column(columnDefinition = "varchar(32) comment '国际条码'")
    private String barCode;

    /**
     * 产区
     */
    @Column(columnDefinition = "varchar(32) comment '产区id'")
    private String productionAreaId;

    /**
     * 产区名
     */
    @Column(columnDefinition = "varchar(100) comment '产区名称'")
    private String productionAreaName;

    /**
     * 商品注册信息表ID
     */
    @Column(columnDefinition = "bigint comment '商品注册信息表ID'")
    private Long goodsRegisterInfoId;

    /**
     * 供应商名
     */
    @Column(columnDefinition = "varchar(100) comment '供应商名'")
    private String supplierName;


    /**
     * 供应商编码
     */
    @Column(columnDefinition = "varchar(32) comment '供应商编码'")
    private String supplierCode;

    /**
     * 删除标记()  true: 删除；false:未删除
     */
    private Boolean deleted = Boolean.FALSE;



}
