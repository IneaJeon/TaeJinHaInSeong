package team.tjhis.member;

import java.util.ArrayList;

public class MemberDB {
	
	// index = no - 1 - wdNum;
	private int wdNum;						 	// 탈퇴한 회원 수 (회원번호를 가지고 인덱스에 접근할 때 사용)
	
	ArrayList<MemberDTO> memberDB = new ArrayList<>();		// 객체 배열 대신 ArrayList 활용

	public int getWdNum() {						// 직접 접근 막기 위해 getter & setter 사용
		return wdNum;
	}

	public void setWdNum(int wdNum) {
		this.wdNum = wdNum;
	}	

	
}
