package Day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.text.FieldPosition;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午5:46:46 
 * 类说明 
 */
public class introspector {
	public static void main(String[] args) throws Exception, Exception {
		Person p = (Person)getInstance();
		System.out.println(p);
	}
	//根据配置文件的内容生产对象，并把对象的属性值封装到对象中
	public static Object getInstance() throws IOException, Exception{
		BufferedReader bufferedReader = new BufferedReader(new FileReader("obj.txt"));
		String className = bufferedReader.readLine();  //读取配置文件获取到完整的类名
		Class clazz = Class.forName(className);
		//通过class对象获取无参的构造方法
		Constructor constructor = clazz.getConstructor(null);
		Object o = constructor.newInstance(null);
		//读取属性值
		String line = null;
		while((line = bufferedReader.readLine())!=null){
			String[] datas = line.split("=");
			//通过属性名获取对象的Field对象
			Field field = clazz.getDeclaredField(datas[0]);
			if(field.getType()==int.class){
				field.set(o,Integer.parseInt(datas[1]));
			}else{
				field.set(o,datas[1]);
			}
			
		}
		return o;
	}
	
}
