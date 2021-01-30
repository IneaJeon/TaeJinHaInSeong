package team.tjhis.member;

import java.util.ArrayList;
import java.util.List;

public class MemberDB {
	
	private int logNo;

	List <MemberDTO> memberDB = new ArrayList<>();
	
	public void members() {
		
		memberDB.add(new MemberDTO(1, "xogns603", "111", "김태훈", "01045922509", "서울시 서초구"));
		memberDB.add(new MemberDTO(2, "yoojh0219", "111", "유진희", "01095249390", "서울시 서초구"));
		memberDB.add(new MemberDTO(3, "gkdud0857", "111", "민하영", "01024950857", "서울시 서초구"));
		memberDB.add(new MemberDTO(4, "winzerin78", "111", "전인애", "01092899363", "서울시 서초구"));
		memberDB.add(new MemberDTO(5, "good321ok", "111", "김성배", "01049334367", "서울시 서초구"));
		
	}
	
	
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
