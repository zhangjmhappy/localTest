package com.zjm.designpattern.templatemethod;

public abstract class  BaseCommand {

	
	public  void completeOperate(){
		//
		System.out.println("记录日志");
		System.out.println("性能分析");
		System.out.println("开启事务..");
		doBussiness();
		System.out.println("提交事务..");
		System.out.println("性能分析");
		System.out.println("记录日志");
		
	}
	
	public abstract void doBussiness();
}
