package com.cdutcm3.winter.model.i7000.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * *****************************************************
 *
 * @ClassName GoodsSnapshotQuery
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/2 0002 20:27
 * @Version 1.0
 * *****************************************************
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "商品快照查询对象")
public class GoodsSnapshotQuery {


    /**
     * 商品名称
     */
    @ApiModelProperty(value = "商品名称",example = "康师傅红烧牛肉面")
    private String goodsName;


    @ApiModelProperty(value = "商品编码",example = "A1234")
    private String goodsCode;

    /**
     * 国际条码
     */
    @ApiModelProperty(value = "商品国际条码",example = "11212121")
    private String barCode;

    /**
     * 产区
     */
    @ApiModelProperty(value = "商品出产地id",example = "12")
    private String productionAreaId;

    /**
     * 产区名
     */
    @ApiModelProperty(value = "商品出产地名称",example = "四川")
    private String productionAreaName;

    /**
     * 供应商名
     */
    @ApiModelProperty(value = "供应商名称",example = "康师傅集团")
    private String supplierName;


    /**
     * 供应商编码
     */
    @ApiModelProperty(value = "供应商编码",example = "12333")
    private String supplierCode;
}
