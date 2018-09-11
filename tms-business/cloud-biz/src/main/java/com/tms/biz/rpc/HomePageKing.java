package com.tms.biz.rpc;

import cn.hutool.core.bean.BeanUtil;
import com.tms.api.vo.HomePageModuleVo;
import com.tms.biz.entity.HomePageModule;
import com.tms.biz.service.HomePageModuleService;
import com.tms.common.message.BaseResponse;
import com.tms.common.message.DataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-16 17:53
 **/
@RestController
@RequestMapping("king/home")
public class HomePageKing {

    @Autowired
    private HomePageModuleService homePageModuleService;

    @GetMapping("/{id}")
    public HomePageModuleVo getInfo(@PathVariable String id) {

        HomePageModule homePageModule = homePageModuleService.selectById(id);

        HomePageModuleVo homePageModuleVo = new HomePageModuleVo();
        BeanUtil.copyProperties(homePageModule, homePageModuleVo);

        return homePageModuleVo;

    }
}

