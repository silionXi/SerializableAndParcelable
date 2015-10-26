package com.silion.serializableandparcelable;

import java.io.Serializable;

/**
 * Created by silion on 2015/10/14.
 */
public class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1759681796198207841L;

    private String str;
    private int i;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
