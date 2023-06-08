package com.jb.cattoys.exceptions;

import lombok.Getter;

@Getter
public enum MsgExcep {

    CAT_EXIST("Cannot add cat , already exist"),
    ID_NOT_EXISTS("Cannot find cat"),
    WEIGHT_NOT_GOOD("Weight caanot be negative"),
    ID_NOT_MATCH("Cannot change id");

    private String msg;

    MsgExcep(String msg) {
        this.msg = msg;
    }
}
