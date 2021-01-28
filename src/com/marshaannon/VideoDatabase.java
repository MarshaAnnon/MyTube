package com.marshaannon;

public class VideoDatabase {
    public void store(Video video) {
        System.out.println("Storing video metadata in SQL database...");
        System.out.println("Title " + video.getTitle());
        System.out.println("File Name " + video.getFileName());
        System.out.println("Done! \n");
    }
}
