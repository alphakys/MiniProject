package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainBoard {

		public static void main(String[] args) throws IOException{
		
		//입-출력 스트림
		//key
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//파일 입출력 스트림
		InputStreamReader isr = new FileReader("C:\\Users\\gys11\\바탕 화면\\JavaStudy\\PhoneDB.txt");
		BufferedReader brText = new BufferedReader(isr);
	
	
		//DB 관리를 위한 ArrayList
		pdArray pdArr = new pdArray();
	
		
		while(true) {
			 String str;
			 if((str = brText.readLine())!=null) {
			String[] DB = str.split(",");
				String name = DB[0];
				String hp = DB[1];
			 	String company = DB[2];
				pdArr.add(new PhoneDB(name,hp,company));
				
			}
			 else {
				 break;
			 }

		}
		
		
		
		
		boolean run = true;
			
		while(run) {	
		
			System.out.println("******************************");
			System.out.println("*      전화번호 관리 프로그램                 *");
			System.out.println("******************************");
			System.out.println();
			System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
			System.out.println("-------------------------------");
			System.out.print(">메뉴번호: ");
			
			int selection = Integer.parseInt(br.readLine());
			
		if(selection==1) {
		
		 pdArr.showList(); 
			
		}
		else if(selection==2) {
			
				System.out.println("<2.등록>");
				System.out.print(">이름: ");
				String strName = br.readLine();
				System.out.print(">휴대전화: ");
				String strHp = br.readLine();
				System.out.print(">회사전화: ");
				String strCompany = br.readLine();
				System.out.println("[등록되었습니다.]");
			
				pdArr.add(new PhoneDB(strName, strHp, strCompany));
		
				
				OutputStreamWriter isw = new FileWriter("C:\\Users\\gys11\\바탕 화면\\JavaStudy\\PhoneDB.txt");		
				BufferedWriter bw = new BufferedWriter(isw);
		for(PhoneDB pd : pdArr.pdArr) {
			bw.write(pd.getName()+","+pd.gethp()+","+pd.getCompany());
			bw.newLine();
		}
		bw.flush();
		bw.close();
		
		
		}
		else if(selection==3) {

				System.out.println("<3.삭제>");
				System.out.print(">번호: ");
				int removeNum = Integer.parseInt(br.readLine());
				pdArr.remove(removeNum);
				System.out.println("[삭제되었습니다.]");
				
				OutputStreamWriter isw = new FileWriter("C:\\Users\\gys11\\바탕 화면\\JavaStudy\\PhoneDB.txt");		
				BufferedWriter bw = new BufferedWriter(isw);		
		for(PhoneDB pd : pdArr.pdArr) {
			bw.write(pd.getName()+","+pd.gethp()+","+pd.getCompany());
			
		}
		
			bw.flush();
			bw.close();
			
			
		}
		else if(selection==4) {
			
				
				 System.out.println("<4.검색>");
				 System.out.print(">이름: ");
				 String strSearch = br.readLine();		
				 pdArr.showSearchedInfo(strSearch);
		}
		else if(selection==5) {
			
					System.out.println("***************************");
					System.out.println("          감사합니다                    ");
					System.out.println("***************************");
					run = false;
					
		}
		else {
				  System.out.println("[다시 입력해주세요]");
		     }
		
			
		

		}
		
		
		br.close();
		brText.close();
		
		}
}
