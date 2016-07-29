package Day6;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月20日 下午2:39:09 
 * 类说明 
 */
public class Demo1 {
	public static void main(String[] args) {
		//1.创建一个xml解析器对象
		SAXReader reader = new SAXReader();
		 try {
			 //读取一个xml文档，返回document对象
			Document doc = reader.read(new File("./src/contact.xml"));  //"./"返回的是项目名称
			System.out.println(doc);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
