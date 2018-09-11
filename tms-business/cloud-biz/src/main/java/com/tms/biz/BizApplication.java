package com.tms.biz;

import com.tms.common.config.MybatisConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: tms-cloud
 * @description:
 * @author: xiongzy
 * @create: 2018-08-14 16:31
 **/
@SpringBootApplication(scanBasePackageClasses = {BizApplication.class,MybatisConfiguration.class})
@EnableEurekaClient
@EnableTransactionManagement
@MapperScan(basePackages = {"com.tms.biz.mapper"})
@EnableFeignClients
public class BizApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizApplication.class, args);
    }

}
