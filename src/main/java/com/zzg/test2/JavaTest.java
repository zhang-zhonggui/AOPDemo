package com.zzg.test2;

import com.zzg.test.StudentService;
import com.zzg.test.StudentServiceImpl;
import com.zzg.test.StudentServiceWrapper;
import org.junit.Test;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/2/11 9:42
 */
public class JavaTest {
    @Test
    public void test(){
       StudentServiceProxy studentServiceProxy=new StudentServiceProxy();
       studentServiceProxy.add();
    }
}
