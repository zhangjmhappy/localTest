package com.zjm.designpattern.templatemethod;

public abstract class  BaseCommand {

	
	public  void completeOperate(){
		//
		System.out.println("��¼��־");
		System.out.println("���ܷ���");
		System.out.println("��������..");
		doBussiness();
		System.out.println("�ύ����..");
		System.out.println("���ܷ���");
		System.out.println("��¼��־");
		
	}
	
	public abstract void doBussiness();
}
