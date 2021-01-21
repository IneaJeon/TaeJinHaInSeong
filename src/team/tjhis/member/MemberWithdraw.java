package team.tjhis.member;

public class MemberWithdraw {

	// 회원탈퇴 메소드
	public void withdraw(MemberDB db, int no) {
		// 회원 정보가 저장되어 있는 인스턴스의 주소값이 들어 있는 인덱스에 접근하여 주소값을 null로 변경
		db.memberDB[no-1] = null;
	}	

}
