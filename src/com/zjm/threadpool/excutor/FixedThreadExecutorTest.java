package com.zjm.threadpool.excutor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 通过实现Runnable接口，实现多线程
 * Runnable类是有run()方法的；
 * 但是没有start方法
 * 参考：
 * 
http://blog.csdn.net/qq_31753145/article/details/50899119

 * */

public class FixedThreadExecutorTest{
     

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        //创建一个可重用固定线程数的线程池
        ExecutorService pool=Executors.newFixedThreadPool(2);
        
        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口;
        
        
        Thread t1=new MyThread();
        
        Thread t2=new MyThread();
        
        Thread t3=new MyThread();
        
        Thread t4=new MyThread();
        
        Thread t5=new MyThread();
        
        //将线程放到池中执行；
        
        pool.execute(t1);

        pool.execute(t2);

        pool.execute(t3);

        pool.execute(t4);

        pool.execute(t5);
        
        //关闭线程池
        
       pool.shutdown();
        
     

    }

}