package com.tms.smp.feign;

import com.tms.api.vo.HomePageModuleVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cloud-biz")
public interface SmpFeign {
    @GetMapping("/king/home/{id}")
    HomePageModuleVo getHomePageModuleVo(@PathVariable("id") String id);
}
