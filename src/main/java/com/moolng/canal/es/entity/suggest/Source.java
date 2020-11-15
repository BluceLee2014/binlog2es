package com.moolng.canal.es.entity.suggest;

import lombok.Data;

import java.io.Serializable;

@Data
public class Source implements Serializable {
	
	private static final long serialVersionUID = 6501362699465908840L;
	
	private int id;
	private String content;
	private NameSuggest nameSuggest;
	private Integer isPicappraisal;
	private Integer isContrast;

}
