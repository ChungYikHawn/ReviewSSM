package com.hang.dao;

import com.hang.domain.Score;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("ScoreDao")
public interface ScoreDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}