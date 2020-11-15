package com.moolng.canal.es.entity.suggest;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 李权
 * @description
 * @date 2020/6/4 16:01
 */
@Data
public class MyindexSuggest implements Serializable {
    
    private String text;
    private int offset;
    private int length;
    private List<Options> options;
    
}
