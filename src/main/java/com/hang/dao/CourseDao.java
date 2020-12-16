package com.hang.dao;

import com.hang.domain.Course;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("CourseDao")
public interface CourseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}