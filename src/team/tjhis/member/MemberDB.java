package team.tjhis.member;

import java.util.ArrayList;

public class MemberDB {
	
	private int logNo;
	
	ArrayList <MemberDTO> memberDB = new ArrayList<>();
	
	public MemberDB() {
		super();
	}

//	private static ArrayList <MemberDTO> memberDB = new ArrayList<>();		
//	
//	private MemberDB() {}
//	
//	public MemberDB(int logNo, ArrayList<MemberDTO> memberDB) {
//		super();
//		this.logNo = logNo;
//		this.memberDB = memberDB;
//	}

	public int getLogNo() {
		return logNo;
	}

	public void setLogNo(int logNo) {
		this.logNo = logNo;
	}

//	public ArrayList<MemberDTO> getMemberDB() {
//		return memberDB;
//	}
//
//	public void setMemberDB(ArrayList<MemberDTO> memberDB) {
//		this.memberDB = memberDB;
//	}
	
}
