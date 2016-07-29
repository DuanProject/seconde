package Day1;

import java.util.Comparator;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午3:33:37 
 * 类说明 
 */
interface Dao<T> {
	public void add(T t);
	public void remove(T t);
}
/*public class genecityfour implements Dao<String>{

	@Override
	public void add(String t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String t) {
		// TODO Auto-generated method stub
		
	}

}*/

public class genecityfour<T> implements Dao<T>{
 
   public static void main(String[] args) {
	   new genecityfour<String>();
}

@Override
public void add(T t) {
	// TODO Auto-generated method stub
	
}

@Override
public void remove(T t) {
	// TODO Auto-generated method stub
	
}

}
class Worker implements Comparator<Worker>{

	@Override
	public int compare(Worker o1, Worker o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

