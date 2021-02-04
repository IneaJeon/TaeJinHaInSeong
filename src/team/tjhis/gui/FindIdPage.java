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

public class FindIdPage extends JPanel {

	MainFrame mf;
	JPanel op;
	JPanel np;
	boolean isSuccess;

	public FindIdPage() {
	}

	public FindIdPage(MainFrame mf, JPanel np) {

		MemberDB.input();

		this.mf = mf;
		this.op = this;
		this.np = np;

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.white);

		Image id = new ImageIcon("images/findId.PNG").getImage().getScaledInstance(1440, 790, 0);

		JLabel lb = new JLabel(new ImageIcon(id));
		lb.setSize(1440, 790);

		Font font = new Font("돋움", Font.PLAIN, 17);

		JTextField nameTf = new JTextField(20);
		nameTf.setSize(336, 40);
		nameTf.setLocation(554, 324);
		nameTf.setFont(font);
		nameTf.setText("이름");
		nameTf.setBorder(null);

		JTextField phoneNumTf = new JTextField(20);
		phoneNumTf.setSize(336, 40);
		phoneNumTf.setLocation(554, 403);
		phoneNumTf.setFont(font);
		phoneNumTf.setText("휴대폰");
		phoneNumTf.setBorder(null);

		JButton btn = new JButton("확인");
		btn.setSize(350, 50);
		btn.setLocation(545, 575);
		btn.setOpaque(false);

		this.add(nameTf);
		this.add(phoneNumTf);
		this.add(lb);
		this.add(btn);

		nameTf.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				if (nameTf.getText().equals("이름")) {

					nameTf.setText("");

				}

			}

		});

		phoneNumTf.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				if (phoneNumTf.getText().equals("휴대폰")) {

					phoneNumTf.setText("");

				}

			}

		});

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < MemberDB.memberDB.size(); i++) {

					if (nameTf.getText().equals(MemberDB.memberDB.get(i).getName())
							&& phoneNumTf.getText().equals(MemberDB.memberDB.get(i).getPhoneNum())) {
						String text = "    " + MemberDB.memberDB.get(i).getId() + "    ";
						PopUpPage.findIdSuccessPopUp(mf, "images/idFind.png", text);

						isSuccess = true;
						break;
					}
				}

				if (isSuccess == true) {
					ChangePage.changePanel(mf, op, np);

				} else {
					PopUpPage.popUp(mf, "images/updateIncomplete.png");
				}
			}

		});
	}
}
