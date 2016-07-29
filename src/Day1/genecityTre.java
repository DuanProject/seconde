package Day1;
/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午3:20:49 
 * 类说明 
 */
public class genecityTre {
	private void mian() {
		MyList<String> list = new MyList<String>();
		list.add("adc");
		
		MyList list2 = new MyList<String>();     //object
		list2.add("dc");

	}
}

//自定义一个集合对象

class MyList<T>{
	
	/*Object[] arr;
	
	int index = 0;
	
	public MyList(){
		arr = new Object[10];
	}
	public void add(Object o){
		arr[index++] = 0;
	}*/
	Object[] arr = new Object[10];
	
	int index = 0;
	
	public MyList(){
	
	}
	public void add(T o){
		arr[index++] = 0;
	}
}
