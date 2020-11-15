package com.moolng.canal.es.service;


import com.moolng.canal.es.entity.dto.index.MoolngIndexDTO;

/**
 * @author 306548063@qq.com
 * @Desc
 * @date 2020/11/15 17:06
 */
public interface ISyncESService {

    void add(MoolngIndexDTO moolngIndexDTO) throws Exception;

    void remove(MoolngIndexDTO moolngIndexDTO);

    void update(MoolngIndexDTO moolngIndexDTO);

}
