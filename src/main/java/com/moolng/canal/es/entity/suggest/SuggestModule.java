package com.moolng.canal.es.entity.suggest;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 李权
 * @description
 * @date 2020/6/4 15:58
 */
@Data
public class SuggestModule implements Serializable {
    
    private static final long serialVersionUID = 4423441189202225229L;
    
    Shards shards;
    List<MyindexSuggest> myindexSuggest;
    
}
