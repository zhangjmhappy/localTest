package com.zjm.basejava.myenumeration;

import java.util.Enumeration;

public class MyEnumeration {

	public static void main(String[] args) {
		// ʵ����MyDataStruct���͵Ķ���
		MyDataSttuct mySataStruct = new MyDataSttuct();
		// �õ�����myDataStruct���Ͷ����enumeration����
		Enumeration myEnumeration = mySataStruct.getEnum();
		// ʹ�ö���ѭ����ʾmyDataStruct���͵Ķ����е�ÿһ��Ԫ��
		while (myEnumeration.hasMoreElements())
			System.out.println(myEnumeration.nextElement());
	}

}

class MyEnumerator implements Enumeration {
	int count; // ������
	int length; // �洢������ĳ���
	Object[] dataArray; // �洢�������������
	// ������

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

	// ������
	MyDataSttuct() {
		data = new String[4];
		data[0] = "zero";
		data[1] = "one";
		data[2] = "two";
		data[3] = "three";
	}

	// ����һ��enumeration�����ʹ�ó���
	Enumeration getEnum() {
		return new MyEnumerator(0, data.length, data);
	}
}