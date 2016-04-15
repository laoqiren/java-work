package com.extend;

public class cat extends Animal implements pet {
	public void speak(){
		System.out.println("miao,my name is " + name);
	}
	public void eat(){
		System.out.println("I want to eat some fish");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat kitty = new cat();
		kitty.speak();
		kitty.eat();
	}

}
