package Day1;

import org.junit.Test;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午4:46:29 
 * 类说明 
 */
public class junit2 {
	public int getMax(){
		int a = 2;
		int b = 5;
		int max = a>b?a:b;
		
		return max;
	}
	@Test
	public static int getMin(){
		int a = 2;
		int b = 5;
		int min = a<b?a:b;
		System.out.println("最小值："+min);
		return min;
	}
}
