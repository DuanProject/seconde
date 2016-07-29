package Day1;
/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午3:08:38 
 * 类说明 
 */
public class genecityTwo {
	public static void main(String[] args) {
		print(12);  
		print("abc");
	}
	
	//<T>把T字母声明为自定义泛型
	public static <T> T print(T o){
		return o;
	}
}
