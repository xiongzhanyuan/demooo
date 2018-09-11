package com.tms.smp.controller;

import com.tms.common.base.BaseController;
import com.tms.common.message.BaseResponse;
import com.tms.smp.feign.SmpFeign;
import com.tms.smp.service.SmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-16 17:58
 **/
@RestController
@RequestMapping("smp")
public class SmpController extends BaseController {

    @Autowired
    private SmpService smpService;

    @GetMapping("/home")
    public BaseResponse getSmpHome() {

        return smpService.getSmpHomePage();

    }

}
