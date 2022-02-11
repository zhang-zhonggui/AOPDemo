package com.zzg.test3;

import com.zzg.test.StudentService;
import com.zzg.test.StudentServiceImpl;
import com.zzg.test2.StudentServiceProxy;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：zzg
 * @description：动态代理
 * @date ：2022/2/11 9:42
 */
public class JavaTest {
    @Test
    public void test(){
        StudentServiceImpl student = new StudentServiceImpl();
        /**内部类防止其他类访问*/
        class xx implements InvocationHandler {
            @Override
            /**                   代理函数       原有类函数       传递参数       */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /*** 动态代理 私人订制的模板方*/
                System.out.println(1);
                method.invoke(student,args);
                System.out.println(2);
                return null;
            }
        }
        xx xx = new xx();
        /**
         * student.getClass().getClassLoader()获取类的
         * student.getClass().getInterfaces()获取类的接口
         */
        Proxy.newProxyInstance(student.getClass().getClassLoader(),student.getClass().getInterfaces(),xx);


    }
}
