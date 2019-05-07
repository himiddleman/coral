package com.allinpay.controller;

import com.allinpay.core.common.ResponseData;
import com.allinpay.repository.domain.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * restTemplate服务调用测试
 */
@Controller
@RequestMapping("callservice")
public class EncryptController {
    @GetMapping("/testGet1/{id}")
    @ResponseBody
    public ResponseData testGet1(@PathVariable("id") String id) {
        return new ResponseData().success("带参数id：" + id);
    }

    @GetMapping("/testGet2")
    @ResponseBody
    public ResponseData testGet2() {
        return new ResponseData().success("不带参数");
    }

    @GetMapping("/testGet3/{id}/{name}")
    @ResponseBody
    public ResponseData testGet3(@PathVariable("id") String id,
                                 @PathVariable("name") String name) {
        return new ResponseData().success("带参数id：" + id + "name：" + name);
    }

    @GetMapping("/testGet4")
    @ResponseBody
    public ResponseData testGet4(String id, String name) {
        return new ResponseData().success("带参数id：" + id + "name：" + name);
    }

    @PostMapping("/testPost1/{id}")
    @ResponseBody
    public ResponseData testPost1(@PathVariable("id") String id, @RequestBody Admin admin) {
        System.out.println("id：" + id + " " + admin.toString());
        return new ResponseData().success("id：" + id + " " + admin.toString() + "保存成功");
    }

    @PostMapping("/testPost2")
    @ResponseBody
    public ResponseData testPost2(@RequestBody String id) {
        return new ResponseData().success("id：" + id + "保存成功");
    }

    @PutMapping("/testPut/{kid}")
    @ResponseBody
    public void testPut(@PathVariable("kid") String kid,
                        @RequestBody String id) {
        System.out.println("kid:" + kid);
        System.out.println("id:" + id);
    }

    @DeleteMapping("/testDelete/{id}")
    @ResponseBody
    public void testDelete(@PathVariable("id") String id) {
        System.out.println(id);
    }
}
