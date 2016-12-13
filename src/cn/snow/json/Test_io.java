package cn.snow.json;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/** 
 * @author  323098-wangpngtao: 
 * @date 创建时间：2016年4月13日 上午9:25:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Test_io {

	public static void main(String[] args) {
		// 创建对象
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(new FileInputStream("StringDemo.java"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 一次读取一个字符
		// int ch = 0;
		// while ((ch = isr.read()) != -1) {
		// System.out.print((char) ch);
		// }
		// 一次读取一个字符数组
		char[] chs = new char[1024];
		int len = 0;
		try {
			while ((len = isr.read(chs)) != -1) {
				System.out.print(new String(chs, 0, len));
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 释放资源
		try {
			isr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
