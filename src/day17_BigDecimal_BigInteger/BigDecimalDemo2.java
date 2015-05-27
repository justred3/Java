package day17_BigDecimal_BigInteger;

import java.math.BigDecimal;

/*
 * 构造方法：
 * 		public BigDecimal(String val)
 * 
 * public BigDecimal add(BigDecimal augend)
 * public BigDecimal subtract(BigDecimal subtrahend)
 * public BigDecimal multiply(BigDecimal multiplicand)
 * public BigDecimal divide(BigDecimal divisor)
 * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
 */
public class BigDecimalDemo2 {
	public static void main(String[] args) {
		// System.out.println(0.09 + 0.01);
		// System.out.println(1.0 - 0.32);
		// System.out.println(1.015 * 100);
		// System.out.println(1.301 / 100);

		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		System.out.println("add:" + bd1.add(bd2));
		System.out.println("-------------------");

		BigDecimal bd3 = new BigDecimal("1.0");
		BigDecimal bd4 = new BigDecimal("0.32");
		System.out.println("subtract:" + bd3.subtract(bd4));
		System.out.println("-------------------");

		BigDecimal bd5 = new BigDecimal("1.015");
		BigDecimal bd6 = new BigDecimal("100");
		System.out.println("multiply:" + bd5.multiply(bd6));
		System.out.println("-------------------");

		BigDecimal bd7 = new BigDecimal("1.301");
		BigDecimal bd8 = new BigDecimal("100");
		System.out.println("divide:" + bd7.divide(bd8));
		//舍入远离零的舍入模式。
		System.out.println("divide:"
				+ bd7.divide(bd8, 3, BigDecimal.ROUND_UP));
		// 接近零的舍入模式。
		System.out.println("divide:"
				+ bd7.divide(bd8, 3, BigDecimal.ROUND_DOWN));
		//  接近正无穷大的舍入模式。
		System.out.println("divide:"
				+ bd7.divide(bd8, 3, BigDecimal.ROUND_CEILING));
		//接近负无穷大的舍入模式。
		System.out.println("divide:"
				+ bd7.divide(bd8, 3, BigDecimal.ROUND_FLOOR));
		//向“最接近的”数字舍入，如果与两个相邻数字的距离相等，则为向上舍入的舍入模式。
		System.out.println("divide:"
				+ bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_UP));
		//向“最接近的”数字舍入，如果与两个相邻数字的距离相等，则为上舍入的舍入模式。
		System.out.println("divide:"
				+ bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_DOWN));
		//向“最接近的”数字舍入，如果与两个相邻数字的距离相等，则向相邻的偶数舍入。
		System.out.println("divide:"
				+ bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_EVEN));
		System.out.println("divide:"
				+ bd7.divide(bd8, 8, BigDecimal.ROUND_HALF_UP));
	}
}