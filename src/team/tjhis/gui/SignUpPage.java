package team.tjhis.gui;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import team.tjhis.member.MemberDB;
import team.tjhis.member.SignUp;

public class SignUpPage extends JPanel {

	private MainFrame mf;
	private JPanel signUpPage;

	/* 기본생성자 */
	public SignUpPage() {
	}

	public SignUpPage(MainFrame mf) {

		this.mf = mf;
		this.signUpPage = this;
		SignUp su = new SignUp();

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		/* 회원가입 */
		Image signUpImg = new ImageIcon("images/signUp.PNG").getImage().getScaledInstance(1440, 790, 0);

		JLabel logoLabel = new JLabel(new ImageIcon(signUpImg));
		logoLabel.setBounds(0, 0, 1440, 790);

		/* 이름 필드 */
		JTextField nameF = new JTextField(20);
		nameF.setBorder(null);
		nameF.setText("이름");
		nameF.setSize(336, 40);
		nameF.setLocation(554, 200);
		/* id 필드 */
		JTextField idF = new JTextField(20);
		idF.setText("아이디");
		idF.setSize(336, 40);
		idF.setLocation(554, 260);
		idF.setBorder(null);

		/* 비번 필드 */
		JTextField pwdF = new JTextField(20);
		pwdF.setText("비밀번호");
		pwdF.setSize(336, 40);
		pwdF.setLocation(554, 320);
		pwdF.setBorder(null);

		/* 비번확인 필드 */
		JTextField pwdDF = new JTextField(20);
		pwdDF.setText("비밀번호 확인");
		pwdDF.setSize(336, 40);
		pwdDF.setLocation(554, 380);
		pwdDF.setBorder(null);

		/* 전화번호 필드 */
		JTextField phonF = new JTextField(20);
		phonF.setText("전화번호");
		phonF.setSize(336, 40);
		phonF.setLocation(554, 440);
		phonF.setBorder(null);

		/* 주소 필드 */
		JTextField adrF = new JTextField(20);
		adrF.setText("주소");
		adrF.setSize(336, 40);
		adrF.setLocation(554, 500);
		adrF.setBorder(null);

		/* 확인 필드 */
		JButton signUpBtn = new JButton("확인");
		signUpBtn.setSize(205, 50);
		signUpBtn.setLocation(620, 595);
		signUpBtn.setOpaque(false);
		
		JButton sbtn = new JButton("확인");
		sbtn.setSize(100, 45);
		sbtn.setLocation(915, 195);
		sbtn.setOpaque(false);

		this.add(nameF);
		this.add(idF);
		this.add(pwdF);
		this.add(pwdDF);
		this.add(phonF);
		this.add(adrF);
		this.add(logoLabel);
		this.add(signUpBtn);
		this.add(sbtn);

		signUpBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				su.signUpStart(idF.getText(), pwdF.getText(), nameF.getText(), phonF.getText(), adrF.getText());
				ChangePage.changePanel(mf, signUpPage, new MainPage(mf));
				PopUpPage.popUp(mf, "images/welcome.png");
			}
		});
		
		sbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				for(int i = 0 ; i < MemberDB.memberDB.size() ; i++) {
					
					if(MemberDB.memberDB.get(i).getId().equals(idF.getText())) {
						
						PopUpPage.popUp(mf, ""); // 중복 경고 메세지
						
					}
					
				}
				
			}
		});
		
		nameF.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (nameF.getText().equals("이름")) {
					nameF.setText("");
				}
			}
		});

		idF.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (idF.getText().equals("아이디")) {
					idF.setText("");
				}
			}
		});

		pwdF.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (pwdF.getText().equals("비밀번호")) {
					pwdF.setText("");
				}
			}
		});

		pwdDF.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (pwdDF.getText().equals("비밀번호 확인")) {
					pwdDF.setText("");
				}
			}
		});
		
		phonF.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (phonF.getText().equals("전화번호")) {
					phonF.setText("");
				}
			}
		});
		
		adrF.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (adrF.getText().equals("주소")) {
					adrF.setText("");
				}
			}
		});
	}

}