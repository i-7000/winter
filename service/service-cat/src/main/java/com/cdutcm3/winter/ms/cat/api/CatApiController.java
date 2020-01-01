package com.cdutcm3.winter.ms.cat.api;

import com.cdutcm3.winter.model.cat.vo.req.CatReqVO;
import com.cdutcm3.winter.model.cat.vo.resp.CatRespVO;
import com.cdutcm3.winter.ms.cat.service.CatService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import static com.cdutcm3.winter.model.base.global.ApiTextHelper.BR;
import static com.cdutcm3.winter.model.base.global.ApiTextHelper.DEVELOPER;


/**
 * *****************************************************
 *
 * @ClassName CatController
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 2:56
 * @Version 1.0
 * *****************************************************
 **/
@Api(tags = "示例猫Controller")
@RestController
@RequestMapping("soa/cat")
@Slf4j
public class CatApiController {

    @Resource
    private CatService catService;


    @ApiOperation(value = "查询示例猫", notes = DEVELOPER + "7000" + BR + "查询示例猫")
    @GetMapping("/findById")
    public CatRespVO findCatById(@ApiParam(example = "1",name = "id") @RequestParam("id")Long id){
        return catService.findById(id);
    }

    @ApiOperation(value = "保存示例猫", notes = DEVELOPER + "7000" + BR + "保存示例猫")
    @PostMapping("/save")
    public Boolean saveCat(@RequestBody CatReqVO vo){
        catService.saveCat(vo);
        return Boolean.TRUE;
    }
}
