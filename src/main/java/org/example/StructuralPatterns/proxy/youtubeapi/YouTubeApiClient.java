package org.example.StructuralPatterns.proxy.youtubeapi;

import org.example.StructuralPatterns.proxy.video.Video;

import java.util.HashMap;

public interface YouTubeApiClient {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
