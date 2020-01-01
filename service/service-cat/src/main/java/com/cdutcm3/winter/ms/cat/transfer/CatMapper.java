package com.cdutcm3.winter.ms.cat.transfer;

import com.cdutcm3.winter.model.cat.vo.req.CatReqVO;
import com.cdutcm3.winter.model.cat.vo.resp.CatRespVO;
import com.cdutcm3.winter.ms.cat.dao.mysql.po.Cat;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * *****************************************************
 *
 * @ClassName CatMapper
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 3:47
 * @Version 1.0
 * *****************************************************
 **/
@Mapper
public interface CatMapper {

    CatMapper INSTANCE = Mappers.getMapper(CatMapper.class);

    @Mappings({
            @Mapping(source = "createTimestamp",target = "createTime",dateFormat = "yyyy-MM-dd HH:mm:ss"),
    })
    CatRespVO cat2RespVO(Cat cat);

    @Mappings({
//            @Mapping(source = "name",target = "name"),
    })
    Cat catReq2PO(CatReqVO vo);
}
