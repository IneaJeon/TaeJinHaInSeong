package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import team.tjhis.member.MemberDTO;

public class FindIdPage extends JPanel {

	MainFrame mf;
	JPanel op;
	
	public FindIdPage() {}

	public FindIdPage(MainFrame mf) {

		String dbFile = "src/team/tjhis/memberDB.txt";
		this.mf = mf;
		this.op = this;

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.white);

		Image id = new ImageIcon("images/findId.PNG").getImage().getScaledInstance(1440, 790, 0);

		JLabel lb = new JLabel(new ImageIcon(id));
		lb.setSize(1440, 790);

		JTextField nameTf = new JTextField(20);
		nameTf.setSize(250, 40);
		nameTf.setLocation(640, 310);

		JTextField phoneNumTf = new JTextField(20);
		phoneNumTf.setSize(250, 40);
		phoneNumTf.setLocation(640, 430);

		JButton btn = new JButton("확인");
		btn.setSize(200, 50);
		btn.setLocation(620, 633);
		btn.setOpaque(false);

		this.add(lb);
		this.add(nameTf);
		this.add(phoneNumTf);
		this.add(btn);
		
		btn.addActionListener(new ActionListener() {
			ObjectInputStream objIn = null;

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dbFile)));

					while (true) {
						MemberDTO dto = (MemberDTO) objIn.readObject();
						if (nameTf.getText().equals(dto.getName()) && phoneNumTf.getText().equals(dto.getPhoneNum())) {
							PopUpPage.popUp(mf, nameTf.getText() + "회원님의 ID는 " + dto.getId() + "입니다.");
							return;
						}
					}

				} catch (EOFException e1) {
					PopUpPage.popUp(mf, "일치하는 회원의 정보가 없습니다. 다시 입력해주세요.");
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
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
	}
}
