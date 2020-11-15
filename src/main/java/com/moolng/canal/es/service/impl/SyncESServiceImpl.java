package com.moolng.canal.es.service.impl;

import com.alibaba.fastjson.JSON;
import com.moolng.canal.es.entity.dto.index.MoolngIndexDTO;
import com.moolng.canal.es.service.ISyncESService;
import com.moolng.canal.utils.es.ElasticSearchHandleUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 306548063@qq.com
 * @Desc
 * @date 2020/11/15 17:09
 */
@Slf4j
@Service
public class SyncESServiceImpl implements ISyncESService {

    @Autowired
    ElasticSearchHandleUtils elasticSearchHandleUtils;

    @Override
    public void add(MoolngIndexDTO moolngIndexDTO) throws Exception {
        String requestBody = JSON.toJSONString(moolngIndexDTO);
        log.info("add obj to es, data ===> {}", requestBody);
        elasticSearchHandleUtils.add(requestBody, "/moolng_001/_doc/"+moolngIndexDTO.getId());
    }

    @Override
    public void remove(MoolngIndexDTO moolngIndexDTO) {

    }

    @Override
    public void update(MoolngIndexDTO moolngIndexDTO) {

    }
}
