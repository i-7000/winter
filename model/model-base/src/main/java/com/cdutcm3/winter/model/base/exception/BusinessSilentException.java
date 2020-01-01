package com.cdutcm3.winter.model.base.exception;

import org.apache.commons.lang3.ArrayUtils;

/**
 * *****************************************************
 *
 * @ClassName BusinessSilentException
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/1 0001 3:27
 * @Version 1.0
 * *****************************************************
 **/
public class BusinessSilentException extends RuntimeException implements BusinessException {

    private int code;
    private String desc;

    public BusinessSilentException(String message) {
        super(message);
        this.code = 500;
        this.desc = message;
    }

    public BusinessSilentException(ExceptionType type, String message) {
        super(message);
        this.code = 500;
        this.desc = message;
        this.code = type.getCode();
    }

    public BusinessSilentException(ExceptionType type) {
        this(type, type.getDesc());
    }

    public BusinessSilentException(ExceptionType type, Object... args) {
        this(type, ArrayUtils.isNotEmpty(args) ? String.format(type.getDesc(), args) : type.getDesc());
    }

    public BusinessSilentException(int exceptionCode, String message) {
        super(message);
        this.code = 500;
        this.code = exceptionCode;
        this.desc = message;
    }

    public BusinessSilentException(int exceptionCode, String message, Throwable cause) {
        super(message, cause);
        this.code = 500;
        this.code = exceptionCode;
        this.desc = message;
    }

    public BusinessSilentException(String message, Throwable cause) {
        super(message, cause);
        this.code = 500;
        this.desc = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }
}
