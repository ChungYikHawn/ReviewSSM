package cn.hang.mapper;

import cn.hang.domain.Classes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClassesDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
}