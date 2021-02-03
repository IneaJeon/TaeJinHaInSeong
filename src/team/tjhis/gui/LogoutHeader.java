package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LogoutHeader extends JPanel {

	private MainFrame mf;
	private JPanel header;
	
	public LogoutHeader() {}
	public LogoutHeader(MainFrame mf) {
		this.mf = mf;
		this.header = this;
		
		Image headerImage = new ImageIcon("images/logoutHeader.PNG").getImage().getScaledInstance(1440, 120, 0);
		
		JLabel hlabel = new JLabel(new ImageIcon(headerImage));
		hlabel.setBounds(0, 0, 1440, 120);
		
		this.setBounds(0, 0, 1440, 120);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
		JButton goSignIn = new JButton(); // 로그인 버튼
		JButton goSignUp = new JButton(); // 회원가입 버튼
		JButton goMainPage = new JButton(); // 로고 버튼
		
		goSignIn.setBounds(1147, 30, 55, 25);
		goSignUp.setBounds(1224, 30, 74, 25);
		goMainPage.setBounds(656, 23, 107, 37);
		
		goSignIn.setOpaque(false);
		goSignUp.setOpaque(false);
		goMainPage.setOpaque(false);
		
		header.add(hlabel);
		mf.add(header);
		
		goSignIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.changePanel(mf, MainFrame.body, new LoginPage(mf));
				
			}
			
		});
		
		goSignUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.changePanel(mf, MainFrame.body, new SignUpPage(mf));
				
			}
			
		});
		
		goMainPage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.returnMainPage(mf, MainFrame.body);
				
			}
			
		});
		
	}
}
