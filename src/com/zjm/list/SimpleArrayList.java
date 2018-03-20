package com.zjm.list;

import java.util.Arrays;

public class SimpleArrayList<T> {

	private Object[] elementData;
	
	private int  size = 0;
	
	
	
	
	/**
	 * 默认数组长度
	 */
	private static final int DEAULT_CAPACITY = 10;
	
	private static final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;
	
	
	public int size(){
		return size;
	}
	
	public SimpleArrayList(int size){
		if(size < 0){
			throw new IllegalArgumentException("默认的大小" + size);
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
		
		//判断是否需要扩容
		size = size + 1;
		isCapacityEnough();
		
		//复制
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
	 * 明确容量
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
			throw new IndexOutOfBoundsException("指定的index超过越界");
		}
		
		return (T)elementData[index];
	}
	
	private void checkRange(int index){
		//这里index = size是被允许的,即支持头, 中间, 尾部插入
		if(index < 0 || index > size){
			throw new IndexOutOfBoundsException("指定的index超过越界");
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

