package com.zzg.test;

/**
 * @author ：zzg
 * @description：
 * @date ：2022/2/11 9:38
 */
public class StudentServiceImpl implements StudentService{
    @Override
    public void add() {
        System.out.println("添加学生");
    }

    @Override
    public void delete() {
        System.out.println("减少学生");
    }
}
