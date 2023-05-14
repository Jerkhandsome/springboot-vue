package kang.demo.demo.service;


import com.alibaba.fastjson.JSON;
import kang.demo.demo.mapper.StudentMapper;
import kang.demo.demo.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class StudentService {
    @Resource
    StudentMapper studentMapper;
    public List<Student> findAllStudents(){
        List<Student> allStudent = studentMapper.findAllStudent();
        return allStudent;
    }
    public List<Student> findByName(String name){
        List<Student> students = studentMapper.findByName(name);
        return students;
    }
    public void insertStudent(String studentJson){
        Student student = JSON.parseObject(studentJson, Student.class);
        studentMapper.insertStudent(student);
    }
    public void deleteStudentById(int id){
        studentMapper.deleteById(id);
    }
    public void updateById(String studentJson){
        Student student = JSON.parseObject(studentJson, Student.class);
        studentMapper.updateById(student);

    }
}
