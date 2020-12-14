package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainBoard {

	public static void main(String[] args)throws IOException {
		
		System.out.println("******************************");
		System.out.println("*      전화번호 관리 프로그램                 *");
		System.out.println("******************************");
		System.out.println();
		System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
		System.out.println("-------------------------------");
		System.out.println(">메뉴번호: ");
		
		//입-출력 스트림
		//key
		BufferedReader brKey = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//txt
		InputStreamReader isr = new FileReader("C:\\Users\\gys11\\바탕 화면\\JavaStudy\\PhoneDB.txt");
		BufferedReader brText = new BufferedReader(isr);
		OutputStreamWriter isw = new FileWriter("C:\\Users\\gys11\\바탕 화면\\JavaStudy\\PhoneDB.txt");
		
		int selection = brKey.read();
		
		
		String txtPhone = brText.readLine();
		System.out.println(txtPhone);
		
		String[] element = txtPhone.split(",");
		
		for()
		new PhoneDB(element[0],element[1],element[2]);
		
		/*
		if(selection==1) {
			txtPhone 
			
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
