package com.zjm.array;

/**
 * 数组的Copy
 * @author Administrator
 *
 */
public class CopyArrayTest {
	public static void main(String[] args) {
		byte[] data1="hello world".getBytes();
	    byte[] data2 = "2000".getBytes();
	    
	    byte[] data3 = new byte[data1.length+data2.length];
	    
	 
	    
	    System.arraycopy(data1,0,data3,0,data1.length);
	    System.out.println(new String(data3));
	    //1.要拷贝复制的原始数据
	    //2.原始数据的读取位置(从原始数据哪个位置开始拷贝)
	    //3.存放要拷贝的原始数据的目的地
	    //4.开始存放的位置()
	    //5.要读取的原始数据长度(拷贝多长)
	    System.arraycopy(data2,0,data3,data1.length,data2.length);
	    System.out.println(new String(data3));
	    
	    System.out.println(data2.length);
	    byte[] head = new byte[data2.length];
	    //拷贝data3的后4位到head中
	    System.arraycopy(data3,data3.length-4,head,0,head.length);
	    System.out.println(new String(head));
	}
	
}
