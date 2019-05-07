package com.allinpay.controller;

import com.allinpay.core.common.ResponseData;
import com.allinpay.repository.domain.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * 服务间调用
 */
@RequestMapping("/jump")
@Controller
public class RedirectController {
    @RequestMapping(value = "/test1", consumes = "application/json")
    @ResponseBody
    public void test1(String query, HttpServletResponse response) throws Exception {
//        return new ResponseData().success(query);
        response.getWriter().print("SUCCESS");
//        return "SUCCESS";
    }

    @RequestMapping(value = "/test2", consumes = "application/json")
    @ResponseBody
    public ResponseData test2(@RequestBody Admin admin) {
        System.out.println(admin);
        return new ResponseData().success(admin);
    }
}
