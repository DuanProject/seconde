package day7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月21日 上午10:39:42 
 * 类说明 
 */
public class Demo2 {
	public static void main(String[] args) throws DocumentException, IOException {
		Document doc = new SAXReader().read(new File("./src/contact.xml"));
		
		
		
		
		
		//指定文件输出位置
		FileOutputStream fileOutputStream = new FileOutputStream("e:/contact.xml");
		//指定一个输出格式
		OutputFormat format = OutputFormat.createCompactFormat();//紧凑的格式,无空格和换行，项目上线的时候
	/*	OutputFormat format2  = OutputFormat.createPrettyPrint();//漂亮的格式，开发调试的时候
*/		
		 //指定生成xml文档的编码格式，使用该方法生成xml文档避免乱码问题
		format.setEncoding("utf-8");      //同时影响xml保存时的编码和xml文档声明的编码（xml解析时的编码），所有就不存在乱码的问题
		
		
		//创建写出对象
		XMLWriter writer = new XMLWriter(fileOutputStream,format);
		//写出对象
		writer.write(doc);
		writer.close();
	}
}
