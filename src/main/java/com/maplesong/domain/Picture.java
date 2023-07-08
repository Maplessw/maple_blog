package com.maplesong.domain;

import lombok.Data;

/**
 * @program: maple
 * @description: 相册实体类
 * @author: Maple
 * @create: 2023-04-02 15:13
 */
@Data
public class Picture {
    private Long id;
    private String picturename;
    private String picturetime;
    private String pictureaddress;
    private String picturedescription;
}
