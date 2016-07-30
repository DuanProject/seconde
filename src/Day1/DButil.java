package Day1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 鍒涘缓鏃堕棿锛�016骞�鏈�6鏃�涓嬪崍9:22:11 
 * 绫昏鏄�
 */
public class DButil {
	static Properties properties;
	static{
		System.out.println("URL");
		properties = new Properties();
		Class clazz = DButil.class;
		InputStream inputStream = clazz.getResourceAsStream("/db.properties");//璇ユ柟娉曚腑鐨勮矾寰勫氨鏄娇鐢ㄤ簡绫绘枃浠惰矾寰� '/'浠ｈ〃浜哻lasspath鐨勮矾寰�
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*properties.load(new FileReader("db.properties"));*/
	}
	
	public static void main(String[] args) {
		System.out.println("鐢ㄦ埛鍚嶏細"+properties.getProperty("userName")+"瀵嗙爜"+properties.getProperty("password"));
	}
}
