package com.hooli.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @PackgeName: com.hooli.zhihu.api.entity
 * @ClassName: RoundTable
 * @Author: redhood
 * Date: 2020/1/17 19:30
 * project name: zhihu-api
 * @Version:
 * @Description:
 */
@Data
@Builder
public class RoundTable {
    private String name;
    private String banner;
    private String visitsCount;

}
