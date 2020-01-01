package com.cdutcm3.winter.model.cat.vo.resp;

import com.cdutcm3.winter.model.base.enums.GenderEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * *****************************************************
 *
 * @ClassName CatRespVO
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 3:21
 * @Version 1.0
 * *****************************************************
 **/
@Data
@ApiModel(description = "测试猫响应对象")
public class CatRespVO {

    @ApiModelProperty(value = "主键id",example = "122222222")
    private Long id;

    @ApiModelProperty(value = "测试猫名称",example = "Tom")
    private String name;

    @ApiModelProperty(value = "测试猫性别")
    private GenderEnum gender;

    @ApiModelProperty(value = "测试猫年龄",example = "12")
    private Integer age;

    @ApiModelProperty(value = "创建时间",example = "2020-01-01 12:12:12")
    private String createTime;
}
