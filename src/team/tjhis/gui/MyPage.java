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

import team.tjhis.member.MemberDB;
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

public class MyPage extends JPanel {

	MainFrame mf;
	JPanel op;
	int index = 0;

	public MyPage() {
	}

	public MyPage(MainFrame mf) {

		MemberDB.input();
		
		for(int i = 0 ; i < MemberDB.memberDB.size() ; i++) {
			
			if(MemberDB.memberDB.get(i).getNo() == MemberDB.logNo) {
				
				index = i;
				break;
				
			}
			
		}

		String dbFile = "src/team/tjhis/member/members.txt";

		this.mf = mf;
		this.op = this;

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.white);

		Image update = new ImageIcon("images/myPage.PNG").getImage().getScaledInstance(1440, 790, 0);

		JLabel lb = new JLabel(new ImageIcon(update));
		lb.setSize(1440, 790);

		JPasswordField pwdTf = new JPasswordField(20);
		pwdTf.setSize(336, 40);
		pwdTf.setLocation(554, 342);
		pwdTf.setBorder(null);

		JPasswordField pwdConfirmTf = new JPasswordField(20);
		pwdConfirmTf.setSize(336, 40);
		pwdConfirmTf.setLocation(554, 403);
		pwdConfirmTf.setBorder(null);

		JTextField phoneNumTf = new JTextField(20);
		phoneNumTf.setSize(336, 40);
		phoneNumTf.setLocation(554, 462);
		phoneNumTf.setBorder(null);

		JTextField addrTf = new JTextField(20);
		addrTf.setSize(336, 40);
		addrTf.setLocation(554, 525);
		addrTf.setBorder(null);

		JTextArea nameArea = new JTextArea();
		nameArea.setSize(336, 30);
		nameArea.setLocation(554, 230);
		String nameText = "" + MemberDB.memberDB.get(index).getName();
		nameArea.append(nameText);
		nameArea.setEditable(false);

		JTextArea IdArea = new JTextArea();
		IdArea.setSize(336, 30);
		IdArea.setLocation(554, 292);
		String IdText = "" + MemberDB.memberDB.get(index).getId();
		IdArea.append(IdText);
		IdArea.setEditable(false);

		JButton updateButton = new JButton();
		updateButton.setSize(150, 50);
		updateButton.setLocation(736, 645);
		updateButton.setOpaque(false);

		JButton withdrawButton = new JButton();
		withdrawButton.setSize(150, 50);
		withdrawButton.setLocation(552, 645);
		withdrawButton.setOpaque(false);

		this.add(pwdTf);
		this.add(pwdConfirmTf);
		this.add(phoneNumTf);
		this.add(addrTf);
		this.add(IdArea);
		this.add(nameArea);
		this.add(lb);
		this.add(updateButton);
		this.add(withdrawButton);
		

		updateButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (pwdTf.getText().equals(pwdConfirmTf.getText()) && !(phoneNumTf.getText().isEmpty())
						&& !(addrTf.getText().isEmpty())) {

					MemberDB.memberDB.get(index).setPwd(pwdTf.getText());
					MemberDB.memberDB.get(index).setPhoneNum(phoneNumTf.getText());
					MemberDB.memberDB.get(index).setAddr(addrTf.getText());
					PopUpPage.returnPopUp(mf, "images/updateComplete.png");
					
				} else {
					
					PopUpPage.popUp(mf, "images/updateIncomplete.png");
					
				}
				
			}

		});

		withdrawButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				PopUpPage.withdrawPopUp(mf, "images/popUpWithdraw.png");
			}

		});
	}
}
