package com.honghuan.demo.case3;

/**
 * @author honghuan.Liu
 * @date 2024/12/29 上午11:48
 */
public abstract sealed class Notification permits SmsNotification, EmailNotification {

    private String recipient;

    // 构造函数
    public Notification(String recipient) {
        this.recipient = recipient;
    }

    // 获取接收者
    public String getRecipient() {
        return recipient;
    }

    // 抽象方法，用于发送通知
    abstract void send();

}
