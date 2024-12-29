package com.honghuan.demo.case3;

/**
 * @author honghuan.Liu
 * @date 2024/12/29 上午11:49
 */
public final class EmailNotification extends Notification {

    private String subject;
    private String content;


    public EmailNotification(String recipient, String subject, String content) {
        super(recipient);
        this.subject = subject;
        this.content = content;
    }

    @Override
    void send() {
        System.out.println("向 " + getRecipient() + " 发送邮箱通知，主题: " + subject + "，内容: " + content);
    }
}
