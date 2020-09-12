package com.messager2;

public abstract class Channel {
    private String destination;

    public Channel(String destination) {
        this.destination = destination;
    }
}
