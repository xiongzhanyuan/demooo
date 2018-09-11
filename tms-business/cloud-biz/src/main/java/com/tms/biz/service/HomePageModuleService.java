package com.tms.biz.service;

import com.tms.biz.entity.HomePageModule;
import com.tms.biz.mapper.HomePageModuleMapper;
import com.tms.biz.vo.HomePageVo;
import com.tms.common.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-14 17:39
 **/
@Service
public class HomePageModuleService extends BaseService<HomePageModuleMapper, HomePageModule> {

    @Autowired
    private HomePageModuleMapper homePageModuleMapper;




}
