package com.pinyougou.sellergoods.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Smile
 * Created at 2019/2/1
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public void test(){
        System.out.println("xxxxxxxxxx");
    }
}
