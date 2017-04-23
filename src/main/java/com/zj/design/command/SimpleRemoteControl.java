package com.zj.design.command;

public class SimpleRemoteControl {
	Command command;
	public void setCommand(Command command) {
		this.command = command;
	}
	public void invoke(){
		command.execute();
	}
}
