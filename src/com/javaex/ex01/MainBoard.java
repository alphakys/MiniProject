package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//txt
		InputStreamReader isr = new FileReader("C:\\Users\\gys11\\바탕 화면\\JavaStudy\\PhoneDB.txt");
		BufferedReader brText = new BufferedReader(isr);
		//OutputStreamWriter isw = new FileWriter("C:\\Users\\gys11\\바탕 화면\\JavaStudy\\PhoneDB-1.txt");
		
		//DB 관리를 위한 ArrayList
		ArrayList<PhoneDB> pdArr = new ArrayList<>();
		
	
		
		int selection = br.read();
		
		
		String[] txt = brText.readLine().split(",");
		String[] txt1 = brText.readLine().split(",");
		String[] txt2 = brText.readLine().split(",");
		
		
		pdArr.add(new PhoneDB(txt[0],txt[1],txt[2]));
		pdArr.add(new PhoneDB(txt1[0],txt1[1],txt1[2]));
		pdArr.add(new PhoneDB(txt2[0],txt2[1],txt2[2]));

		
		
		
	
		
	
			

			
			
		/*
		if(selection==1) {
			txtPhone 
			
		}
		*/
		
		if(selection==2) {
			System.out.println("<2.등록>");
			System.out.print(">이름: ");
			String strName = br.readLine();
			System.out.print(">휴대전화: ");
			String strHp = br.readLine();
			System.out.print(">회사전화: ");
			String strCompany = br.readLine();
			System.out.println("[등록되었습니다.]");
			
			pdArr.add(new PhoneDB(strName, strHp, strCompany));
			
		}
		
		if(selection==3) {
			System.out.println("<3.삭제>");
			System.out.print(">번호: ");
			int removeNum = br.read();
			pdArr.remove(removeNum-1);
			System.out.println("[삭제되었습니다.]");
			
		}
		
		if(selection==5) {
			System.out.println("***************************");
			System.out.println("          감사합니다                    ");
			System.out.println("***************************");
			break;
		}
		
		if(selection==4) {
			System.out.println("<4.검색>");
			System.out.print(">이름: ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
