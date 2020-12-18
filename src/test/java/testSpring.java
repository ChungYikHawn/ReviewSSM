import cn.hang.configuration.SpringConfiguration;
import cn.hang.mapper.TeacherDao;
import cn.hang.service.TeacherService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testSpring {

    @Autowired
    private TeacherDao teacherDao;



    @Test
    public void main1() {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        TeacherService teacherService = applicationContext.getBean("teacherService", TeacherService.class);
        teacherService.test();
    }

}
