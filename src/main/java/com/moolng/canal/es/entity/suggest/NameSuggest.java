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
public class NameSuggest implements Serializable {
	
	private static final long serialVersionUID = -8223811312655630861L;
	
	List<String> input;
}
