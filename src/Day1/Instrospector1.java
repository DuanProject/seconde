package Day1;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午8:08:15 
 * 类说明 
 */
public class Instrospector1 {
	public static void main(String[] args) {
		
	}
	@Test
	public void getAllProperty() throws Exception{
		//内省类
		BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
		//通过beanInfo获取所有的属性描述
		PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();//获取一个类中所有属性描述性
		for(PropertyDescriptor p : descriptors){
			System.out.println(p.getReadMethod());   //get方法
		}
	}
	
	@Test
	public void testProperty() throws Exception{
		Person p = new Person();
		//属性描述性
		PropertyDescriptor descriptor = new PropertyDescriptor("id", Person.class);
		//获取属性的对应的get,set方法
	    Method m  =	descriptor.getWriteMethod();
	    //执行该方法设置值
	    m.invoke(p, 110);
	    
	    Method readMethod =  descriptor.getReadMethod(); //获取属性的get方法
	    
	    System.out.println(p);
	}
}
