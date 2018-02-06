package com.zjm.basejava.myenumeration;

import java.util.Enumeration;

public class MyEnumeration {

	public static void main(String[] args) {
		// 实例化MyDataStruct类型的对象
		MyDataSttuct mySataStruct = new MyDataSttuct();
		// 得到描述myDataStruct类型对象的enumeration对象
		Enumeration myEnumeration = mySataStruct.getEnum();
		// 使用对象循环显示myDataStruct类型的对象中的每一个元素
		while (myEnumeration.hasMoreElements())
			System.out.println(myEnumeration.nextElement());
	}

}

class MyEnumerator implements Enumeration {
	int count; // 计数器
	int length; // 存储的数组的长度
	Object[] dataArray; // 存储数据数组的引用
	// 构造器

	MyEnumerator(int count, int length, Object[] dataArray) {
		this.count = count;
		this.length = length;
		this.dataArray = dataArray;
	}

	public boolean hasMoreElements() {
		return (count < length);
	}

	public Object nextElement() {
		return dataArray[count++];
	}
}

class MyDataSttuct {
	String[] data;

	// 构造器
	MyDataSttuct() {
		data = new String[4];
		data[0] = "zero";
		data[1] = "one";
		data[2] = "two";
		data[3] = "three";
	}

	// 返回一个enumeration对象给使用程序
	Enumeration getEnum() {
		return new MyEnumerator(0, data.length, data);
	}
}