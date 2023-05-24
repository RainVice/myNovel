package com.rainvice.mynovel.core.common.exception;

import com.rainvice.mynovel.core.common.constant.ErrorCodeEnum;
import com.rainvice.mynovel.core.common.resp.RestResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.BindException;

/**
 * 通用的异常处理器
 *
 * @author xiongxiaoyang
 * @date 2022/5/11
 */
@Slf4j
@RestControllerAdvice
public class CommonExceptionHandler {

    /**
     * 处理数据校验异常
     * */
    @ExceptionHandler(BindException.class)
    public RestResp<Void> handlerBindException(BindException e){
        log.error(e.getMessage(),e);
        return RestResp.fail(ErrorCodeEnum.USER_REQUEST_PARAM_ERROR);
    }

    /**
     * 处理业务异常
     * */
    @ExceptionHandler(BusinessException.class)
    public RestResp<Void> handlerBusinessException(BusinessException e){
        log.error(e.getMessage(),e);
        return RestResp.fail(e.getErrorCodeEnum());
    }

    /**
     * 处理系统异常
     * */
    @ExceptionHandler(Exception.class)
    public RestResp<Void> handlerException(Exception e){
        log.error(e.getMessage(),e);
        return RestResp.error();
    }

}
