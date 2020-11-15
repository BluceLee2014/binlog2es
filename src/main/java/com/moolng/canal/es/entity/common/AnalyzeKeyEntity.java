package com.moolng.canal.es.entity.common;

import lombok.Data;

import java.util.List;

/**
 * @author 李权
 * @description
 * @date 2020/6/5 13:17
 */
@Data
public class AnalyzeKeyEntity {
    
    private int docCountErrorUpperBound;
    private int sumOtherDocCount;
    private List<BucketEntity> buckets;
    
   
}
