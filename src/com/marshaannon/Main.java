package com.marshaannon;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Happy Birthday Yerrhum!");
        video.setUser(new User("marsha@gmail.com"));
    }
}
