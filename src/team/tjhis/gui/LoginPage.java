package team.tjhis.gui;

import java.awt.Color;
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


public class LoginPage extends JPanel {

	private MainFrame mf;
	private JPanel loginPage;
	private int count;
	Login login = new Login();
	boolean isSuccess = false;

	public LoginPage() {}

	public LoginPage(MainFrame mf) {

		this.mf = mf;
		this.loginPage = this;

		/* 패널 레이아웃 */
		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.white);
		
		Image loginimg = new ImageIcon("images/login1.PNG").getImage().getScaledInstance(1440, 790, 0);
		
		JLabel logoLabel = new JLabel(new ImageIcon(loginimg));
		logoLabel.setBounds(0, 0, 1440, 790);


		/* 아이디 필드 */
		JTextField idF = new JTextField(10);
		idF.setText("아이디");
		idF.setSize(336,40);
		idF.setLocation(525, 200);
		idF.setBorder(null);

		/* 비밀번호 필드 */
		JPasswordField pwdF= new JPasswordField(10);
		pwdF.setSize(336,40);
		pwdF.setLocation(525, 270);
		pwdF.setBorder(null);
		
		/* 로그인 버튼 */
		JButton loginbtn = new JButton();
		loginbtn.setSize(400, 64);
		loginbtn.setLocation(525, 357);
		loginbtn.setOpaque(false);
		
		/* 아이디찾기 버튼 */
		JButton idBtn = new JButton();
		idBtn.setSize(400, 64);
		idBtn.setLocation(525, 457);
		idBtn.setOpaque(false);
		
		/* 비밀번호찾기 버튼 */
		JButton pwdBtn = new JButton();
		pwdBtn.setSize(400, 64);
		pwdBtn.setLocation(525, 528);
		pwdBtn.setOpaque(false);
		
		this.add(idF);
		this.add(pwdF);
		this.add(logoLabel);
		this.add(loginbtn);
		this.add(idBtn);
		this.add(pwdBtn);
	
		/* 클릭 시 해당페이지 이동 */
		loginbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				isSuccess = login.login(idF.getText(), pwdF.getText());
				if(isSuccess) {
					PopUpPage.returnPopUp(mf, "", isSuccess);
				} else {
					PopUpPage.popUp(mf, "");
				}
				
			}
			
		});
		
		idBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePage.changePanel(mf, loginPage, new FindIdPage(mf, loginPage));				
			}
		});
		
		pwdBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePage.changePanel(mf, loginPage, new FindPwdPage(mf, loginPage));				
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


	}
	
}
