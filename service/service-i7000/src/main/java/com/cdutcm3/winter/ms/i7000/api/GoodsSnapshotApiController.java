package com.cdutcm3.winter.ms.i7000.api;

import com.cdutcm3.winter.model.cat.vo.resp.CatRespVO;
import com.cdutcm3.winter.model.i7000.vo.req.GoodsSnapshotQuery;
import com.cdutcm3.winter.model.i7000.vo.resp.GoodsSnapshotRespVO;
import com.cdutcm3.winter.ms.i7000.service.GoodsSnapshotService;
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
 * @ClassName ApiController
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/2 0002 9:52
 * @Version 1.0
 * *****************************************************
 **/
@Api(tags = "GoodsApiController")
@RestController
@RequestMapping("soa/goods")
@Slf4j
public class GoodsSnapshotApiController {

    @Resource
    private GoodsSnapshotService goodsSnapshotService;

    @ApiOperation(value = "查询示例猫", notes = DEVELOPER + "7000" + BR + "查询示例猫")
    @GetMapping("/findCatById")
    public CatRespVO findCatById(@ApiParam(example = "1",name = "id") @RequestParam("id")Long id){
        return goodsSnapshotService.findCatById(id);
    }

    @ApiOperation(value = "保存商品快照", notes = DEVELOPER + "7000" + BR + "保存商品快照")
    @PostMapping("/saveGoodsSnapshot")
    public void saveGoodsSnapshot(){
        goodsSnapshotService.saveGoodsSnapshot();
    }

    @ApiOperation(value = "查询商品快照", notes = DEVELOPER + "7000" + BR + "查询商品快照")
    @PostMapping("/findGoodsSnapshot")
    public GoodsSnapshotRespVO findGoodsSnapshot(@RequestBody GoodsSnapshotQuery query){
        return goodsSnapshotService.findGoodsSnapshot(query);
    }
}
