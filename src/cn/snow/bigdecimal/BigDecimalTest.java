package cn.snow.bigdecimal;

import java.math.BigDecimal;

import org.junit.Test;

public class BigDecimalTest {

	@Test
	public void test1() {
		BigDecimal bigDecimal = new BigDecimal("100");
		BigDecimal bigDecimal2 = new BigDecimal(2);
		System.out.println(bigDecimal);
		System.out.println(bigDecimal.doubleValue());
		System.out.println(bigDecimal.divide(bigDecimal2));
	}
	@Test
	public void test2(){
		BigDecimal big =new BigDecimal(0.10);
		System.out.println(big.compareTo(new BigDecimal(0)));;
	}
}
