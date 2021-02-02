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
import javax.swing.JTextArea;
import javax.swing.JTextField;

import team.tjhis.member.FindId;
import team.tjhis.member.MemberDTO;

public class FindIdPage extends JPanel {

	MainFrame mf;
	JPanel op;
	
	public FindIdPage(MainFrame mf) {
		
		String dbFile = "src/team/tjhis/memberDB.txt";
		this.mf = mf;
		this.op = this;

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.white);
		
		Image top = new ImageIcon("images/topid.PNG").getImage();
		Image list = new ImageIcon("images/idlist.PNG").getImage();
		
		JLabel topLabel = new JLabel(new ImageIcon(top));
		topLabel.setSize(1400,100);
		topLabel.setLocation(0, 0);
		
		JLabel listLabel = new JLabel(new ImageIcon(list));
		listLabel.setSize(90,120);
		listLabel.setLocation(180, 150);
		
		JTextField nameTf = new JTextField(20);
		nameTf.setSize(150,30);
		nameTf.setLocation(300, 167);
		
		JTextField pnTf = new JTextField(20);
		pnTf.setSize(150,30);
		pnTf.setLocation(300, 223);
		
		JButton btn = new JButton("확인");
		btn.setSize(120, 35);
		btn.setLocation(280, 300);
		btn.setBackground(new Color(0, 122, 251));
		btn.setForeground(Color.white);
		
		JTextArea textArea = new JTextArea();
		textArea.setSize(1440, 20);
		textArea.setLocation(0, 394);
		textArea.setBackground(new Color(0, 122, 251));
		textArea.setEditable(false);
		textArea.setForeground(Color.white);

		
		this.add(topLabel);
		this.add(listLabel);
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
							textArea.setText("");
							String text = nameTf.getText() + "회원님의 ID는 " + dto.getId() + "입니다.";
							textArea.append(text);
							return;
						}
					}
				} catch (EOFException v) {
					textArea.setText("");
					String text = "일치하는 회원의 정보가 없습니다. 다시 입력해주세요.";
					textArea.append(text);
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
//		new FindId(mf);
//	}
}
