package com.honghuan.demo.case1;

/**
 * @author honghuan.Liu
 * @date 2024/12/28 下午6:18
 */
public class Case1 {


    public static void main(String[] args) {
        // 之前的写法
        String str0 = "aaa\nbbb\nccc";
        System.out.println(str0);
        
        System.out.println("==========");
        // 新特性文件块
        String str1 = """ 
                aaa
                bbb
                ccc
                """;
        System.out.println(str1);
    }
}
