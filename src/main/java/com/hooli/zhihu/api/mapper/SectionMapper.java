package com.hooli.zhihu.api.mapper;

import com.hooli.zhihu.api.entity.Section;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @PackgeName: com.hooli.zhihu.api.mapper
 * @ClassName: SectionMapper
 * @Author: redhood
 * Date: 2020/1/15 23:05
 * project name: zhihu-api
 * @Version:
 * @Description:
 */
public interface SectionMapper {
    /**
     * 根据专题id查询标签列表
     * @param specialId
     */
    @Select("SELECT * FROM t_section WHERE special_id = #{specialId}")
    List<Section> getSectionBySepcialId(String specialId);
}
