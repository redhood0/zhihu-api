package com.hooli.zhihu.api.mapper;

import com.hooli.zhihu.api.ZhihuApiApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @PackgeName: com.hooli.zhihu.api.mapper
 * @ClassName: SpecialMapperTest
 * @Author: redhood
 * Date: 2020/1/16 9:20
 * project name: zhihu-api
 * @Version:
 * @Description:
 */
@SpringBootTest(classes = ZhihuApiApplication.class)
class SpecialMapperTest {
    @Resource
    private SpecialMapper specialMapper;

    @Test
    void selectRecent() {
    }

    @Test
    void selectAll() {
        List<Map> sps =specialMapper.selectAll();
        sps.forEach(System.out :: println);
    }
}