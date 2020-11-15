package com.moolng.canal.utils.es;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ElasticSearchHandleUtilsTest {

    @Autowired
    ElasticSearchHandleUtils elasticSearchHandleUtils;

    @Test
    void add() {
        String requestBody = "{\"id\":2,\"name\":\"python\",\"createDate\":\"2020-11-15\",\"teams\":[\"A\",\"B\"]}";
        try {
            elasticSearchHandleUtils.add(requestBody, "/moolng_001/_doc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}