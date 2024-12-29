package com.honghuan.demo.case4;

/**
 * @author honghuan.Liu
 * @date 2024/12/29 下午12:14
 */
public class Case4 {

    public static void main(String[] args) {
        
        // 之前 instanceof 使用
        Object obj = 1;
        if (obj instanceof Integer) {
            Integer obj1 = (Integer) obj;
            System.out.println(obj1);
        } else if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str);
        }
        
        // instanceof增强
        Object obj2 = "2";
        if (obj2 instanceof Integer obj11) {
            System.out.println(obj11);
        } else if (obj2 instanceof String obj22) {
            System.out.println(obj22);
        }
    }
}
