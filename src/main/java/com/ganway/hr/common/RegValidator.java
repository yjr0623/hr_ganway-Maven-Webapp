package com.ganway.hr.common;

import java.util.regex.Pattern;
import org.apache.commons.lang.StringUtils;

public class RegValidator {

	public static final String REG_EMAIL = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
	public static final String REG_PHONE = "^(\\d{3,4}-)?\\d{6,8}$";
	public static final String REG_MOBILE = "^(13|14|15|17|18)\\d{9}$";
	public static final String REG_CARD = "^//d{15}|//d{18}$";

	private RegValidator(){}
	
	/**
	 * 验证字段长度
	 * </br>Created on 2016年6月8日
	 * @param txt
	 * @param length
	 * @return 符合返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean minLength(String txt,int length){
	    if(StringUtils.isBlank(txt)){
	    	return false;
	    }
	    return txt.length() > length; 
	}

	/**
	 * 验证Email
	 * </br>Created on 2016年6月8日
	 * @param email
	 * @return 符合返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isEmail(String email){
		return match(REG_EMAIL,email);
	}
	
	/**
	 * 验证电话号码
	 * </br>Created on 2016年6月8日
	 * @param phone
	 * @return 符合返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isPhone(String phone){
	    return match(REG_PHONE,phone);
	}
	
	/**
	 * 验证手机号码
	 * </br>Created on 2016年6月8日
	 * @param mobile
	 * @return 符合返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean isMobile(String mobile){
	    return match(REG_MOBILE,mobile);
	}

	/**
	 * 验证身份证
	 * </br>Created on 2016年6月8日
	 * @param cardNo
	 * @return 符合返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean idCard(String cardNo){
	    return match(REG_CARD,cardNo);
	}

	/**
	* 验证小写字母
	* </br>Created on 2016年6月8日
	* @param str 待验证的字符串
	* @return 符合返回 <b>true </b>,否则为 <b>false </b>
	*/
	public static boolean IsLowChar(String str) {
		String regex = "^[a-z]+$";
		return match(regex, str);
	}

	/**
	 * 正则表达式校验
	 * </br>Created on 2016年6月8日
	 * @param regex 正则表达式字符串
	 * @param str 要匹配的字符串
	 * @return 符合返回 <b>true </b>,否则为 <b>false </b>
	 */
	public static boolean match(String regex, String str) {
		if(StringUtils.isBlank(str)){
			return false;
		}
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(str).matches();
	}

	public static void main(String[] args) {
		System.out.println(isPhone("021-22222222"));
		System.out.println(isMobile("17921531110"));
	}
	
}