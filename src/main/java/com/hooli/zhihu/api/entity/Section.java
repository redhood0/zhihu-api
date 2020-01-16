package com.hooli.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @PackgeName: com.hooli.zhihu.api.entity
 * @ClassName: Section
 * @Author: redhood
 * Date: 2020/1/15 22:14
 * project name: zhihu-api
 * @Version:
 * @Description:
 */
@Data
@Builder
public class Section {

    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
