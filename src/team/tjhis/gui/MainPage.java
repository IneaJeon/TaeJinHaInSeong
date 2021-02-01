package team.tjhis.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPage extends JPanel {

	private MainFrame mf; // 메인프레임 저장 변수
	private JPanel mp; // 메인페이지(자기자신) 저장 변수
	
	public MainPage() {}
	public MainPage(MainFrame mf) {
		
		this.mf = mf;
		this.mp = this;

		this.setLayout(null);
		this.setBounds(0, 0, 1440/2, 1176/2);
		this.setBackground(new Color(0, 122, 251));
		
		JButton goSignUpPage = new JButton("sign up"); // sign up 버튼
		JButton goSignInPage = new JButton("sign in"); // sign in 버튼
		JButton goMyPage = new JButton("myPage"); // myPage 버튼
		JButton goOrderPage = new JButton("order"); // order 버튼
		
		goSignInPage.setBounds(200, 150, 90, 30);
		goSignUpPage.setBounds(350, 150, 90, 30);
		goMyPage.setBounds(200, 220, 90, 30);
		goOrderPage.setBounds(350, 220, 90, 30);
		this.add(goSignUpPage);
		this.add(goSignInPage);
		this.add(goMyPage);
		this.add(goOrderPage);
		
		goSignUpPage.addActionListener(new ActionListener() { // sign up 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				ChangePage.changePanel(mf, mp, new SignUpPage(mf));
						
			}
			
		});
		
		goSignInPage.addActionListener(new ActionListener() { // sign in 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.changePanel(mf, mp, new LoginPage(mf));
				
			}
			
		});
		
		goMyPage.addActionListener(new ActionListener() { // myPage 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				ChangePage.changePanel(mf, mp, new MyPageMenuPage(mf));
				
			}
			
		});
		
		goOrderPage.addActionListener(new ActionListener() { // order 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				ChangePage.changePanel(mf, mp, new OrderPage(mf));
				
			}
			
		});
		
	}
	
}
