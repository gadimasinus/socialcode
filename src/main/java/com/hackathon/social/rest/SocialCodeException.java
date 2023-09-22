package com.hackathon.social.rest;

public class SocialCodeException extends Exception {
    private int code;

    public SocialCodeException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
