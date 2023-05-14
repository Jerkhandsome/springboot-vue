package kang.demo.demo.controller;
import kang.demo.demo.pojo.Student;
import kang.demo.demo.service.StudentService;
import kang.demo.demo.vo.BaseResult;
import kang.demo.demo.vo.ResultMap;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    ResultMap resultMap;
    @Resource
    StudentService service;
    @RequestMapping("findAllStudents")
    @ResponseBody
    public Object findAllStudents(){
        resultMap.setList(service.findAllStudents());
        return resultMap;
    }
    @GetMapping("getStudent/{name}")
    @ResponseBody
    public Object findByName(@Param("name") @PathVariable String name){
        resultMap.setList(service.findByName(name));
        return resultMap;
    }
    @PostMapping("addStudent")
    @ResponseBody
    public Object addStudent(String StudentJson){
        service.insertStudent(StudentJson);
        resultMap.setMessage("学生添加成功");
        return resultMap;
    }
    @DeleteMapping("deleteByName/{id}")
    @ResponseBody
    public Object deleteById(@PathVariable int id){
        resultMap.setMessage("学生删除成功");
        service.deleteStudentById(id);
        return resultMap;
    }
    @PutMapping("updateById")
    @ResponseBody
    public Object updateById(String StudentJson){
        service.updateById(StudentJson);
        resultMap.setMessage("更新学生成功");
        return resultMap;
    }
}
