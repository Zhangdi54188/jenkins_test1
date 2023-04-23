package com.zd.exe.util;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExeApplication     {


    public static void main(String[] args) {
          SpringApplication.run(ExeApplication.class, args);
        System.out.println("程序执行成功");
//        System.out.println(context.getBean("simpleBean"));
//         test();
    }
//    public static void test()
//    {
//        try {
//            Process p = Runtime.getRuntime().exec(new String[] {"C:\\Program Files (x86)\\Tencent\\QQ\\Bin\\QQScLauncher.exe"});
//            p.waitFor();
//            //发布事件
//            context.publishEvent(new MyEvent("发布执行exe可执行程序事件"));
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
