package com.zjm.designpattern.decorator;

public class LoggerDecorator implements Command {
	
	Command command;
	

	public LoggerDecorator(Command command) {
		this.command = command;
	}
	
	public LoggerDecorator(){
		
	}


	@Override
	public void execute() {
		//¼ÇÂ¼ÈÕÖ¾
		System.out.println("logger begin ...");
//		execute();
		this.command.execute();
		
		System.out.println("logger end ...");
		
	}
	
	public static void main(String[] args) {
		Command cmd =  new LoggerDecorator(new OrderCommand());
		cmd.execute();
	}

}
