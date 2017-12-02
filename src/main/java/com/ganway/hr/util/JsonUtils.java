package com.ganway.hr.util;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtils {

	static ObjectMapper objectMapper;
	
	/**
	 * 转化为JSON字符串
	 * @param object
	 * @return
	 */
	public static String toJSon(Object object) {
        if (objectMapper == null) {
            objectMapper = new ObjectMapper();
        }
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

	
}
