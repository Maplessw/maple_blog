package com.maplesong.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: maple
 * @description:博客实体类
 * @author: Maple
 * @create: 2023-04-02 15:06
 */
@Data
public class Blog {
    private Long id;
    private String title;
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views;
    private Integer commentCount;
    private boolean appreciation;
    private boolean shareStatement;
    private boolean commentabled;
    private boolean published;
    private boolean recommend;
    private Date createTime;
    private Date updateTime;
    private String description;

    private Type type;
    private User user;
    private Long typeId;
    private Long userId;
    private List<Comment> comments = new ArrayList<>();
}
