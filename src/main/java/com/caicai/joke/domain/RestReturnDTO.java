package com.caicai.joke.domain;

/**
 * @author caic
 * @description
 * @see
 * @since
 */
public class RestReturnDTO<T> {
    private Integer code;
    private String message;
    private T result;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
