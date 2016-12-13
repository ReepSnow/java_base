package cn.snow.base64_md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import Decoder.BASE64Encoder;

public class BASE64 {
	public static void main(String[] args) throws NoSuchAlgorithmException {

		BASE64 demo = new BASE64();
		System.out.println(demo.md5AndBase());
	}
	public String md5AndBase() throws NoSuchAlgorithmException{
		String value = "000000";
		MessageDigest md = MessageDigest.getInstance("md5");
		byte md5[] = md.digest(value.getBytes());
		BASE64Encoder encode = new BASE64Encoder();
		return encode.encode(md5);
	}
	public void scanner(){
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.next();
		System.out.println(scanner.nextInt());
	}
}
