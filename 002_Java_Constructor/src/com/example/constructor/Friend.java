package com.example.constructor;

public class Friend {
	
	String name;
	Integer age;
	
	Friend(){
		System.out.println("In empty constructor!!!!");
	}
	
	Friend(Integer age, String name){
		System.out.println("In constructor with parameters!!!!");
		this.age = age;
		this.name = name;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend f1 = new Friend();
		Friend f2 = new Friend(22, "OBB");
		System.out.println(f2.name + " " + f2.age);
		
		
		
	}

}
