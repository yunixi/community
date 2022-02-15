package com.yunixi.community.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ESConfig {

    @Value("${ES.HOST}")
    private String hostname;

    @Value("${ES.PORT}")
    private int port;

    @Bean
    public RestHighLevelClient client() {
        return new RestHighLevelClient(
            RestClient.builder(
                    new HttpHost(hostname, port, "http")
                    /**여러 host를 설정할 때 ','로 아래와 같이 연결*/
//                    , new HttpHost("localhost", 9201, "http")
            ));
    }

}
