package org.example.StructuralPatterns.proxy;

import org.example.StructuralPatterns.proxy.downloader.YouTubeVideoDownloader;
import org.example.StructuralPatterns.proxy.youtubeapi.CacheProxyYouTubeApiClient;
import org.example.StructuralPatterns.proxy.youtubeapi.ThirdPartyYouTubeApiClient;

public class ProxyService {
    public YouTubeVideoDownloader exec(String typeDownloader) throws Exception {
        YouTubeVideoDownloader downloader;
        switch (typeDownloader.toUpperCase()){
            case ("ОБЫЧНЫЙ"):
                downloader = new YouTubeVideoDownloader(new ThirdPartyYouTubeApiClient());
                break;
            case ("УЛУЧШЕННЫЙ"):
                downloader = new YouTubeVideoDownloader(new CacheProxyYouTubeApiClient());
                break;
            default:
                throw new Exception("Данный тип загрузчика не найден.");
        }
        call(downloader);
        return downloader;
    }

    private void call(YouTubeVideoDownloader downloader) {
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("catzzzzzzzzz");
    }
}
