package com.moolng.canal.utils.es;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.moolng.canal.es.entity.common.HitEntity;
import com.moolng.canal.es.entity.common.SearchResultEntity;
import com.moolng.canal.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李权
 * @description
 * @date 2020/6/5 11:39
 */
public class ElasticSearchUtils {
    
    public static <T> List<T> getHitsResultList(String responseBody, Class<T> clazz){
        SearchResultEntity<T> responseEntity = (SearchResultEntity<T>) getResult(responseBody, clazz);
        List<HitEntity<T>> hits = responseEntity.getHits().getHits();
        List<T> resultList = new ArrayList<>();
        for(HitEntity<T> source : hits){
            resultList.add(source.getSource());
        }
        return resultList;
    }
    
    private static <T> SearchResultEntity<T> getResult(String responseBody, Class<T> clazz){
        return JSONObject.parseObject(responseBody, new TypeReference<SearchResultEntity<T>>(clazz) {});
    }
    
    public static <T> T str2json(String str, Class<T> clazz){
        if(CommonUtils.isNotEmpty(str)){
            return JSONObject.parseObject(str, clazz);
        }
        return null;
    }
    
    public static SearchResultEntity str2json(String str){
        return str2json(str, SearchResultEntity.class);
    }
    
}
