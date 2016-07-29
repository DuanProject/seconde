package Day1;

import java.util.Arrays;

import org.junit.Test;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午3:47:25 
 * 类说明 
 */
public class junit1 {
	public static void main(String[] args) {
		new junit1().sort();
	}
	@Test
	public void getMax(){
		int a = 2;
		int b = 5;
		int max = a>b?a:b;
		System.out.println("最大值："+max);
	}
	@Test
	public void sort(){
		int[] arr = {12,4,1,19};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("数组的元素："+Arrays.toString(arr));
	}
}
