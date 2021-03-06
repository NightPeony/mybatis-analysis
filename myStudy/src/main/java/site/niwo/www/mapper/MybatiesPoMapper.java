package site.niwo.www.mapper;


import site.niwo.www.data.mybatis.MybatiesPo;

import java.util.List;

/**
 * Created by web on 2020/5/12.
 */
public interface MybatiesPoMapper {
    MybatiesPo getPo(int id);
    int updatePo(MybatiesPo mybatiesPo);
    int insertPo(MybatiesPo mybatiesPo);
    List<MybatiesPo> getPoAll();
}
