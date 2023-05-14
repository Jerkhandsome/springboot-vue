package kang.demo.demo.mapper;

import kang.demo.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
public interface StudentMapper {
    List<Student> findAllStudent();

    List<Student> findByName(String name);

    void insertStudent(Student student);

    void deleteById(int id);

    void updateById(Student student);
}
