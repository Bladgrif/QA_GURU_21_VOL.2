package com.the_internet.herokuapp.Data;

public enum Names {
    TYPOS("Typos"), FRAMES("Frames");

    private final String value;

    Names(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
