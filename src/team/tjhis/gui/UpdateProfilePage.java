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

	public UpdateProfilePage(MainFrame mf) {

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
		pwdTf.setSize(250, 40);
		pwdTf.setLocation(650, 224);

		JPasswordField pwdConfirmTf = new JPasswordField(20);
		pwdConfirmTf.setSize(250, 40);
		pwdConfirmTf.setLocation(650, 325);

		JTextField phoneNumTf = new JTextField(20);
		phoneNumTf.setSize(250, 40);
		phoneNumTf.setLocation(650, 425);

		JTextField addrTf = new JTextField(20);
		addrTf.setSize(250, 40);
		addrTf.setLocation(650, 524);

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
						MemberDTO dto = (MemberDTO) objIn.readObject();
						if (pwdTf.getText().equals(pwdConfirmTf.getText()) && !(phoneNumTf.getText().isEmpty())
								&& !(addrTf.getText().isEmpty())) {
							dto.setPwd(pwdTf.getText());
							dto.setPhoneNum(phoneNumTf.getText());
							dto.setAddr(addrTf.getText());
//							System.out.println(dto.getPwd());
//							System.out.println(dto.getPhoneNum());
//							System.out.println(dto.getAddr());
							PopUpPage.successPopUp(mf, "정보 수정이 완료되었습니다.");
							return;
						}
					}
				} catch (FileNotFoundException v) {
					v.printStackTrace();
				} catch (IOException v) {
					PopUpPage.failPopUp(mf, "정보를 다시 입력해주세요.");
				} catch (ClassNotFoundException v) {
					v.printStackTrace();
				}

			}

		});
	}
}
