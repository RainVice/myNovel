package com.rainvice.mynovel.core.common.req;

import lombok.Data;

/**
 * 分页请求数据格式封装，所有分页请求的 Dto 类都应继承该类
 *
 * @author xiongxiaoyang
 * @date 2022/5/11
 */
@Data
public class PageReqDto {

    /**
     * 请求页码，默认第 1 页
     * */
    private int pageNum = 1;

    /**
     * 每页大小，默认每页 10 条
     * */
    private int pageSize = 10;

    /**
     * 是否查询所有，默认不查所有
     * 为 true 时，pageNum 和 pageSize 无效
     * */
    private boolean fetchAll = false;
    
}
