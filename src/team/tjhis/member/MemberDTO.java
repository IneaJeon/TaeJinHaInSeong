package team.tjhis.member;

public class MemberDTO {
	
	private int no;				// 회원번호
	private String id;			// 아이디
	private String pwd;			// 비밀번호
	private String name;		// 이름
	private String phoneNum;	// 폰번호
	private String addr;		// 주소
	
	
	// 기본 생성자
	public MemberDTO() {
		super();
	}
	
	// 매개변수 있는 생성자
	public MemberDTO(int no, String id, String pwd, String name, String phoneNum, String addr) {
		super();
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phoneNum = phoneNum;
		this.addr = addr;
	}
	
	// getter와 setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	@Override
	public String toString() {
		return "MemberDTO [no=" + no + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", phoneNum=" + phoneNum
				+ ", addr=" + addr + "]";
	}

	
}
