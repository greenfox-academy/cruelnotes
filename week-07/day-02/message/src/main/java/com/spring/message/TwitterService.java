package com.spring.message;

public class TwitterService implements MessageService {

    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Twitter sent to " + recipient + " with message = " + message);
    }
}
