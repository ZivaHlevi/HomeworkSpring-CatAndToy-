package com.jb.cattoys.exceptions;

public class CatSystemExp extends Exception{
    public CatSystemExp(MsgExcep msg) {
        super(msg.getMsg());
    }
}
