package com.hooli.zhihu.api.controller;

import com.hooli.zhihu.api.common.Result;
import com.hooli.zhihu.api.entity.RoundTable;
import com.hooli.zhihu.api.service.RoundTableService;
import com.hooli.zhihu.api.service.SpecialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @PackgeName: com.hooli.zhihu.api.controller
 * @ClassName: RoundTableController
 * @Author: redhood
 * Date: 2020/1/17 19:37
 * project name: zhihu-api
 * @Version:
 * @Description:
 */
@RestController
@RequestMapping(value = "/api/roundtable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    @GetMapping
    public Result getAllTable(){
        return Result.success(roundTableService.qureyAllRoundTable());
    }

}
