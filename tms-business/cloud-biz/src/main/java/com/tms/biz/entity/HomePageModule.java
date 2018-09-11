package com.tms.biz.entity;

import com.tms.common.base.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class HomePageModule extends BaseModel implements Serializable {

    private String name;

    private String icon;

    private String imageUrl;

    private Integer sort;

    private String content;

    private String subject;

}