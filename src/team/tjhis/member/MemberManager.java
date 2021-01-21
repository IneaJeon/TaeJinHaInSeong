package team.tjhis.member;

public class MemberManager {
	
	public MemberManager() {}
	
	public void signUp() {
		
	}

	public void login() {
		
	}

	public void amend() {
		
	}

	public void withdraw() {
		
	}

	public void findId() {
		
	}
	
	public void findPwd(MemberDB memberDb) {
		FindPwd findPwd = new FindPwd();
		findPwd.findPwd(memberDb);
	}
	
	
	
	// 로그인 메소드(매개변수 MemberDB)
	
	// 회원가입 메소드(매개변수 MemberDB)
	
	// 개인정보 수정 메소드(매개변수 MemberDB, int no(고유번호))
	
	// 회원탈퇴 메소드(매개변수 MemberDB, int no(고유번호))
	
	// 아이디 찾기 메소드(매개변수 MemberDB)
	
	// 비밀번호 찾기 메소드(매개변수 MemberDB)
	
}
