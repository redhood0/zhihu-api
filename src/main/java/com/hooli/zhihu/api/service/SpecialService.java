package com.hooli.zhihu.api.service;

import com.hooli.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @PackgeName: com.hooli.zhihu.api.service
 * @ClassName: SprcialService
 * @Author: redhood
 * Date: 2020/1/16 9:38
 * project name: zhihu-api
 * @Version:
 * @Description:
 */
public interface SpecialService {
    List<Map> selectAll();

    List<Special> selectRecent();

}
