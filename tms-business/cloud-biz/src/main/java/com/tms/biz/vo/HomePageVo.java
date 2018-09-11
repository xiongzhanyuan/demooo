package com.tms.biz.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class HomePageVo implements Serializable {

    private String id;

    private String name;

    private String icon;

    private String imageUrl;

    private Integer sort;

    private String content;

    private String subject;

    private Date createTime;

    private Date modifyTime;

    private Integer flagDelete;


}