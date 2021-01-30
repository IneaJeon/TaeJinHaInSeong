package team.tjhis.member;

import java.util.ArrayList;

public class MemberDB {
	
	private int logNo;
	
	ArrayList <MemberDTO> memberDB = new ArrayList<>();
	
	public MemberDB() {
		super();
	}

	public int getLogNo() {
		return logNo;
	}

	public void setLogNo(int logNo) {
		this.logNo = logNo;
	}
	
}
