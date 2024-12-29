package com.honghuan.demo.case3;

/**
 * @author honghuan.Liu
 * @date 2024/12/29 下午12:00
 */
public class Case3 {

    public static void main(String[] args) {
        // 创建一个短信通知
        SmsNotification smsNotification = new SmsNotification("138xxxxxxxx", "您有一个新的订单！");
        smsNotification.send();

        // 创建一个邮箱通知
        EmailNotification emailNotification = new EmailNotification("example@example.com", "重要通知", "请查收最新的产品更新。");
        emailNotification.send();
    }
}
