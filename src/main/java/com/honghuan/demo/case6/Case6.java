package com.honghuan.demo.case6;

/**
 * @author honghuan.Liu
 * @date 2024/12/29 下午1:44
 */
public class Case6 {

    public static void main(String[] args) {
        Order order = new Order();
        String productName = order.getProduct().getProductInfo().getProductName();
        System.out.println(productName);
    }
}
