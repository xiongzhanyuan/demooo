package com.tms.api.vo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class HomePageModuleVo {

    private String id;

    private LocalDateTime createTime;

    private LocalDateTime modifyTime;

    private String createUser;

    private String modifyUser;

    private Integer flagDelete;

    private String name;

    private String icon;

    private String imageUrl;

    private Integer sort;

    private String content;

    private String subject;

}