package kang.demo.demo;

import kang.demo.demo.mapper.StudentMapper;
import kang.demo.demo.pojo.Student;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
//@MapperScan("kang.demo.demo.mapper")
class DemoApplicationTests {
    @Resource
    StudentMapper sm;

    @Test
    void contextLoads() {
        System.out.println(sm.findByName("t"));
    }
    @Test
    void insertsome(){
        Student student = new Student(4,"jack","male","/image/3.jpg");

        sm.insertStudent(student);
    }

}
