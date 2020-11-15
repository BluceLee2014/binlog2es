package com.moolng.canal.es.entity.analyze;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AnalyzeModel implements Serializable {
	
	private static final long serialVersionUID = 7635132801472306361L;
	
	List<Tokens> tokens;
 
}
