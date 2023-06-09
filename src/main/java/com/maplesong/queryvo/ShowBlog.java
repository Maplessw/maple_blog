package com.maplesong.queryvo;

import lombok.Data;

import java.util.Date;

/**
 * @program: maple
 * @description:
 * @author: Maple
 * @create: 2023-04-04 09:38
 */
@Data
public class ShowBlog {
    private Long id;
    private String flag;
    private String title;
    private String content;
    private Long typeId;
    private String firstPicture;
    private String description;
    private boolean recommend;
    private boolean published;
    private boolean shareStatement;
    private boolean appreciation;
    private boolean commentabled;
    private Date updateTime;
}
