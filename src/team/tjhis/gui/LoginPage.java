package team.tjhis.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPage extends JPanel {
	// 패널의 기능 (패널 하나로 되게 함)

	// 메인 프레임, LoginPage 저장 수 있게 전달 받은 놈 전역변수로 유지
	private MainFrame mf;
	private JPanel loginPage;

	/* 기본생성자 */
	public LoginPage() {
	}

	public LoginPage(MainFrame mf) {

		this.mf = mf;
		this.loginPage = this;

		/* 패널 레이아웃 */
		this.setBounds(250, 120, 1440, 790);
		this.setLayout(null);
		this.setSize(400 / 2, 550 / 2);
		this.setBackground(Color.WHITE);
		
		/*폰트 컬러기본설정*/
		Color c1 = new Color(51, 51, 51);
		Font font1 = new Font("font-family", Font.PLAIN, 12);
		Font font2 = new Font("font-family", Font.BOLD, 17);

		/* 로그인 필드 */
		JLabel label = new JLabel("로그인");
		label.setFont(font2);
		label.setBounds(80, 20, 67, 15);
		add(label);

		/* 아이디 필드 */
		JTextField idField = new JTextField("아이디");
		idField.setColumns(10);
		idField.setBounds(0, 60, 200, 32);
		idField.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		add(idField);

		/* 비밀번호 필드 */
		JTextField pwdField = new JTextField("비밀번호");
		pwdField.setBounds(0, 100, 200, 32);
		pwdField.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		add(pwdField);

		/* 로그인 버튼 */
		JButton btn = new JButton("Login");
		btn.setBorderPainted(false);
		btn.setBounds(0, 160, 200, 32);
		btn.setBackground(new Color(0, 122, 251));
		btn.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		btn.setForeground(Color.WHITE);
		this.add(btn);

		/* 아이디찾기 버튼 */
		JButton idBtn = new JButton("아이디 찾기");
		idBtn.setFont(font1);
		idBtn.setBounds(0, 200, 200, 32);
		idBtn.setBackground(new Color(255, 255, 255));
		idBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		idBtn.setForeground(c1);
		add(idBtn);

		/* 비밀번호찾기 버튼 */
		JButton pwdBtn = new JButton("비밀번호 찾기");
		pwdBtn.setFont(font1);
		pwdBtn.setBounds(0, 240, 200, 32);
		pwdBtn.setBackground(new Color(255, 255, 255));
		pwdBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		idBtn.setForeground(c1);
		add(pwdBtn);

		/* 클릭 시 mainPage로 이동 */
		this.addMouseListener(new MyMouseAdapter());

		/* MainFrame에 loginPage 붙이기 */
		mf.add(loginPage);

		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	/* Listener 대신 Adapter 상속받아 모든 기능 구현할 필요없이 MouseAdapter만 구현 */
	private class MyMouseAdapter extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {

			ChangePage.changePanel(mf, loginPage, new MainPage()); // 로그인페이지에서 메인페이지로 이동
		}

	}

}
