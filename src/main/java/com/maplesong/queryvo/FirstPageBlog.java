package com.maplesong.queryvo;

import lombok.Data;

import java.util.Date;

/**
 * @program: maple
 * @description:
 * @author: Maple
 * @create: 2023-04-04 13:38
 */
@Data
public class FirstPageBlog {
    //博客信息
    private Long id;
    private String title;
    private String firstPicture;
    private Integer views;
    private Integer commentCount;
    private Date updateTime;
    private Date createTime;
    private String description;

    //分类名称
    private String typeName;

    //用户名
    private String nickname;
    //用户头像
    private String avatar;
}
