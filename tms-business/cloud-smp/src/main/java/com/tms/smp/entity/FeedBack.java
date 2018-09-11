package com.tms.smp.entity;

import com.tms.common.base.BaseModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class FeedBack extends BaseModel implements Serializable {


    private static final long serialVersionUID = -334251689904061495L;

    private String openId;

    private String nickName;

    private Integer type;

    private String content;

    private String phone;

}