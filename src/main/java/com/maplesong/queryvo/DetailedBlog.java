package com.maplesong.queryvo;

import lombok.Data;

import java.util.Date;

/**
 * @program: maple
 * @description:
 * @author: Maple
 * @create: 2023-04-04 14:33
 */
@Data
public class DetailedBlog {
    //博客信息
    private Long id;
    private String firstPicture;
    private String flag;
    private String title;
    private String content;
    private Integer views;
    private Integer commentCount;
    private Date updateTime;
    private boolean commentabled;
    private boolean shareStatement;
    private boolean appreciation;
    private String nickname;
    private String avatar;

    //分类名称
    private String typeName;
}
