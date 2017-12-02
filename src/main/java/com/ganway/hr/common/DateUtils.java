package com.ganway.hr.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.poi.util.StringUtil;

/**
 * 日期、时间工具类
 * @author: user_rcy@163.com
 * <p>Created on 2015年11月4日</p>
 * @version: V1.0.0
 * @since JDK 1.8
 */
public class DateUtils {
	
	/**
	 * yyyy-MM-dd HH:mm:ss:SSS
	 */
	public static final String PATTERN_FULLDATETIME_MILLS       = "yyyy-MM-dd HH:mm:ss:SSS";
	/**
	 * yyyyMMddHHmmssSSS
	 */
	public static final String PATTERN_FULLDATETIME_MILLS_STR   = "yyyyMMddHHmmssSSS";
	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static final String PATTERN_FULLDATETIME             = "yyyy-MM-dd HH:mm:ss";
	/**
	 * yyyyMMddHHmmss
	 */
	public static final String PATTERN_FULLDATETIME_STR         = "yyyyMMddHHmmss";
	/**
	 * yyyy-MM-dd
	 */
	public static final String PATTERN_DATE                     = "yyyy-MM-dd";
	/**
	 * yyyyMMdd
	 */
	public static final String PATTERN_DATE_STR                 = "yyyyMMdd";
	/**
	 * yyyy年MM月dd日
	 */
	public final static String PATTERN_CHINESEDT                = "yyyy年MM月dd日";
	/**
	 * HH:mm:ss
	 */
	public static final String PATTERN_TIME                     = "HH:mm:ss";
	/**
	 * HHmmss
	 */
	public static final String PATTERN_TIME_STR                 = "HHmmss";

	public static final long   ONE_DAY_MILL_SECONDS             = 86400000;

	private DateUtils(){}
	
	/**
	 * 获取当前时间yyyyMMddHHmmssSSS
	 * @return
	 */
	public static String getNowDateTimeMillsStr(){
		return getNowDateTime(PATTERN_FULLDATETIME_MILLS_STR);
	}
	
	/**
	 * 获取当前时间 yyyy-MM-dd HH:mm:ss:SSS
	 * @return
	 */
	public static String getNowDateTimeMills(){
		return getNowDateTime(PATTERN_FULLDATETIME_MILLS);
	}
	
	/**
	 * 获取当前时间 yyyyMMddHHmmss
	 * @return
	 */
	public static String getNowDateTimeStr(){
		return getNowDateTime(PATTERN_FULLDATETIME_STR);
	}
	
	/**
	 * 获取当前时间 yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getNowDateTime(){
		return getNowDateTime(PATTERN_FULLDATETIME);
	}
	
	/**
	 * 获取当前日期 yyyyMMdd
	 * @return
	 */
	public static String getNowDateStr(){
		return getNowDateTime(PATTERN_DATE_STR);
	}
	
	/**
	 * 获取当前日期 yyyy-MM-dd
	 * @return
	 */
	public static String getNowDate(){
		return getNowDateTime(PATTERN_DATE);
	}
	
	/**
	 * 取得“X年X月X日”的日期格式
	 * </br>Created on 2016年2月29日
	 * @param date
	 * @return
	 */
	 public static String getChineseDateString(Date date) {
		 DateFormat dateFormat = getDateFormat(PATTERN_CHINESEDT);
		 return getDateString(date, dateFormat);
	 }
	 
	 public static String getWebFirstDayOfMonth() {
		 Calendar cal = Calendar.getInstance();
	     Date dt = new Date();

	     cal.setTime(dt);
	     cal.set(Calendar.DAY_OF_MONTH, 1);

	     DateFormat df = getDateFormat(PATTERN_DATE);

	     return df.format(cal.getTime());
	}
	
	/**
	 * 获取当前时间 HHmmss
	 * @return
	 */
	public static String getNowTimeStr(){
		return getNowDateTime(PATTERN_TIME_STR);
	}
	
	/**
	 * 获取当前时间 HH:mm:ss
	 * @return
	 */
	public static String getNowTime(){
		return getNowDateTime(PATTERN_TIME);
	}
	
	/**
	 *  获取当前时间
	 * @param pattern 日期格式
	 * @return
	 */
	public static String getNowDateTime(String pattern){
		return getDateFormat(pattern).format(new Date());
	}
	
	/**
	 * 格式化日期
	 * </br>Created on 2016年4月6日
	 * @param date
	 * @param format
	 * @return
	 */
	public static String format(Date date, String format) {
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat(format).format(date);
    }
	
	/**
	 * 将字符串转换为日期
	 * @param dateStr
	 * @param pattern
	 * @return
	 * @throws ParseException
	 */
	public static Date parseDate(String dateStr,String pattern) throws ParseException{
		if(StringUtils.isBlank(dateStr)){
			return null;
		}
		return getDateFormat(pattern).parse(dateStr);
	}
	
	/**
	 * 将日期转换为字符串
	 * </br>Created on 2015年12月13日
	 * @param date
	 * @param pattern
	 * @return
	 * @throws ParseException
	 */
	public static String parseDate(Date date,String pattern) throws ParseException{
		if(date == null || StringUtils.isBlank(pattern)){
			return "";
		}
		return getDateFormat(pattern).format(date);
	}
	
	/**
     * 计算当前时间几年之后的时间
     * @param date
     * @param years
     * @return
     */
    public static Date addYear(Date date, long years) {
        return addDays(date, years * 365);
    }
	
	/**
     * 计算当前时间几天之后的时间
     * @param date
     * @param days
     * @return
     */
    public static Date addDays(Date date, long days) {
        return addHours(date, days * 24);
    }
	
	/**
     * 计算当前时间几小时之后的时间
     * @param date
     * @param hours
     * @return
     */
    public static Date addHours(Date date, long hours) {
        return addMinutes(date, hours * 60);
    }

    /**
     * 计算当前时间几分钟之后的时间
     * @param date
     * @param minutes
     * @return
     */
    public static Date addMinutes(Date date, long minutes) {
        return addSeconds(date, minutes * 60);
    }

    /**
     * 计算当前时间几秒之后的时间
     * @param date
     * @param secs
     * @return
     */
    public static Date addSeconds(Date date, long secs) {
        return new Date(date.getTime() + (secs * 1000));
    }
	
    /**
     * 取得两个日期间隔秒数（日期1-日期2）
     * @param one 日期1
     * @param two 日期2
     * @return 间隔秒数
     */
    public static long getDiffSeconds(Date one, Date two) {
        Calendar sysDate = new GregorianCalendar();
        sysDate.setTime(one);
        Calendar failDate = new GregorianCalendar();
        failDate.setTime(two);
        return (sysDate.getTimeInMillis() - failDate.getTimeInMillis()) / 1000;
    }

    /**
     * 取得两个日期间隔分钟（日期1-日期2）
     * @param one
     * @param two
     * @return 间隔分钟
     */
    public static long getDiffMinutes(Date one, Date two) {
        Calendar sysDate = new GregorianCalendar();
        sysDate.setTime(one);
        Calendar failDate = new GregorianCalendar();
        failDate.setTime(two);
        return (sysDate.getTimeInMillis() - failDate.getTimeInMillis()) / (60 * 1000);
    }
    
    /**
     * 取得两个日期间隔小时（日期1-日期2）
     * @param one
     * @param two
     * @return 间隔小时
     */
    public static long getDiffHours(Date one, Date two) {
        Calendar sysDate = new GregorianCalendar();
        sysDate.setTime(one);
        Calendar failDate = new GregorianCalendar();
        failDate.setTime(two);
        return (sysDate.getTimeInMillis() - failDate.getTimeInMillis()) / (60 * 60 * 1000);
    }

    /**
     * 取得两个日期的间隔天数
     * @param one
     * @param two
     * @return 间隔天数
     */
    public static long getDiffDays(Date one, Date two) {
        Calendar sysDate = new GregorianCalendar();
        sysDate.setTime(one);
        Calendar failDate = new GregorianCalendar();
        failDate.setTime(two);
        return (sysDate.getTimeInMillis() - failDate.getTimeInMillis()) / (24 * 60 * 60 * 1000);
    }

    /**
     * 获得指定时间当天起点时间
     * @param date
     * @return
     */
    public static Date getDayBegin(Date date) {
        DateFormat df = getDateFormat(PATTERN_DATE_STR);
        String dateString = df.format(date);
        try {
            return df.parse(dateString);
        } catch (ParseException e) {
            return date;
        }
    }
    
    /**
     * 获取当前时间的前几天或者后几天的日期
     * @param days
     * @return
     */
    public static Date getDateNearCurrent(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, days);
        Date date = calendar.getTime();
        return date;
    }
    
    /**
     * 获取当前日期前几天
     * @param days
     * @return 前几天日期
     */
    public static String getBeforeDayString(int days) {
        Date date = new Date(System.currentTimeMillis() - (ONE_DAY_MILL_SECONDS * days));
        DateFormat dateFormat = getDateFormat(PATTERN_DATE_STR);
        return getDateString(date, dateFormat);
    }
    
    /**
     * 获取指定日期前几天
     * </br>Created on 2016年4月6日
     * @param dateString
     * @param days
     * @return
     */
    public static String getBeforeDayString(String dateString, int days) {
        Date date;
        DateFormat df = getDateFormat(PATTERN_DATE_STR);
        try {
            date = df.parse(dateString);
        } catch (ParseException e) {
            date = new Date();
        }
        date = new Date(date.getTime() - (ONE_DAY_MILL_SECONDS * days));
        return df.format(date);
    }
    
    /**
     * 获取日期格式
     * @param pattern
     * @return
     */
    public static DateFormat getDateFormat(String pattern) {
        DateFormat df = new SimpleDateFormat(pattern);
        df.setLenient(false);
        return df;
    }
    
    /**
     * 获取给定日期、格式的日期字符串
     * @param date 日期
     * @param dateFormat 格式
     * @return
     */
    public static String getDateString(Date date, DateFormat dateFormat) {
        if (date == null || dateFormat == null) {
            return null;
        }
        return dateFormat.format(date);
    }

    /**
     * 获取Web格式的当前日期(yyyy-MM-dd)
     * </br>Created on 2016年4月6日
     * @return 
     */
    public static String getWebTodayString() {
        DateFormat df = getDateFormat(PATTERN_DATE);
        return df.format(new Date());
    }
    
    /**
     * 获取Email格式的日期(yyyy年MM月dd日HH:mm:ss)
     * </br>Created on 2016年4月6日
     * @param today
     * @return
     */
    public static String getEmailDate(Date today) {
        String todayStr;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        todayStr = sdf.format(today);
        return todayStr;
    }
    
    /**
     * 判断输入的字符串是否为合法的小时
     * </br>Created on 2016年4月6日
     * @param hourStr
     * @return
     */
    public static boolean isValidHour(String hourStr) {
        if (!StringUtils.isEmpty(hourStr) && StringUtils.isNumeric(hourStr)) {
            int hour = new Integer(hourStr).intValue();
            if ((hour >= 0) && (hour <= 23)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 判断输入的字符串是否为合法的分或秒
     * </br>Created on 2016年4月6日
     * @param str
     * @return
     */
    public static boolean isValidMinuteOrSecond(String str) {
        if (!StringUtils.isEmpty(str) && StringUtils.isNumeric(str)) {
            int hour = new Integer(str).intValue();

            if ((hour >= 0) && (hour <= 59)) {
                return true;
            }
        }

        return false;
    }
    
    /**
     * 判断是否为周末
     * </br>Created on 2015年12月13日
     * @param date
     * @return true:是周末;false:非周末
     * @throws ParseException 
     */
    public static boolean isWeekend(Date date) throws ParseException{
    	String dateStr = parseDate(date,PATTERN_DATE);
		Date d = getDateFormat(PATTERN_DATE).parse(dateStr);
    	Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY||cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
        	return true;
        }else{
        	return false;
        }    	
    }
    
    /**
     * 判断是否为周末
     * </br>Created on 2015年12月13日
     * @param dateStr
     * @return true:是周末;false:非周末
     * @throws ParseException 
     */
    public static boolean isWeekend(String dateStr) throws ParseException{
		Date d = getDateFormat(PATTERN_DATE).parse(dateStr);
    	Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY||cal.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
        	return true;
        }else{
        	return false;
        }    	
    }

    /**
     * 判断指定日志是周几
     * </br>Created on 2015年12月13日
     * @param date
     * @return
     */
    public static WeekDomain getWeek(Date date){
    	Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week = cal.get(Calendar.DAY_OF_WEEK) - 1;
        return new DateUtils().new WeekDomain(week);
    }
    
    /**
     * 判断指定日志是周几
     * </br>Created on 2015年12月13日
     * @param dateStr
     * @return
     * @throws ParseException 
     */
    public static WeekDomain getWeek(String dateStr) throws ParseException{
    	Date date = parseDate(dateStr,PATTERN_DATE);
    	Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week = cal.get(Calendar.DAY_OF_WEEK) - 1;
        return new DateUtils().new WeekDomain(week);
    }
    
    class WeekDomain {
    	private int week;
    	private String desc;
    	
    	public WeekDomain(int week){
    		this.week = week;
    		this.desc = getWeekDesc(week);
    	}
    	
    	public WeekDomain(int week,String desc){
    		this.week = week;
    		this.desc = desc;
    	}
    	
		public int getWeek() {
			return week;
		}
		public void setWeek(int week) {
			this.week = week;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		
		@Override
	    public String toString() {
	        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	    }
		
		private String getWeekDesc(int week){
	    	switch(week){
	    		case 0:
	    			return "星期日";
	    		case 1:
	    			return "星期一";
	    		case 2:
	    			return "星期二";
	    		case 3:
	    			return "星期三";
	    		case 4:
	    			return "星期四";
	    		case 5:
	    			return "星期五";
	    		case 6:
	    			return "星期六";
	    		default:
	    			return "";
	    	}
	    }
    }
    
    /**
     * 判断两个日期是否同一天
     * </br>Created on 2016年2月29日
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isSameDay(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return isSameDay(cal1, cal2);
    }
    
    public static boolean isSameDay(Calendar cal1, Calendar cal2) {
        if (cal1 == null || cal2 == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        return (cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) &&
                cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR));
    }
    
    /**
     * 是否在现在时间之前
     * @param date
     * @return
     */
    public static boolean isBeforeNow(Date date) {
        if (date == null)
            return false;
        return date.compareTo(new Date()) < 0;
    }
    
    public static void main(String[] args) throws ParseException {
    	System.out.println("周末:"+isWeekend(new Date()));
		System.out.println("今天是:"+getWeek(new Date()));
	}
    
}