package com.moolng.canal.es.entity.common;

import lombok.Data;

/**
 * @author 李权
 * @description
 * @date 2020/6/5 13:18
 */
@Data
public class BucketEntity {
    private String key;
    private int docCount;
    private AnalyzeKeyEntity analyzeKeys;
}
