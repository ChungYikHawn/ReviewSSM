package cn.hang.service.impl;

import cn.hang.domain.Score;
import cn.hang.domain.Teacher;
import cn.hang.mapper.ScoreDao;
import cn.hang.mapper.TeacherDao;
import cn.hang.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("teacherService")
public class TeacherServiceimpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Autowired
    private ScoreDao scoreDao;

    @Override
    public void test() {
        Teacher teacher = teacherDao.selectByPrimaryKey(1);
        Score score = scoreDao.selectByPrimaryKey(1);
        System.out.println(score);
        System.out.println(teacher);
    }
}
