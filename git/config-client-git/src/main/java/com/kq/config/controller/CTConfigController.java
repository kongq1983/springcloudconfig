package com.kq.config.controller;

import com.kq.config.configbean.CTConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CTConfigController
 *
 * @author kq
 * @date 2019/3/10
 */
@RestController
@RequestMapping("/ct")
public class CTConfigController {

    @Autowired
    private CTConfig config;

    @GetMapping("/config")
    public CTConfig getCTConfig(){

        return config;

    }

}
