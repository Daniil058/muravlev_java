package org.example.StructuralPatterns.proxy;

import org.example.StructuralPatterns.proxy.youtubeapi.CacheProxyYouTubeApiClient;
import org.example.StructuralPatterns.proxy.youtubeapi.ThirdPartyYouTubeApiClient;
import org.example.StructuralPatterns.proxy.youtubeapi.YouTubeApiClient;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProxyServiceTest {

    @Test
    public void test() throws Exception {
        ProxyService proxyService = new ProxyService();
        YouTubeApiClient youTubeVD= new ThirdPartyYouTubeApiClient();
        assertEquals(youTubeVD.getClass(),
                proxyService.exec("обычный").getApiClient().getClass());

        youTubeVD= new CacheProxyYouTubeApiClient();
        assertEquals(youTubeVD.getClass(),
                proxyService.exec("улучшенный").getApiClient().getClass());
    }
}
