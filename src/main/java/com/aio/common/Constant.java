package com.aio.common;

public class Constant {
	/**
	 * 用户登录信息正确 200
	 */
	public static String CORRECT_USER = "200";

	/**
	 * 错误的登陆信息（账号密码错误）201
	 */
	public static String INCORRECT_PASSWORD = "201";
	
	/**
	 * 错误的用户类型 505
	 */
	public static String INCORRECT_USER_TYPE = "505";

	/**
	 * 无授权的访问 401.4
	 */
	public static String PERMISSION_DENIED = "401.4";

	/**
	 * 无数据 404
	 */
	public static String DATA_ERROR = "404";

	/**
	 * 连接数据库失败 500
	 */
	public static String CONNECT_ERROR = "500";

	/**
	 * 未知错误
	 */
	public static String UNDEFINED_ERROR = "-1";

}
