package com.zjm.designpattern.templatemethod;

public class OrderCommand extends BaseCommand {

	@Override
	public void doBussiness() {
		System.out.println("....ҵ������ʽ....");

	}
	
	public static void main(String[] args) {
		BaseCommand command = new OrderCommand();
		
		command.completeOperate();
		
	}

}
