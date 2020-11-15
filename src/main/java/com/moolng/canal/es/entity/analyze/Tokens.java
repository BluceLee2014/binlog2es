package com.moolng.canal.es.entity.analyze;

import lombok.Data;

import java.io.Serializable;

@Data
public class Tokens implements Serializable {
	
	private static final long serialVersionUID = 4420147069256290843L;
	
	private String token;
	private int startOffset;
	private int endOffset;
	private String type;
	private int position;
}
