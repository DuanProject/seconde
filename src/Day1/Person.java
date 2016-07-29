package Day1;
/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午7:07:06 
 * 类说明 
 */
//实体类-----javabean
public class Person {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public Person(){
    	
    }
    public String toString(){
    	return "编号："+this.id+"姓名："+this.name;
    }
}
