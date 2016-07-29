package Day1;

import junit.framework.Assert;
import org.junit.*;
import org.junit.Test;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 下午4:50:44 
 * 测试类
 */
public class junit2Test {
	@Test
  public void testGetMax(){
    	int max = new junit2().getMax();
    	if(max!=5){
    		throw new RuntimeException();
    	}else{
    	 System.out.println("最大值："+max);
    	}
    	/*//断言
    	Assert.assertSame(5,max);*/
    	/*Assert.assertSame(new String("abc"),"abc");//==
    	Assert.assertEquals(new String("abc"),"abc");//equals*/    
    	/*Assert.assertNull(null);*/
//		Assert.assertTrue();
    }
	
	
	@Test
	public void testGetMin(){
		int min = junit2.getMin();
		if(min!=2){
			throw new RuntimeException();
		}
		else{
			System.out.println("最小值："+min);
		}
	}
}
