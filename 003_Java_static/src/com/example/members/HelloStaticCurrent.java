package com.example.members;

public class HelloStaticCurrent {
	
	static String provider = "TNEBD";
	
	
	public void setVoltage() {
		System.out.println("SET Danger - Voltage Set!!!!");
	}
	
	static void getVoltage() {
		System.out.println("GET Danger - DO Not Touch!!!!!");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(HelloStaticCurrent.provider);
		HelloStaticCurrent.getVoltage();
		
		HelloStaticCurrent hsc1 = new HelloStaticCurrent();
		hsc1.setVoltage();
		System.out.println(hsc1.provider);

		HelloStaticCurrent hsc2 = new HelloStaticCurrent();
		hsc2.setVoltage();
		System.out.println(hsc2.provider);

		
		
	}

}
