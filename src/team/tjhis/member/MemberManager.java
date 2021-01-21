package team.tjhis.member;

public class MemberManager {
	
	public MemberManager() {}
	
	public void signUp() {
		
		SignUp signUp = new SignUp();
		
	}

	public void login() {
		
		Login login = new Login();
		
	}

	public void amend() { 
		
		MyDataAmend amend = new MyDataAmend();
		
	}

	public void withdraw() {
		
		MemberWithdraw withdraw = new MemberWithdraw();
		
	}

	public void findId() {
		
		FindId findId = new FindId();
		
		
		
	}
	
	public void findPwd(MemberDB db) {
		
		FindPwd findPwd = new FindPwd();
		
		findPwd.findPwd(db);
	}
	
	
	
}
