package com.cdutcm3.winter.model.cat.exception;

import com.cdutcm3.winter.model.base.exception.ExceptionType;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * *****************************************************
 *
 * @ClassName CatExceptionType
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 3:39
 * @Version 1.0
 * *****************************************************
 **/
@AllArgsConstructor
@Getter
public enum CatExceptionType implements ExceptionType {

    /**
     *
     */
    DATA_NOT_EXIST(700000,"数据不存在"),

    ;
    private int code;
    private String desc;
}
