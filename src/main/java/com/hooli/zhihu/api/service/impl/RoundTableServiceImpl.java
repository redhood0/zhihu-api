package com.hooli.zhihu.api.service.impl;

import com.hooli.zhihu.api.entity.RoundTable;
import com.hooli.zhihu.api.mapper.RoundTableMapper;
import com.hooli.zhihu.api.mapper.SpecialMapper;
import com.hooli.zhihu.api.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackgeName: com.hooli.zhihu.api.service.impl
 * @ClassName: RoundTableService
 * @Author: redhood
 * Date: 2020/1/17 19:35
 * project name: zhihu-api
 * @Version:
 * @Description:
 */
@Service
public class RoundTableServiceImpl implements RoundTableService {
    @Resource
    private RoundTableMapper roundTableMapper;
    @Override
    public List<RoundTable> qureyAllRoundTable() {
        return roundTableMapper.qureyAllRoundTable();
    }
}
