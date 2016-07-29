package Day1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午9:22:11 
 * 类说明 
 */
public class DButil {
	static Properties properties;
	static{
		properties = new Properties();
		Class clazz = DButil.class;
		InputStream inputStream = clazz.getResourceAsStream("/db.properties");//该方法中的路径就是使用了类文件路径  '/'代表了classpath的路径
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*properties.load(new FileReader("db.properties"));*/
	}
	
	public static void main(String[] args) {
		System.out.println("用户名："+properties.getProperty("userName")+"密码"+properties.getProperty("password"));
	}
}
