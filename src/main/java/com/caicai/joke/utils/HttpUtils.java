package com.caicai.joke.utils;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author caic
 * @description
 * @see
 * @since
 */
public class HttpUtils {
    /**
     * 判断当前url是否访问正常
     * @param url
     * @return
     */
    public static boolean exist(String url) {
        try {
            URL u = new URL(url);
            HttpURLConnection huc = (HttpURLConnection) u.openConnection();
            huc.setRequestMethod("HEAD");
            huc.setConnectTimeout(5000); //视情况设置超时时间
            huc.connect();
            return huc.getResponseCode() == HttpURLConnection.HTTP_OK;
        } catch (Exception e) {
            return false;
        }
    }
}
