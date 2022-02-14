package com.yunixi.community.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticConfig {

    @Bean
    public RestHighLevelClient client() {
        return new RestHighLevelClient(
            RestClient.builder(
                    new HttpHost("localhost", 9200, "http")
                    /**여러 host를 설정할 때 ','로 아래와 같이 연결*/
//                    , new HttpHost("localhost", 9201, "http")
            ));
    }

}
