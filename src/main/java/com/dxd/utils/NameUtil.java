package com.dxd.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class NameUtil {

	/**
	 * 获取uuid
	 * @return String
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 获取年月日命名
	 * @return String
	 */
	public static String getYMD() {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
		return  fmt.format(new Date());
	}

	/**
	 * 获取文件扩展名
	 * @param name
	 * @return String
	 * @throws Exception
	 */
	public static String getFileExtName(String name) throws Exception{
		String fileExtName = name.substring(name.lastIndexOf("."));
		return fileExtName;
	}

}
