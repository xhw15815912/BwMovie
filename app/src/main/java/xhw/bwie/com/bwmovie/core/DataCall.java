package xhw.bwie.com.bwmovie.core;

import xhw.bwie.com.bwmovie.core.exception.ApiException;

/**
 * 作者：夏洪武
 * 时间：2019/1/18.
 * 邮箱：
 * 说明：
 */
public interface DataCall<T> {
    void success(T data);
    void fail(ApiException e);
}
