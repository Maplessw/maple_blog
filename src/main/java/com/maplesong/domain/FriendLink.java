package com.maplesong.domain;

import lombok.Data;

import java.util.Date;

/**
 * @program: maple
 * @description: 友链实体类
 * @author: Maple
 * @create: 2023-04-02 15:13
 */
@Data
public class FriendLink {
    private Long id;
    private String blogname;
    private String blogaddress;
    private String pictureaddress;
    private Date createTime;
}
