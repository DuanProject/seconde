package Day1;

import java.util.ArrayList;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午2:44:40 
 * 类说明 
 */
public class genecity {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
//		list.add(123)    添加非字符串类型的数据：打印的时候才报错 .ArrayList<String> list = new ArrayList<String>();会提前报错
		//把所有元素转化成大写
		for (int i = 0; i < list.size(); i++) {
			String str = (String) list.get(i);
			System.out.println(str.toUpperCase());
		}
	}
	
	
}
