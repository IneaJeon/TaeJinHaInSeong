package team.tjhis.member;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class MemberDB {
	
	private int logNo;
	
	List <MemberDTO> memberDB = new ArrayList<>();

	String path = "src/team/tjhis/member/members.txt";

	/* 기본 생성자 생성 */
	public MemberDB() {
		super();
	}

	public int getLogNo() {
		return logNo;
	}

	public void setLogNo(int logNo) {
		this.logNo = logNo;
	}
	
	/* 팀원 회원 가입 */
	public void members() {
		
		memberDB.add(new MemberDTO(1, "xogns603", "111", "김태훈", "01045922509", "서울시 서초구"));
		memberDB.add(new MemberDTO(2, "yoojh0219", "111", "유진희", "01095249390", "서울시 서초구"));
		memberDB.add(new MemberDTO(3, "gkdud0857", "111", "민하영", "01024950857", "서울시 서초구"));
		memberDB.add(new MemberDTO(4, "winzerin78", "111", "전인애", "01092899363", "서울시 서초구"));
		memberDB.add(new MemberDTO(5, "good321ok", "111", "김성배", "01049334367", "서울시 서초구"));
		
	}
	
	/* 회원 정보를 파일로 저장하기 위한 출력 */
	public void output() {
		
		ObjectOutputStream objOut = null;
		
		try {
			/* 객체 출력을 기존의 파일에 매번 덮어쓰기 할 경우 */
			objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)));

			for(MemberDTO mb : memberDB) {
				/* 회원 한 명(직렬화한 단위, MemberDTO)을 넣어야 하고 통째로 리스트 넣으면 안 됨 */
				objOut.writeObject(mb);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			if(objOut != null) {
				try {
					objOut.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
		}
		/* 파일에 데이터 옮긴 후 프로그램에서 데이터 삭제 */
		memberDB.clear();
				
	}
	
	/* 회원 정보를 파일로부터 읽어오기 위한 입력 */
	public void input() {
		
		ObjectInputStream objIn = null;
		
		try {
			objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));
			
			while(true) {
				MemberDTO mb = (MemberDTO)objIn.readObject();
				memberDB.add(mb);
			}
		
		} catch (EOFException e) {
			System.out.println("파일 읽기 완료!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
