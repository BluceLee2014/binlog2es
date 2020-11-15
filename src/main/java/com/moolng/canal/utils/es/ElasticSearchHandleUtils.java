package com.moolng.canal.utils.es;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 306548063@qq.com
 * @Desc
 * @date 2020/11/15 15:00
 */
@Component
public class ElasticSearchHandleUtils {

    @Autowired
    RequestElasticSearchUtils requestElasticSearchUtils;

    public void add(String requestBody, String uri) throws Exception {
        requestElasticSearchUtils.doPostRequest(requestBody, uri);
    }

}
