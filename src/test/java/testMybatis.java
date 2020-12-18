
import cn.hang.domain.Student;
import cn.hang.domain.Teacher;
import cn.hang.mapper.StudentDao;
import cn.hang.mapper.TeacherDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMybatis {

    private InputStream in=null;
    private SqlSession session =null;

    @Before
    public void getSession() throws IOException {
            in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(in);
            session = factory.openSession(true);
    }

    @After
    public void close() throws IOException {
        in.close();
        session.close();
    }
    @Test
    public void testQuery(){
        StudentDao mapper = session.getMapper(StudentDao.class);
        Student student = mapper.selectByPrimaryKey(6);
        System.out.println(student);
        session.close();
    }

    @Test
    public void testSave(){
        StudentDao mapper = session.getMapper(StudentDao.class);
        Student student=new Student();
        student.setName("卡莎");
        student.setClassId(1);
        student.setGender("男");
        int insert = mapper.insert(student);
        System.out.println(insert);
    }

    @Test
    public void testUpdate(){
        StudentDao mapper = session.getMapper(StudentDao.class);
        Student student=new Student();
        student.setId(8);
        student.setName("卡萨丁");
        int i = mapper.updateByPrimaryKeySelective(student);
        System.out.println(i);
    }


    @Test
    public void testAssociation(){
        StudentDao mapper = session.getMapper(StudentDao.class);
        List<Student> students = mapper.testAssociation();
        for (Student student:students
             ) {
            System.out.println(student);
        }
    }

    @Test
    public void testCollection(){
        TeacherDao mapper = session.getMapper(TeacherDao.class);
        List<Teacher> teachers = mapper.testCollection();
        for (Teacher teacher:teachers
             ) {
            System.out.println(teacher);
        }
    }
}
