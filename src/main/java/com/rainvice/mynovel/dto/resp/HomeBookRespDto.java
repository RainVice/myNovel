package com.rainvice.mynovel.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : [Rainvice]
 * @version : [v1.0]
 * @className : HomeBookRespDto
 * @description : [首页小说推荐响应dto]
 * @createTime : [2023/5/26 13:56]
 * @updateUser : [Rainvice]
 * @updateTime : [2023/5/26 13:56]
 * @updateRemark : [描述说明本次修改内容]
 */

@Data
public class HomeBookRespDto {


    /**
     * 类型;0-轮播图 1-顶部栏 2-本周强推 3-热门推荐 4-精品推荐
     */
    @Schema(description = "类型;0-轮播图 1-顶部栏 2-本周强推 3-热门推荐 4-精品推荐")
    private Integer type;

    /**
     * 小说ID
     */
    @Schema(description = "小说ID")
    private Integer bookId;

    /**
     * 小说封面地址
     */
    @Schema(description = "小说封面地址")
    private String picUrl;

    /**
     * 小说名
     */
    @Schema(description = "小说名")
    private String bookName;



}
