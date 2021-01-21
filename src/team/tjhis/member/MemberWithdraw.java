package team.tjhis.member;

public class MemberWithdraw {

	// 회원탈퇴 메소드
	public MemberDTO[] withdraw(MemberDTO[] members, int no) {
	
		members[no-1] = null;
				
		return members; 
	}	

}
