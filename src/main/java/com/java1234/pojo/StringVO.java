package com.java1234.pojo;

import java.io.Serializable;

public class StringVO implements Serializable {
    private String value;

    public StringVO() {
    }

    public StringVO(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
