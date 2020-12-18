package cn.hang.mapper;

import cn.hang.domain.Score;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScoreDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}