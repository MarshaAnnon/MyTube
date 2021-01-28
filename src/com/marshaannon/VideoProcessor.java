package com.marshaannon;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private NotificationService notificationService;

    //Initializing private fields with the constructor (constructor injection method)
    public VideoProcessor(
            VideoEncoder encoder,
            VideoDatabase database,
            NotificationService notificationService
    ) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }

    // implementing the process method
    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notificationService.notify(video.getUser());
    }
}
