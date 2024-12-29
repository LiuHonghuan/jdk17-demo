package com.honghuan.demo.case5;

/**
 * @author honghuan.Liu
 * @date 2024/12/29 下午1:33
 */
public class Case5 {
    
    public static void main(String[] args) {
        String fruit = getFruit();
        switch (fruit) {
            case "apple" -> handleApple();
            case "banana" -> handleBanana();
            case "cherry" -> handleCherry();
            default -> System.out.println("未识别的水果");
        }
    }

    public static String getFruit() {
        return "apple";
    }

    public static void handleApple() {
        System.out.println("处理苹果的逻辑，比如清洗苹果");
    }

    public static void handleBanana() {
        System.out.println("处理香蕉的逻辑，比如剥开香蕉");
    }

    public static void handleCherry() {
        System.out.println("处理樱桃的逻辑，比如去核");
    }
}
