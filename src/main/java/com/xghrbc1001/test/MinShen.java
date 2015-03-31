package com.xghrbc1001.test;

public class MinShen {
	

	public static void main(String [] args){
		String s="";
		int number0=0;
		int number1=0;
		int number9=0;
		int number5=0;
		for(int i=0;i<101;i++){
			if(String.valueOf(i).contains("0")){
				number0++;
			}
			if(String.valueOf(i).contains("1")){
				number1++;
			}
			if(String.valueOf(i).contains("9")){
				number9++;
			}
			if(String.valueOf(i).contains("5")){
				number5++;
			}
		}
		
//		System.out.println(s);
		/*
		char [] chars=s.toCharArray();
		for(char c: chars){
//			System.out.println(c);
			if(c=='0'){
				number0++;
			}
			if(c=='1'){
				number1++;
			}
			if(c=='9'){
				number9++;
			}
			if(c=='5'){
				number5++;
			}
		}
		*/
		System.out.println("0:"+number0+" 1:"+number1+" 9:"+number9+" 5:"+number5);
	}
}
