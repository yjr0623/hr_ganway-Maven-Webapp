package com.ganway.hr.common;

import java.util.HashMap;
import java.util.Map;

public class TypeInfoUtils {
	
	public static Map<String,String> getMap(String type_id,String type){
		
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("type_id",type_id);
		map.put("type", type);
		
		return map;
	}
	
	public static String formatMH(String str){
		if(str == null){
			return null;
		}
		return "%"+str.trim()+"%";
	}

}
