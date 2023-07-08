package com.maplesong.queryvo;

import lombok.Data;

/**
 * @program: maple
 * @description:
 * @author: Maple
 * @create: 2023-04-04 13:39
 */
@Data
public class RecommendBlog {
    private Long id;
    private String title;
    private String firstPicture;
    private boolean recommend;
}
