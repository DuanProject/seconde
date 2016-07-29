package day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月20日 下午8:52:41 
 * 类说明 
 */
public class Demo1 {
	public static void main(String[] args) throws DocumentException, IOException {
		/*一、读取或创建一个documet对象
		 * 二、修改document的内容
		 * 三、吧修改后的文档对象写出到xml文档中
		 * */
		Document doc = new SAXReader().read(new File("./src/contact.xml"));
		
		
		
		
		
		//指定文件输出位置
		FileOutputStream fileOutputStream = new FileOutputStream("e:/contact.xml");
		//创建写出对象
		XMLWriter writer = new XMLWriter(fileOutputStream);
		//写出对象
		writer.write(doc);
		writer.close();
	}
}
