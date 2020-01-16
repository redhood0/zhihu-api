package com.hooli.zhihu.api.controller;

import com.hooli.zhihu.api.common.Result;
import com.hooli.zhihu.api.service.SpecialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @PackgeName: com.hooli.zhihu.api.controller
 * @ClassName: SpecialController
 * @Author: redhood
 * Date: 2020/1/16 9:42
 * project name: zhihu-api
 * @Version:
 * @Description:
 */
@RestController
@RequestMapping(value = "/api/special")
public class SpecialController {
    @Resource
    private SpecialService specialService;
@GetMapping
    public Result getRecent(){
        return Result.success(specialService.selectRecent());
    }
    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(specialService.selectAll());
    }


}
