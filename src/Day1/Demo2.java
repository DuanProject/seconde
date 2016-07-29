package Day1;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.*;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 上午10:17:14 
 * 类说明 
 */
public class Demo2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("李四");
		list.add("张三");
		list.add("王五");
		//get方式遍历
		System.out.println("get方式遍历：");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+",");
		}
		
		//迭代器  注意：迭代器在迭代的过程中不能使用集合对象修改集合中的元素个数。如果需要修改要使用迭代器的方法进行修改，foreach也是如此。例如不能使用set.add();
		System.out.println("迭代器遍历：");
		HashSet<String> set = new HashSet<String>();
		set.add("狗娃");
		set.add("猫娃");
		set.add("铁蛋");
		
		Iterator<String> it = set.iterator();   //获取迭代器
		while (it.hasNext()) {
			System.out.println(it.next()+",");
			
		}
		
		//迭代器简化
		for(String item:set){
			System.out.println(item+",");
		}
		
		System.out.println("Map：");
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("张三","001");
		map.put("李四","002");
		map.put("王五","003");
		Set<java.util.Map.Entry<String, String>> entrys = map.entrySet();
		
		for(java.util.Map.Entry<String, String> entry : entrys){
			System.out.println("{"+"键："+entry.getKey()+"值："+entry.getValue()+"}");
		}
		
	}
}
