package com.maplesong.queryvo;

import com.maplesong.domain.Type;
import lombok.Data;

import java.util.Date;

/**
 * @program: maple
 * @description:
 * @author: Maple
 * @create: 2023-04-04 09:13
 */
@Data
public class BlogQuery {
    private Long id;
    private String title;
    private Date updateTime;
    private Boolean recommend;
    private Boolean published;
    private Long typeId;
    private Type type;
}
