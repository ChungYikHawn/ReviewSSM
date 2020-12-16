package com.hang.dao;

import com.hang.domain.Classes;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("ClassesDao")
public interface ClassesDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
}