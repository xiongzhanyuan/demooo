package com.tms.biz.controller;

import cn.hutool.core.lang.Assert;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tms.biz.entity.HomePageModule;
import com.tms.biz.service.HomePageModuleService;
import com.tms.common.base.BaseController;
import com.tms.common.base.BasePage;
import com.tms.common.message.BaseResponse;
import com.tms.common.message.DataResponse;
import com.tms.common.message.PageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.ssl.HandshakeOutStream;

@RestController
@RequestMapping("home")
public class HomePageModuleController extends BaseController {

    @Autowired
    private HomePageModuleService homePageModuleService;

    @PostMapping("/fetchList")
    public BaseResponse getLoanInfo(@RequestBody BasePage<HomePageModule> homePageModuleBasePage){

        HomePageModule homePageModule = homePageModuleBasePage.getRequestData();

        IPage requestPage = new Page(homePageModuleBasePage.getPageNo(), homePageModuleBasePage.getPageSize());

        IPage resultPage = homePageModuleService.selectPage(requestPage, new QueryWrapper<HomePageModule>().lambda()
                .like(HomePageModule::getName, homePageModule.getName()).orderByAsc(HomePageModule :: getSort));


        return new PageResponse<HomePageModule>(resultPage.getCurrent(), requestPage.getTotal(), requestPage.getRecords());
    }

}
