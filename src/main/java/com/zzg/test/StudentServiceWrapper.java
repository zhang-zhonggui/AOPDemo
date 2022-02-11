package com.zzg.test;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/2/11 9:40
 */
public class StudentServiceWrapper implements StudentService {
    private StudentService studentService;

    public StudentServiceWrapper(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void add() {
        System.out.println("1");
        studentService.add();
        System.out.println("2");
    }

    @Override
    public void delete() {
        System.out.println("1");
        studentService.delete();
        System.out.println("2");
    }
}
