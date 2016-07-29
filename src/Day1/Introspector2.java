package Day1;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午8:24:08 
 * 类说明 
 */
public class Introspector2 {
	public static void main(String[] args) throws Exception, InvocationTargetException {
		//从文件读取到的数据都是字符串的数据，或者是表单提交的数据获取到的时候也是字符串的数据
		String id = "110";
		String name = "你好";
		String salary = "1000";
		String birthday = "2013-12-1";
		//注册一个类型转化器
		ConvertUtils.register(new Converter() {
			
			@Override
			public Object convert(Class type, Object value) {  //type:目前所遇到的数据类型。value:目前参数的值
				Date date = null;
				try {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					 date = dateFormat.parse((String)value);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				return date;
			}
		}, Date.class);
		
		
		Emp e = new Emp();
		BeanUtils.setProperty(e, "id", id);
		BeanUtils.setProperty(e, "name", name);
		BeanUtils.setProperty(e, "salary", salary);
		BeanUtils.setProperty(e, "birthday", birthday);
		System.out.println(e);
	}
}
