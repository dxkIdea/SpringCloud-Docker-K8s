package com.dxk.spring.testing.basicKnowledge.basic;

import lombok.extern.slf4j.Slf4j;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/7/1
 * Time: 22:03
 * Description: 基础知识点
 */
@Slf4j
public class BasicTest {
    public static void main(String[] args) {
        int i = test();
        System.out.println(i);
    }

    public static int test() {
        int i = 0;
        try{
            i = 1 / 0;
        }catch (Exception ex) {
            log.error("异常");
            //throw ex;
        }
        return i;
    }
}
