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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import team.tjhis.member.Login;
import team.tjhis.member.MemberDB;
import team.tjhis.member.SignUp;

public class SignUpPage extends JPanel {

	private MainFrame mf;
	private JPanel signUpPage;
	boolean isFailed;

	/* 기본생성자 */
	public SignUpPage() {
	}

	public SignUpPage(MainFrame mf) {

		this.mf = mf;
		this.signUpPage = this;
		SignUp su = new SignUp();
		
		MemberDB.input();

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		/* 회원가입 */
		Image signUpImg = new ImageIcon("images/signUpPage.PNG").getImage().getScaledInstance(1440, 790, 0);

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
		JPasswordField pwdF = new JPasswordField(20);
		pwdF.setSize(336, 40);
		pwdF.setLocation(554, 320);
		pwdF.setBorder(null);

		/* 비번확인 필드 */
		JPasswordField pwdDF = new JPasswordField(20);
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
		signUpBtn.setLocation(620, 620);
		signUpBtn.setOpaque(false);

		JButton sbtn = new JButton("확인");
		sbtn.setSize(100, 45);
		sbtn.setLocation(915, 255);
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

				for (int i = 0; i < MemberDB.memberDB.size(); i++) {

					if (MemberDB.memberDB.get(i).getId().equals(idF.getText())) {

						isFailed = true;
						break;

					} else {

						isFailed = false;

					}

				}

				if (isFailed) {

					PopUpPage.popUp(mf, "images/noUseId.png"); 

				} else {

					PopUpPage.popUp(mf, "images/useId.png");// 사용할 수 있는 아이디입니다 안내 팝업창ㄴ

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