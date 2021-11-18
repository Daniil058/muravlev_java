package org.example.StructuralPatterns.proxy.downloader;

import org.example.StructuralPatterns.proxy.video.Video;
import org.example.StructuralPatterns.proxy.youtubeapi.YouTubeApiClient;

import java.util.HashMap;

public class YouTubeVideoDownloader {
    private YouTubeApiClient apiClient;
    public YouTubeVideoDownloader(YouTubeApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void renderVideoPage(String videoId) {
        Video video = apiClient.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.getId());
        System.out.println("Title: " + video.getTitle());
        System.out.println("Video: " + video.getData());
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = apiClient.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.getId() + " / Title: " + video.getTitle());
        }
        System.out.println("-------------------------------\n");
    }
}
