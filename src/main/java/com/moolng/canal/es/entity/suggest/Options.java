package com.moolng.canal.es.entity.suggest;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 李权
 * @description
 * @date 2020/6/4 16:02
 */
@Data
public class Options implements Serializable {
    
    private static final long serialVersionUID = -9105894161309884593L;
    
    private String text;
    private String index;
    private String type;
    private String id;
    private double score;
    private Source source;
    
}
