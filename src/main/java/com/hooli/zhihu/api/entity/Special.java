package com.hooli.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @PackgeName: com.hooli.zhihu.api.entity
 * @ClassName: Special
 * @Author: redhood
 * Date: 2020/1/15 22:03
 * project name: zhihu-api
 * @Version:
 * @Description:
 */
@Data
@Builder
public class Special {
    private String specialId;
    private String title;
    private String introduction;
    private String banner;
    private Integer viewCount;
    private Integer followerCount;
    private Date updated;
}
