package Day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午5:20:56 
 * 类说明 
 */
public class junit3 {
	//读取文件数据，把文件数据都
	@Test
	public  void readFile() throws IOException{
	
		FileInputStream fileInputStream = new FileInputStream("E:\\a.txt");
		int content = fileInputStream.read();
		System.out.println("内容："+content);
		

		
	}
	@Test
	public void sort(){
		System.out.println("sort");
	}
	
/*	//读取文件中的数据，对文件中的数据进行排序
	public void sort() throws IOException{
		BeforeRead();
		
		FileInputStream fileInputStream = new FileInputStream("E:\\a.txt");
		int content = fileInputStream.read();
		System.out.println("内容："+content);
		
		afterRead();
	}*/
	/*@Before*/
	@BeforeClass
	//准备测试环境
	public static void BeforeRead(){
		System.out.println("准备测试环境成功");
	} 
	
	/*@After*/
	@AfterClass
	//清理测试环境的方法
	public static void afterRead(){
		
		System.out.println("清理测试环境。。");
	}
}
