package com.hackathon.social.rest;

public class NotFoundException extends SocialCodeException {
    private int code;

    public NotFoundException(int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
