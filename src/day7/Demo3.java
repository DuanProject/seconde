package day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.xml.sax.DocumentHandler;

/**
 * @author Michael2397 2692613726@qq.com:
 * @version 创建时间：2016年7月21日 上午10:51:55 修改xml内容 标签 属性 文本
 */
public class Demo3 {
	@Test
	public void test() throws IOException {
		system.out.println("Sb");
		// 一、创建一个文档
		Document doc = DocumentHelper.createDocument();
		// 增加一个标签
		Element rootElem = doc.addElement("contactList");
		/*
		 * doc.addElement("contactList"); //这是错的，只能有一个根标签
		 */
		Element conElement = rootElem.addElement("contact");
		conElement.addElement("name");

		// 增加属性
		conElement.addAttribute("id", "001");

		// 三、
		// 指定文件输出位置
		FileOutputStream fileOutputStream = new FileOutputStream(
				"e:/contact.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		// 创建写出对象
		XMLWriter writer = new XMLWriter(fileOutputStream);
		// 写出对象
		writer.write(doc);
		writer.close();
	}

	@Test
	public void test2() throws DocumentException, IOException {
		Document doc = new SAXReader().read(new File("./src/contact.xml"));
		// 方案一：1.得到标签对象 2.得到属性对象。3。修改属性值
		/*
		 * Element element = doc.getRootElement().element("contact"); Attribute
		 * idAttribute = element.attribute("id"); idAttribute.setValue("003");
		 */

		/*
		 * //方案二：修改属性值 Element element =
		 * doc.getRootElement().element("contact"); //通过增加同名属性的方法，修改属性
		 * element.addAttribute("id", "004");
		 */

		// 修改文本
		Element element = doc.getRootElement().element("contact")
				.element("name");
		element.setText("李四");

		// 指定文件输出位置
		FileOutputStream fileOutputStream = new FileOutputStream(
				"e:/contact.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		// 创建写出对象
		XMLWriter writer = new XMLWriter(fileOutputStream);
		// 写出对象
		writer.write(doc);
		writer.close();
	}

	@Test
	public void test3() throws IOException, DocumentException {
		Document doc = new SAXReader().read(new File("./src/contact.xml"));
		/*Element element = doc.getRootElement().element("contact").element("age");
		//删除标签对象
		element.detach();*/
		
		//先找到父标签
		
		
		//删除属性
		//得到第二个属性标签
		Element element = (Element) doc.getRootElement().elements().get(1);
		Attribute attribute = element.attribute("id");
		attribute.detach();
		
		// 指定文件输出位置
		FileOutputStream fileOutputStream = new FileOutputStream(
				"e:/contact.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		// 创建写出对象
		XMLWriter writer = new XMLWriter(fileOutputStream);
		// 写出对象
		writer.write(doc);
		writer.close();

	}
}
