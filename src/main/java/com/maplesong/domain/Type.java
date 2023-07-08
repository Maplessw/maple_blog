package com.maplesong.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: maple
 * @description: 分类实体类
 * @author: Maple
 * @create: 2023-04-02 15:11
 */
@Data
public class Type {
    private Long id;
    private String name;
    private List<Blog> blogs = new ArrayList<>();
}
