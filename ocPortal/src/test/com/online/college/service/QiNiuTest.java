package com.online.college.service;

import com.online.college.common.storage.QiniuStorage;
import com.online.college.common.storage.ThumbModel;
import com.online.college.common.util.CommonUtil;
import junit.framework.TestCase;
import org.apache.log4j.Logger;

import java.io.File;

public class QiNiuTest extends TestCase {
	Logger log = Logger.getLogger(AppTest.class);
	
	public void testImages() {
		//测试上传图片
		byte[] buff = CommonUtil.getFileBytes(new File("C:\\Users\\User\\Desktop\\ocProject\\ocPortal\\src\\main\\webapp\\res\\i\\c4.jpg"));
		String key = QiniuStorage.uploadImage(buff);
		System.out.println("key = " + key);
		
//		String key = "/default/all/0/7bca6c72a47f4856b626979a126f1bbb.png";
//		String key = "/c1.jpg";
//		//测试下载图片
//		String url = QiniuStorage.getUrl(key);
//		System.out.println("url = " + url);
//
//		//测试下载不同大小的图片
//		url = QiniuStorage.getUrl(key, ThumbModel.THUMB_256);
//		System.out.println("url = " + url);
		
	}
}

