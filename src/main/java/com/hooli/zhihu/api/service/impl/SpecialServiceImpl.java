package com.hooli.zhihu.api.service.impl;

import com.hooli.zhihu.api.entity.Special;
import com.hooli.zhihu.api.mapper.SpecialMapper;
import com.hooli.zhihu.api.service.SpecialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @PackgeName: com.hooli.zhihu.api.service.impl
 * @ClassName: SpecialServiceImpl
 * @Author: redhood
 * Date: 2020/1/16 9:39
 * project name: zhihu-api
 * @Version:
 * @Description:
 */
@Service
public class SpecialServiceImpl implements SpecialService {
    @Resource
    private SpecialMapper specialMapper;

    @Override
    public List<Map> selectAll() {
        return specialMapper.selectAll();
    }

    @Override
    public List<Special> selectRecent() {
        return specialMapper.selectRecent();
    }
}
