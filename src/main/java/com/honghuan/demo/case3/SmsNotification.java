package com.honghuan.demo.case3;

/**
 * @author honghuan.Liu
 * @date 2024/12/29 上午11:49
 */
public final class SmsNotification extends Notification {

    private String message;


    public SmsNotification(String recipient, String message) {
        super(recipient);
        this.message = message;
    }

    @Override
    void send() {
        System.out.println("向 " + getRecipient() + " 发送短信通知: " + message);
    }
}
