package com.javaex.ex01;

import java.util.ArrayList;

public class pdArray {
	
	ArrayList<PhoneDB> pdArr = new ArrayList<>();

	
	public pdArray() {
		
	}
	
	
	
	//리스트에 있는 전체 목록 
	
	public void showList() {
		
		for(int i = 0;i<pdArr.size();i++) {
			System.out.print((i+1)+"."+"   ");
			System.out.println(pdArr.get(i).toString());
		}
			
		}
	
	//특정 목록 데이터 출력
	
	public void showInfo(int index) {
		System.out.print(index+".   ");
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
		
	//이름으로 검색한 리스트 정보 출력 메서드
	
	
	public void showSearchedInfo(CharSequence key) {
		
		for(int i=0;i<pdArr.size();i++) {
			boolean searchName = pdArr.get(i).getName().contains(key); //리스트에 이름이 있는지 확인하고 맞으면 true 반환
			
			if(searchName==true) {
								showInfo(i+1);
								}
			
		}
		
			
	}
	
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
