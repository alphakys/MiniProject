package com.javaex.ex01;

import java.util.ArrayList;

public class pdArray {
	
	ArrayList<PhoneDB> pdArr = new ArrayList<>();
	
	//리스트에 있는 전체 목록 
	
	public void showList() {
		
		for(int i = 0;i<pdArr.size();i++) {
			System.out.print((i+1)+"."+"   ");
			System.out.println(pdArr.get(i).toString());
		}
			
		}
	
	//특정 목록 데이터 출력
	
	public void showInfo(int index) {
		System.out.print(index+"   ");
		System.out.println(pdArr.get(index-1).toString());
		
	}
	
	
	//목록에서 제거 메서드
	
	public void remove(int index) {
		
		pdArr.remove(index-1);
	}
	
	
	
	
	//리스트에 새로운 데이터 추가
	
	public void add(PhoneDB data) {
			
		pdArr.add(data);
		
	}
		
	/*	
	public showInfoName(String name) {
		pdArr.get(0).getName()
	}
	*/
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
