package com.zjm.list;

import java.util.Arrays;

public class SimpleArrayList<T> {

	private Object[] elementData;
	
	private int  size = 0;
	
	
	
	
	/**
	 * Ĭ�����鳤��
	 */
	private static final int DEAULT_CAPACITY = 10;
	
	private static final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;
	
	
	public int size(){
		return size;
	}
	
	public SimpleArrayList(int size){
		if(size < 0){
			throw new IllegalArgumentException("Ĭ�ϵĴ�С" + size);
		}else{
			elementData = new Object[size];
		}
	}
	
	public SimpleArrayList(){
		this(DEAULT_CAPACITY);
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public boolean add(T e){
		
		//�ж��Ƿ���Ҫ����
		size = size + 1;
		isCapacityEnough();
		
		//����
		elementData[size] = e;
		
		return true;
	}

	private void isCapacityEnough() throws OutOfMemoryError {
		
		if(size > DEAULT_CAPACITY){
			explicitCapacity();
		}
		
		if(size < 0){
			throw new OutOfMemoryError();
		}
	}

	/**
	 * ��ȷ����
	 */
	private void explicitCapacity() {
		int newLength = elementData.length * 2;
		if(newLength - size < 0){
			newLength = size;
		}
		
		if(newLength > MAX_ARRAY_LENGTH){
			newLength = size > MAX_ARRAY_LENGTH ? Integer.MAX_VALUE : MAX_ARRAY_LENGTH;
		}
		elementData = Arrays.copyOf(elementData, newLength);
	}
	
	public boolean remove(Object o){
		int flg = 0 ;
	
		
		for (int i = 0; i < elementData.length; i++) {
			if(o.equals(elementData[i])){
				flg = i;
			}
		}
		
		
		
		return false;
	}
	
	public T get(int index){
		
		if (index > size || index < 0){
			throw new IndexOutOfBoundsException("ָ����index����Խ��");
		}
		
		return (T)elementData[index];
	}
	
	private void checkRange(int index){
		//����index = size�Ǳ������,��֧��ͷ, �м�, β������
		if(index < 0 || index > size){
			throw new IndexOutOfBoundsException("ָ����index����Խ��");
		}
	}
	
	public static void main(String[] args) {
		SimpleArrayList<String> list = new SimpleArrayList<>();
		
		list.add("String11");
		
		System.out.println(list.size());
		
		//ArrayList
		
		//HashSet	TreeSet
		
		
	}
}

