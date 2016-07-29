package Day1;
/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午1:38:56 
 * 类说明 
 */
public class thread extends Thread{
	
	public thread(String name){
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) {
		thread t =new thread("狗娃");
		t.start();   //开启线程。线程一旦开启就会指定run方法中的代码
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
