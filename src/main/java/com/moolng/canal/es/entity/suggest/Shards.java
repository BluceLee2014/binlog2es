package com.moolng.canal.es.entity.suggest;

import java.io.Serializable;

/**
 * @author 李权
 * @description
 * @date 2020/6/4 16:00
 */
public class Shards implements Serializable {
    private static final long serialVersionUID = 4652893711745238576L;
    
    private int total;
    private int successful;
    private int failed0;
    
}
