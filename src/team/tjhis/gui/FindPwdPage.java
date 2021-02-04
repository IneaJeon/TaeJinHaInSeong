package team.tjhis.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import team.tjhis.member.MemberDB;
import team.tjhis.member.MemberDTO;

public class FindPwdPage extends JPanel {
	
	MainFrame mf;
	JPanel op;
	JPanel np;
	boolean isSuccess;
	int index = 0;
	
	public FindPwdPage(MainFrame mf, JPanel sip) {
		
		this.mf = mf;
		this.op = this;
		this.np = sip;
		
		MemberDB.input();		
		
		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		Font font = new Font("font-family", Font.BOLD, 17);
		Image findPwdPageImage = new ImageIcon("images/findPwdPage_panel.PNG").getImage().getScaledInstance(1440, 790, 0);
		JLabel pwdLabel = new JLabel(new ImageIcon(findPwdPageImage));
		pwdLabel.setBounds(0, 0, 1440, 790);
		JTextField nameField = new JTextField(20);
		JTextField idField = new JTextField(20);
		JTextField phoneNumField = new JTextField(20);
		nameField.setOpaque(false);
		idField.setOpaque(false);
		phoneNumField.setOpaque(false);
		nameField.setBorder(null);
		idField.setBorder(null);
		phoneNumField.setBorder(null);
		nameField.setFont(font);
		idField.setFont(font);
		phoneNumField.setFont(font);
		nameField.setText("이름");
		idField.setText("아이디");
		phoneNumField.setText("핸드폰 번호");
		nameField.setBounds(583, 190, 274, 39);
		idField.setBounds(583, 258, 274, 39);
		phoneNumField.setBounds(583, 326, 274, 39);
		
		JButton signInbtn = new JButton();
		signInbtn.setBounds(621, 430, 200, 50);
		signInbtn.setOpaque(false);
		
		this.add(idField);
		this.add(nameField);
		this.add(phoneNumField);
		this.add(pwdLabel);
		this.add(signInbtn);
		
		idField.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(idField.getText().equals("아이디")) {
					
					idField.setText("");
					
				}
				
			}
			
		});
		
		nameField.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(nameField.getText().equals("이름")) {
					
					nameField.setText("");
					
				}
				
			}
			
		});
		
		phoneNumField.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(phoneNumField.getText().equals("핸드폰 번호")) {
					
					phoneNumField.setText("");
					
				}
				
			}
			
		});
		
		signInbtn.addActionListener(new ActionListener() { // 아이디 찾기 버튼을 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for(int i = 0 ; i < MemberDB.memberDB.size() ; i++) {
					
					if(MemberDB.memberDB.get(i).getId().equals(idField.getText())
							&& MemberDB.memberDB.get(i).getName().equals(nameField.getText())
							&& MemberDB.memberDB.get(i).getPhoneNum().equals(phoneNumField.getText())) {
						// 성공 팝업을 띄워주고 메세지로 비밀번호를 알려줌
						PopUpPage.findIdSuccessPopUp(mf, "images/pwdFind.PNG", MemberDB.memberDB.get(index).getPwd());
						// 성공 여부 변경
						isSuccess = true;
						break;
						
					}
					
				}
				
				if(isSuccess) {
					
					ChangePage.changePanel(mf, op, np);
					
				} else {
					
					PopUpPage.popUp(mf, "images/updateIncomplete.PNG");
					
				}
				
			}	
			
		});
		
	}
	
}
