package Day1;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/** 
 * @author Michael2397 2692613726@qq.com: 
 * @version 创建时间：2016年7月16日 上午11:00:17 
 * 类说明 
 */
public class iotest {
	public static void main(String[] args) {
		try {
			/*testInput();
			writeFile();*/
			readFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void readFile() throws IOException{
		//建立文件与程序的输入数据通道
		FileInputStream fileInputStream = new FileInputStream("E:\\a.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
		int content = 0;
		while((content = inputStreamReader.read())!=-1){
			System.out.println((char)content);
		}
		inputStreamReader.close();
	/*	FileInputStream fileInputStream = new FileInputStream("E:\\a.text");
		FileReader fileReader = new FileReader("E:\\a.text");    //默认使用gbk
		int content = 0;
		while((content = fileReader.read())!=-1){
			System.out.println((char)content);
		}
		fileReader.close();*/
	}
	//指定使用utf-8码表吧数据写出到文件上。
	public static void writeFile() throws IOException{
		//建立了文件与程序的数据通道
		FileOutputStream  fileOutputStream = new FileOutputStream("E:\\a.txt");
		//创建一个输出字节流的转化流并且指定码表进行写数据
		OutputStreamWriter OutputStreamWriter = new OutputStreamWriter(fileOutputStream,"utf-8");
		
		OutputStreamWriter.write("大家好");   //中文在utf-8码表中占三个字节
		
		//关闭资源
		OutputStreamWriter.close();
		
	}
	
	
	
	public static void testOutput(){
		try {
			Socket socket =new Socket(InetAddress.getLocalHost(),9090);
			//获取到的socket的输出流对象
			OutputStream outputstream = socket.getOutputStream();
			
			//把输出字节流转化成输出字符流
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputstream);
			outputStreamWriter.write("不饿");
			
			/*outputstream.write("你饿了么".getBytes());  //转化成字节数组
*/		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 
	public static void testInput() throws Exception{
		InputStream in = System.in;
		int content = in.read();    //每次只会读取一个字节的数据
		
		//需要把字节流转化成字符流使用
		InputStreamReader inputStreamReader = new InputStreamReader(in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.println(bufferedReader.readLine());
	}
}
