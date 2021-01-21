package team.tjhis.member;

public class MemberWithdraw {

	// 회원탈퇴 메소드
	public void withdraw(MemberDTO[] db, int no) {
		db[no-1] = null;	// 회원번호에 해당하는 회원의 정보 삭제
	}	

}
