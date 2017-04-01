package com.zj.design.command;

public class Client {
	public static void main(String[] args) {
		Light light = new Light("keting");
		Command lightOnCommand = new LightOnCommand(light);
		Command lightOffCommand = new LightOffCommand(light);
		SimpleRemoteControl control = new SimpleRemoteControl();
		control.setCommand(lightOnCommand);
		control.invoke();
		control.setCommand(lightOffCommand);
		control.invoke();
		
	}
}
