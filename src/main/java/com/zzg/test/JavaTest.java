package com.zzg.test;

import org.junit.jupiter.api.Test;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/2/11 9:42
 */

public class JavaTest {
    @Test
    public void test(){
        StudentService studentService = new StudentServiceImpl();
        StudentServiceWrapper studentServiceWrapper = new StudentServiceWrapper(studentService);
        studentServiceWrapper.add();
    }
}
