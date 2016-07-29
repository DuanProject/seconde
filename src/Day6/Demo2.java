package Day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.attachment.AttachmentMarshaller;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月20日 下午2:45:55 
 * 类说明 
 */
public class Demo2 {
	/*
	 *   得到节点信息
	 * */
	@Test  
	public void test1() throws FileNotFoundException{
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(new File("./src/contact.xml"));
			
			//得到当前结点下所有子节点对象,不包括孙节点以下的结点
			Iterator<Node> it = doc.nodeIterator();
			while(it.hasNext()){
				Node node = it.next();   //取出节点
				String name = node.getName();
				System.out.println(name);
				
				//继续取出其下面的子节点
				//只有标签结点才有子节点
				if(node instanceof  Element){
					Element elem = (Element)node;
					Iterator<Node> it2 = elem.nodeIterator();
					while(it2.hasNext()){
						Node n2 = it2.next();
						System.out.println(n2.getName());
					}
				}
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void Test2(){
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(new File("./src/contact.xml"));

			//得到根标签
			Element rootElem = doc.getRootElement();
			getChildNodes(rootElem);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	private void getChildNodes(Element elem){
		System.out.println(elem.getName());
		
		//得到子节点
		Iterator<Node> it = elem.nodeIterator();
		while(it.hasNext()){
			Node node = it.next();   //有可能是三种
			//判断是否是标签结点
			if(node instanceof Element){
				Element el = (Element)node;
				//递归
				getChildNodes(el);
			}
			
		}
	}
	
	//获取标签
	@Test
	public void test3(){
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(new File("./src/contact.xml"));
			
			//得到根标签
			Element rootElem = doc.getRootElement();
			//根标签名称
			String name= rootElem.getName();
			System.out.println(name);
			
			/*//得到当前标签下指定名称的第一个子标签
			Element contactElem = rootElem.element("contact");
			System.out.println(contactElem.getName());*/
			
			//得到当前标签下指定名称的所有子标签
			Iterator<Element> it = rootElem.elementIterator("contact");
			while(it.hasNext()){
				Element elem = it.next();
				System.out.println(elem.getName());
			}
			//得到当前标签下的所有子标签
			List<Element> list = rootElem.elements();
			//遍历list的方法
			//(1)传统for(2)增强for(3)迭代器
		/*	for (int i = 0; i < list.size(); i++) {
				Element e = list.get(i);
				System.out.println(e.getName());
			}*/
		/*	for(Element e:list){
				System.out.println(e.getName());
			}*/
			/*Iterator<Element> iterator = list.iterator();  //ctr+2 松开后  l
*/			Iterator<Element> it4 = list.iterator();
			while(it4.hasNext()){
				System.out.println(it4.next().getName());
			}
			
			//获取更深层次的标签（方法只能一层层获取）
			Element el = doc.getRootElement().element("contact").element("name");
			System.out.println(el.getName());
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//获取属性
	@Test
	public void test5(){
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(new File("./src/contact.xml"));
			
			//先获得属性所在的标签对象，然后才能获得属性
			Element contactElement = doc.getRootElement().element("contact");
			
			//得到属性对象,得到指定名称的属性值
		/*	String idVString = contactElement.attributeValue("id");
			System.out.println(idVString);*/
			
			
		/*	//得到指定属性名称的属性对象
			Attribute idAttribute = contactElement.attribute("id");
			System.out.println(idAttribute.getName()+idAttribute.getValue());*/
			
			
				//得到所有属性的对象
			List<Attribute> list = contactElement.attributes();
			for(Attribute attr : list){
				System.out.println(attr.getName()+"="+attr.getValue());
			}
			} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		
		}
	}
	//获取文本
	@Test
	public void test6(){
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(new File("./src/contact.xml"));
		/*	
			Element nameElement = doc.getRootElement().element("contact").element("name");
			//得到文本
			String text = nameElement.getText();
			System.out.println(text);
			*/
			
			System.out.println(doc.getRootElement().element("contact").elementText("name"));
			
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
