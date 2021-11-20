package org.example.StructuralPatterns.proxy;

import org.example.StructuralPatterns.proxy.downloader.YouTubeVideoDownloader;

public class Application {
    public static void main(String[] args) throws Exception {
        ProxyService proxyService = new ProxyService();
        YouTubeVideoDownloader df = proxyService.exec("улучшенный");
    }
}
