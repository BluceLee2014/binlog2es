package com.moolng.canal.es.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 李权
 * @description
 * @date 2020/6/3 10:26
 */
@Slf4j
@Configuration
public class ElasticSearchConfig {

    @Value("${moolng.es.config.host}")
    private String host;
    @Value("${moolng.es.config.port}")
    private int port;
//    @Value("${com.sheyipai.elasticsearch.username}")
//    private String userName;
//    @Value("${com.sheyipai.elasticsearch.password}")
//    private String password;
    
    
//    @Bean
//    public RestClient restClient() {
//        log.info("==> init RestClient");
//        final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//        credentialsProvider.setCredentials(AuthScope.ANY,
//                new UsernamePasswordCredentials(userName, password));
//        RestClient restClient = RestClient.builder(new HttpHost(host, port, "http"))
//                .setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
//                    @Override
//                    public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
//                        return httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
//                    }
//                }).build();
//        return restClient;
//    }

    @Bean
    public RestClient restClient() {
        log.info("==> init RestClient");
        RestClient restClient = RestClient.builder(new HttpHost(host, port, "http"))
                .build();
        return restClient;
    }

}
