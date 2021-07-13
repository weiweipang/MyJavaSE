package com.exp;

import org.junit.Test;

/**
 * Created by bitsino-001 on 2019/6/19.
 */
public class ExceptionTest {
    @Test
    public void test1(){
        try {
            System.out.println("try");
            return;
        }finally {
            System.out.println("finally");
            return;
        }
    }

    @Test
    public void test2(){
       int i=1;
       i = i++;
       int j = i++;
       int k = i+ ++i*i++;
        System.out.println("i=" +i);
        System.out.println("j=" +j);
        System.out.println("k=" +k);

    }
}
