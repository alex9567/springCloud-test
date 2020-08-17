package com.chen.openFeign.common;


public class ResultTest<T> {
    private String code;
    private String msg;
    private T data;

    public ResultTest() {
    }

    public ResultTest(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultTest(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ResultTest<T> createResult(ResultEnum resultEnum, T data) {
        return new ResultTest(resultEnum.getCode(), resultEnum.getMessage(), data);
    }

    public static <T> ResultTest<T> createResult(String code, String message, T data) {
        return new ResultTest(code, message, data);
    }

    public static <T> ResultTest<T> success() {
        return createResult(ResultEnum.SUCCESS, null);
    }

    public static <T> ResultTest<T> success(T data) {
        return createResult(ResultEnum.SUCCESS, data);
    }

    public static <T> ResultTest<T> error() {
        return createResult(ResultEnum.ERROR, null);
    }

    public static <T> ResultTest<T> customError(ResultEnum resultEnum) {
        return createResult(resultEnum, null);
    }

    public static <T> ResultTest<T> customError(String code, String message) {
        return createResult(code, message, null);
    }

    public static <T> ResultTest<T> customError(ResultEnum resultEnum, T data) {
        return createResult(resultEnum, data);
    }

    public static <T> ResultTest<T> customError(String code, String message, T data) {
        return createResult(code, message, data);
    }
}
