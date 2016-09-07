package com.util;

/**
 * 常量
 * @author ZHOU
 *
 */
public class ConfigUtil {

	/**
	 * 用户登录session
	 */
	public final static String SESSION_USER = "user";
	
	/**
	 * 手机验证码cookie
	 */
	public final static String COOKIE_PHONE = "phone";
	public final static String COOKIE_PIN = "pin";
	
	/**
	 * 角色
	 */
	public final static int ROLE_ADMIN = 1;
	public final static int ROLE_AGENT = 2;
	public final static int ROLE_RETAILER = 3;
	public final static int ROLE_INDIVIDUAL = 4;
	public final static int ROLE_STAFF = 5;
	
	/**
	 * 上传图片视频的相对路径
	 */
	public final static String UPLOAD_DIR = "uploads/";
	
	/**
	 * 商品销售属性名称，颜色分类/规格
	 */
	public final static String SALESATTR_SERIALNO = "颜色分类";
	public final static String SALESATTR_SPEC = "规格";
}
