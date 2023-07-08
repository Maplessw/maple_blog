package com.maplesong.domain;

import lombok.Data;

import java.util.Date;

/**
 * @program: maple
 * @description:
 * @author: Maple
 * @create: 2023-04-02 09:34
 */
@Data
public class User {
    private Long id;
    private String nickname;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private Integer type;
    private Date createTime;
    private Date updateTime;
}
