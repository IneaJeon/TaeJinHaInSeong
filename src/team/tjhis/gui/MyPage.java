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

public class MyPage extends JPanel {

	MainFrame mf;
	JPanel op;

	public MyPage() {
	}

	public MyPage(MainFrame mf) {

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
		String nameText = "" + md.getName();
		nameArea.append(nameText);
		nameArea.setEditable(false);

		JTextArea IdArea = new JTextArea();
		IdArea.setSize(336, 30);
		IdArea.setLocation(554, 292);
		String IdText = "" + md.getId();
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

		this.add(lb);
		this.add(pwdTf);
		this.add(pwdConfirmTf);
		this.add(phoneNumTf);
		this.add(addrTf);
		this.add(updateButton);
		this.add(withdrawButton);

		updateButton.addActionListener(new ActionListener() {
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
							PopUpPage.returnPopUp(mf, "images/updateComplete.png");
							return;
						}
					}

				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					PopUpPage.popUp(mf, "images/updateIncomplete.png");
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} finally {
					if (objIn != null) {
						try {
							objIn.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}

				}

			}

		});

		withdrawButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});
	}
}
