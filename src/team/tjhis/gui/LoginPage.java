package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPage extends JPanel {

	private MainFrame mf;
	private JPanel loginPage;
	private int count;

	public LoginPage() {}

	public LoginPage(MainFrame mf) {

		this.mf = mf;
		this.loginPage = this;

		/* 패널 레이아웃 */
		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.white);
		
		/*폰트 컬러기본설정*/
		
		Image loginimg = new ImageIcon("images/login.PNG").getImage().getScaledInstance(1440, 790, 0);
		
		JLabel logoLabel = new JLabel(new ImageIcon(loginimg));
		logoLabel.setBounds(0, 0, 1440, 790);

		/* 아이디 필드 */
		JTextField idField = new JTextField();
		idField.setSize(400, 64);
		idField.setLocation(520, 185);
		idField.setOpaque(false);

		/* 비밀번호 필드 */
		JTextField pwdField = new JTextField();
		pwdField.setSize(400, 64);
		pwdField.setLocation(520, 255);
		pwdField.setOpaque(false);
		
		/* 로그인 버튼 */
		JButton loginbtn = new JButton();
		loginbtn.setSize(400, 64);
		loginbtn.setLocation(520, 388);
		loginbtn.setOpaque(false);
		
		/* 아이디찾기 버튼 */
		JButton idBtn = new JButton();
		idBtn.setSize(400, 64);
		idBtn.setLocation(520, 457);
		idBtn.setOpaque(false);
		
		/* 비밀번호찾기 버튼 */
		JButton pwdBtn = new JButton();
		pwdBtn.setSize(400, 64);
		pwdBtn.setLocation(520, 528);
		pwdBtn.setOpaque(false);
		
		loginPage.add(logoLabel);
		loginPage.add(idField);
		loginPage.add(pwdField);
		
		loginPage.add(loginbtn);
		loginPage.add(idBtn);
		loginPage.add(pwdBtn);
		
		mf.add(loginPage);
		
		/* 클릭 시 mainPage로 이동 */
		loginbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.changePanel(mf, loginPage, new MainPage(mf));
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
