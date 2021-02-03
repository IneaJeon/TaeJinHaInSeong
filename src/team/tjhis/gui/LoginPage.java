package team.tjhis.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		this.setBounds(500, 120, 400, 495); 
		this.setLayout(null);
		
		
		/*폰트 컬러기본설정*/
		Color c1 = new Color(51, 51, 51);
		Color c2=new Color(255,1,1);
		Font font1 = new Font("나눔고딕", Font.PLAIN, 15);
		Font font2 = new Font("나눔고딕", Font.BOLD, 17);
		Font font3 = new Font("나눔고딕", Font.BOLD, 20);
		

		/* 로그인 필드 */
		JLabel label = new JLabel("로그인");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(font3);
		label.setForeground(new Color(51, 51, 51));
		label.setBounds(160, 30, 67, 15);
		add(label);

		/* 아이디 필드 */
		JTextField idField = new JTextField("아이디");
		idField.setFont(font1);
		idField.setForeground(new Color(204, 204, 204));
		idField.setColumns(10);
		idField.setBounds(0, 80, 400, 64);
		idField.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		add(idField);
		

		/* 비밀번호 필드 */
		JTextField pwdField = new JTextField("비밀번호");
		pwdField.setFont(font1);
		pwdField.setForeground(new Color(204, 204, 204));
		pwdField.setBounds(0, 150, 400, 64);
		pwdField.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		add(pwdField);

		
		/* 로그인 버튼 */
		JButton loginbtn = new JButton("Login");
		loginbtn.setFont(font3);
		loginbtn.setBorderPainted(false);
		loginbtn.setBounds(0, 290, 400, 64);
		loginbtn.setBackground(new Color(0, 122, 251));
		loginbtn.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		loginbtn.setForeground(Color.WHITE);
		
		add(loginbtn);

		/* 아이디찾기 버튼 */
		JButton idBtn = new JButton("아이디 찾기");
		idBtn.setFont(font2);
		idBtn.setBounds(0, 360, 400, 64);
		idBtn.setBackground(new Color(255, 255, 255));
		idBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		idBtn.setForeground(c1);
		add(idBtn);

		/* 비밀번호찾기 버튼 */
		JButton pwdBtn = new JButton("비밀번호 찾기");
		pwdBtn.setFont(font2);
		pwdBtn.setBounds(0, 430, 400, 64);
		pwdBtn.setBackground(new Color(255, 255, 255));
		pwdBtn.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		idBtn.setForeground(c1);
		add(pwdBtn);

		mf.add(loginPage);
		
		/* 클릭 시 mainPage로 이동 */
		loginbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.changePanel(mf, loginPage, new MainPage());
			}
		});
		
		idBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePage.changePanel(mf, loginPage, new FindIdPage());				
			}
		});
		
		pwdBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePage.changePanel(mf, loginPage, new FindPwdPage(mf));				
			}
		});
		
	}
	
}
