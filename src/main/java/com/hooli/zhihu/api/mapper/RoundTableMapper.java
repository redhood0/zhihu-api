package com.hooli.zhihu.api.mapper;

import com.hooli.zhihu.api.entity.RoundTable;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @PackgeName: com.hooli.zhihu.api.mapper
 * @ClassName: RoundTableMapper
 * @Author: redhood
 * Date: 2020/1/17 19:31
 * project name: zhihu-api
 * @Version:
 * @Description:
 */
public interface RoundTableMapper {
    @Select("select * from t_round_table limit 0 , 100")
    List<RoundTable> qureyAllRoundTable();
}
