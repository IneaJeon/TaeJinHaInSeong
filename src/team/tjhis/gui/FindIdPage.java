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
import javax.swing.JTextArea;
import javax.swing.JTextField;

import team.tjhis.member.MemberDTO;

public class FindIdPage extends JPanel {

	MainFrame mf;
	JPanel op;
	
	public FindIdPage(MainFrame mf) {
		
		String dbFile = "src/team/tjhis/memberDB.txt";
		this.mf = mf;
		this.op = this;

		this.setLayout(null);
		this.setSize(1440 / 2, 830 / 2);
		this.setBackground(new Color(0, 122, 251));
		
		JLabel title = new JLabel("ID 찾기");
		title.setSize(100,30);
		title.setLocation(325, 50);
		
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setSize(30,30);
		nameLabel.setLocation(200,110);
		
		JLabel pnLabel = new JLabel("휴대폰번호");
		pnLabel.setSize(100,30);
		pnLabel.setLocation(200, 160);
		
		JTextField nameTf = new JTextField(20);
		nameTf.setSize(150,30);
		nameTf.setLocation(300, 110);
		
		JTextField pnTf = new JTextField(20);
		pnTf.setSize(150,30);
		pnTf.setLocation(300, 160);
		
		JTextArea textArea = new JTextArea();
		textArea.setSize(1440/2, 30);
		textArea.setLocation(0, 346);
		textArea.setEditable(false);

		JButton btn = new JButton("확인");
		btn.setSize(100,50);
		btn.setLocation(300, 230);
		
		this.add(title);
		this.add(nameLabel);
		this.add(pnLabel);
		this.add(nameTf);
		this.add(pnTf);
		this.add(textArea);
		this.add(btn);

		btn.addActionListener(new ActionListener() {

			ObjectInputStream objIn = null;

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dbFile)));

					while (true) {
						MemberDTO dto = (MemberDTO) objIn.readObject();
						if (nameTf.getText().equals(dto.getName()) && pnTf.getText().equals(dto.getPhoneNum())) {
							String text = nameTf.getText() + "회원님의 ID는 " + dto.getId() + "입니다.";
							textArea.append(text);
							return;
						}
					}
				} catch (EOFException v) {
					System.out.println("일치하는 회원의 정보가 없습니다.");
				} catch (FileNotFoundException v) {
					v.printStackTrace();
				} catch (IOException v) {
					v.printStackTrace();
				} catch (ClassNotFoundException v) {
					v.printStackTrace();
				} finally {
					if (objIn != null) {
						try {
							objIn.close();
						} catch (IOException v) {
							v.printStackTrace();
						}
					}
				}
			}
		});
	}

//	public void findId() {
//
//		new FindIdPage(mf);
//	}
}
