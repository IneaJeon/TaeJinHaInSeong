package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import team.tjhis.member.MemberDTO;
import team.tjhis.member.UpdateProfile;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UpdateProfilePage extends JPanel {

	MainFrame mf;
	JPanel op;

	public UpdateProfilePage() {}
	
	public UpdateProfilePage(MainFrame mf) {
		
		MemberDTO md = new MemberDTO();

		String dbFile = "src/team/tjhis/memberDB.txt";

		this.mf = mf;
		this.op = this;

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.white);

		Image update = new ImageIcon("images/updateProfile.PNG").getImage().getScaledInstance(1440, 790, 0);

		JLabel lb = new JLabel(new ImageIcon(update));
		lb.setSize(1440, 790);

		JPasswordField pwdTf = new JPasswordField(20);
		pwdTf.setSize(250, 30);
		pwdTf.setLocation(642, 332);
		pwdTf.setBorder(null);

		JPasswordField pwdConfirmTf = new JPasswordField(20);
		pwdConfirmTf.setSize(250, 30);
		pwdConfirmTf.setLocation(642, 400);
		pwdConfirmTf.setBorder(null);

		JTextField phoneNumTf = new JTextField(20);
		phoneNumTf.setSize(250, 30);
		phoneNumTf.setLocation(640, 470);
		phoneNumTf.setBorder(null);

		JTextField addrTf = new JTextField(20);
		addrTf.setSize(250, 30);
		addrTf.setLocation(640, 540);
		addrTf.setBorder(null);
		
		JTextArea nameArea = new JTextArea();
		nameArea.setSize(250,27);
		nameArea.setLocation(643, 200);
		String nameText = "" + md.getName();
		nameArea.append(nameText);
		nameArea.setEditable(false);
		
		JTextArea IdArea = new JTextArea();
		IdArea.setSize(250,27);
		IdArea.setLocation(643, 268);
		String IdText = "" + md.getId();
		IdArea.append(nameText);
		IdArea.setEditable(false);
		
		JButton btn = new JButton("회원정보 수정");
		btn.setSize(200, 50);
		btn.setLocation(620, 631);
		btn.setOpaque(false);

		this.add(lb);
		this.add(pwdTf);
		this.add(pwdConfirmTf);
		this.add(phoneNumTf);
		this.add(addrTf);
		this.add(btn);

		btn.addActionListener(new ActionListener() {
			ObjectInputStream objIn = null;

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dbFile)));

					while (true) {
						MemberDTO md = (MemberDTO) objIn.readObject();
						if (pwdTf.getText().equals(pwdConfirmTf.getText()) && !(phoneNumTf.getText().isEmpty())
								&& !(addrTf.getText().isEmpty())) {
							md.setPwd(pwdTf.getText());
							md.setPhoneNum(phoneNumTf.getText());
							md.setAddr(addrTf.getText());
							PopUpPage.successPopUp(mf, "회원정보 수정이 완료되었습니다.");
							return;
						}
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					PopUpPage.failPopUp(mf, "회원정보를 다시 입력해주세요.");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} finally {
					if(objIn != null) {
						try {
							objIn.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				}

			}

		});
	}
}
