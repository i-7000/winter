package com.cdutcm3.winter.model.cat.vo.req;

import com.cdutcm3.winter.model.base.enums.GenderEnum;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * *****************************************************
 *
 * @ClassName CatReqVO
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 2:43
 * @Version 1.0
 * *****************************************************
 **/
@Data
@ApiModel(description = "测试猫请求对象")
public class CatReqVO {

    @ApiModelProperty(value = "测试猫名称",example = "Tom")
    private String name;

    @ApiModelProperty(value = "测试猫性别")
    private GenderEnum gender;

    @ApiModelProperty(value = "测试猫年龄",example = "12")
    private Integer age;
}
