package com.example.stringapi;

public class Counter {

    private final String content;

    Counter(String content) {
        this.content = content;
    }

    public String getReverse() {
        String reverse = "";
        for(int i = content.length() - 1; i >= 0; i--)
        {
            reverse = reverse + content.charAt(i);
        }
        return reverse;
    }
}