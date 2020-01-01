package com.cdutcm3.winter.model.base.exception;

import org.apache.commons.lang3.StringUtils;

/**
 * *****************************************************
 *
 * @ClassName ExceptionType
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 3:31
 * @Version 1.0
 * *****************************************************
 **/
public interface ExceptionType {

    int getCode();

    String getDesc();

    default String descriptionWithArgs(Object[] args) {
        return StringUtils.isNotBlank(this.getDesc()) ? String.format(this.getDesc(), args) : this.getDesc();
    }
}
