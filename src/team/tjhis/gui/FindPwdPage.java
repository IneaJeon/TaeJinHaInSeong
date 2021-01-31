package team.tjhis.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import team.tjhis.member.MemberDTO;

public class FindPwdPage extends JPanel {
	
	MainFrame mf;
	JPanel op;
	JPanel np;
	boolean isSuccess;
	
	public FindPwdPage(MainFrame mf/*, SignInPage sip*/) {
		
		this.mf = mf;
		this.op = this;
//		this.np = sip;
		
		this.setLayout(null);
		this.setSize(1440/2, 830/2);
		this.setBackground(new Color(0, 122, 251));
		
		JTextField idField = new JTextField(20);
		JTextField nameField = new JTextField(20);
		JTextField phoneNumField = new JTextField(20);
		
		JLabel idLabel = new JLabel("아이디 : ");
		JLabel nameLabel = new JLabel("이름 : ");
		JLabel phoneNumLabel = new JLabel("핸드폰 번호 : ");
		
		idField.setBounds(350, 20, 300, 20);
		nameField.setBounds(350, 65, 300, 20);
		phoneNumField.setBounds(350, 110, 300, 20);
		nameLabel.setBounds(50, 20, 300, 20);
		idLabel.setBounds(50, 65, 300, 20);
		phoneNumLabel.setBounds(50, 110, 300, 20);
		
		JButton signInbtn = new JButton("아이디 찾기");
		signInbtn.setBounds(290, 230, 90, 30);
		
		signInbtn.addActionListener(new ActionListener() { // 아이디 찾기 버튼을 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ObjectInputStream objIn = null;
				try {
					
					MemberDTO temp = new MemberDTO();
					objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(MainFrame.PATH)));
					
					while(true) {
						// 파일에서 회원 데이터를 객채 하나단위로 읽어와서 temp에 저장
						temp = (MemberDTO)objIn.readObject();
						// GUI에서 입력한 아이디, 이름, 폰번호가 회원 데이터랑 모두 일치할 시
						if(temp.getId().equals(idField.getText())
								&& temp.getName().equals(nameField.getText())
								&& temp.getPhoneNum().equals(phoneNumField.getText())) {
							// 성공 팝업을 띄워주고 메세지로 비밀번호를 알려줌
							PopUpPage.successPopUp(mf, "회원님의 비밀번호는 [" + temp.getPwd() + "] 입니다.");
							// 성공 여부 변경
							isSuccess = true;
							break;
						}
					}
				} catch (EOFException e1) {
					// 일치하는 데이터를 찾지 못하고 파일의 끝을 만나면 실패 팝업 뛰워줌
					PopUpPage.failPopUp(mf, "입력하신 정보와 일치하는 회원이 존재하지 않습니다.");
					
				} catch (FileNotFoundException e1) {
					
					e1.printStackTrace();
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
					
				} catch (ClassNotFoundException e1) {
					
					e1.printStackTrace();
					
				} finally { // 자원반납
					
					if(objIn != null) {
						
						try {
							
							objIn.close();
							
						} catch (IOException e1) {
							
							e1.printStackTrace();
							
						}
						
					}
					
				} // 성공했으면 매개변수로 넘겨받은 로그인페이지로 이동
				if(isSuccess) {
					ChangePage.changePanel(mf, op, np);
				}
				
			}
			
		});
		
	}
	
}
