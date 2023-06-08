package com.jb.cattoys.exceptions;

import lombok.Getter;

@Getter
public enum MsgExcep {

    CAT_EXIST("Cannot add cat , already exist");
    private String msg;

    MsgExcep(String msg) {
        this.msg = msg;
    }
}
