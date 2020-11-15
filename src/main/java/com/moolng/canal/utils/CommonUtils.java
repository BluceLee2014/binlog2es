package com.moolng.canal.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.lang.Nullable;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 306548063@qq.com
 * @Desc
 * @date 2020/11/15 14:57
 */
@Slf4j
public class CommonUtils {
    public static boolean isEmpty(@Nullable Object obj) {
        return ObjectUtils.isEmpty(obj);
    }

    public static boolean isNotEmpty(@Nullable Object obj) {
        return !ObjectUtils.isEmpty(obj);
    }

    /**
     * 截取StringBuffer尾部逗号
     * @param str
     * @return
     */
    public static StringBuffer truncationComma(StringBuffer str) {
        if (',' == str.charAt(str.length() - 1)){
            str = str.deleteCharAt(str.length() - 1);
        }
        return str;
    }

    /**
     * 判断String对象的长度是非大于0
     * @param str
     * @return
     */
    public static boolean checkStringLengthGTZero(String str){
        boolean resultVal = false;
        if (str != null && str.length() > 0) {
            resultVal = true;
        }
        return resultVal;
    }

    /**
     * 集合对象copy
     * @param sourceList
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<?> sourceList2targetList(final List<T> sourceList, Class clazz) {
        List resultList = new ArrayList<>();
        try {
            for(T t : sourceList){
                Object obj = clazz.newInstance();
                BeanUtils.copyProperties(t, obj);
                resultList.add(obj);
            }
        } catch (InstantiationException | IllegalAccessException e) {
            log.error("sourceList2targetList exception ==>", e);
        }
        return resultList;
    }
}
