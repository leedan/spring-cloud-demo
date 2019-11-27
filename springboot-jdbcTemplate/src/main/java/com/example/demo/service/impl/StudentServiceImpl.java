package com.example.demo.service.impl;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public int add(Student student) {
        return this.studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return this.studentDao.update(student);
    }

    @Override
    public int deleteBysno(String sno) {
        return this.studentDao.deleteBysno(sno);
    }

    @Override
    public List<Map<String, Object>> queryStudentListMap() {
        return this.studentDao.queryStudentsListMap();
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return this.studentDao.queryStudentBySno(sno);
    }
}
