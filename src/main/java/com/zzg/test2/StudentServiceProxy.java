package com.zzg.test2;

import com.zzg.test.StudentService;
import com.zzg.test.StudentServiceImpl;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/2/11 11:00
 */
public class StudentServiceProxy implements StudentService {

    private StudentService studentService = new StudentServiceImpl();

    @Override
    public void add() {
        System.out.println("1");
        studentService.add();
        System.out.println(2);
    }

    @Override
    public void delete() {
        System.out.println(1);
        studentService.add();
        System.out.println(2);
    }
}
