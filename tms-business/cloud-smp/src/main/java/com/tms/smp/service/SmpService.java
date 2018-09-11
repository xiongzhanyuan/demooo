package com.tms.smp.service;

import com.alibaba.fastjson.JSONObject;
import com.tms.api.vo.HomePageModuleVo;
import com.tms.common.base.BaseService;
import com.tms.common.message.DataResponse;
import com.tms.smp.entity.FeedBack;
import com.tms.smp.feign.SmpFeign;
import com.tms.smp.mapper.FeedBackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-20 10:39
 **/
@Service
public class SmpService extends BaseService<FeedBackMapper, FeedBack> {

    @Autowired
    private SmpFeign smpFeign;
    @Autowired
    private FeedBackMapper feedBackMapper;

    public DataResponse getSmpHomePage() {

        FeedBack feedBack = feedBackMapper.selectById("1");

        HomePageModuleVo homePageModuleVo = smpFeign.getHomePageModuleVo("08c9e1f06d1d495aadb3ffe99a0fde42");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("feedBack", feedBack);
        jsonObject.put("homePageModule", homePageModuleVo);

        return new DataResponse(jsonObject);

    }

}
