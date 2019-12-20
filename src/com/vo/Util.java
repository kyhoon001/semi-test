package com.vo;

import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class Util {
	// 받아온 데이터를 서버에 이미지를 올린다.
		public static void saveFile(MultipartFile mf) {
			String dir = "C:\\spring\\header\\web\\images\\";
			byte [] data;
			String imgname = mf.getOriginalFilename();
			try {
				data = mf.getBytes();
				FileOutputStream fo = 
						new FileOutputStream(dir+imgname);
				fo.write(data);
				fo.close();
			}catch(Exception e) {
				
			}
			
		}
}
