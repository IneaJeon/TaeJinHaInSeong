package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPage extends JPanel {

	private MainFrame mf; // 메인프레임 저장 변수
	private JPanel mp; // 메인페이지(자기자신) 저장 변수
	
	public MainPage() {}
	public MainPage(MainFrame mf) {
		
		this.mf = mf;
		this.mp = this;

		this.setLayout(null);
		this.setBounds(0, 110, 1440, 800);
		Image mainPageImage = new ImageIcon("images/mainPage_panel.PNG").getImage().getScaledInstance(1440, 800, 0);
		JLabel mlabel = new JLabel(new ImageIcon(mainPageImage));
		mlabel.setBounds(0, 0, 1440, 800);
		this.setBackground(Color.WHITE);
		
		JButton goSchoolFood = new JButton(); // sign up 버튼
		JButton goFastFood = new JButton(); // sign in 버튼
		JButton goJapaneseFood = new JButton(); // myPage 버튼
		JButton goKoreanFood = new JButton(); // order 버튼
		JButton goChineseFood = new JButton(); // order 버튼
		
		goSchoolFood.setBounds(221, 463, 150, 150);
		goFastFood.setBounds(429, 463, 150, 150);
		goJapaneseFood.setBounds(639, 463, 150, 150);
		goKoreanFood.setBounds(851, 463, 150, 150);
		goChineseFood.setBounds(1061, 463, 150, 150);
		goSchoolFood.setOpaque(false);
		goFastFood.setOpaque(false);
		goJapaneseFood.setOpaque(false);
		goKoreanFood.setOpaque(false);
		goChineseFood.setOpaque(false);
		this.add(mlabel);
		this.add(goSchoolFood);
		this.add(goFastFood);
		this.add(goJapaneseFood);
		this.add(goKoreanFood);
		this.add(goChineseFood);
		
		goSchoolFood.addActionListener(new ActionListener() { // sign up 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				ChangePage.changePanel(mf, mp, new SignUpPage(mf));
						
			}
			
		});
		
		goFastFood.addActionListener(new ActionListener() { // sign in 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.changePanel(mf, mp, new LoginPage(mf));
				
			}
			
		});
		
		goJapaneseFood.addActionListener(new ActionListener() { // myPage 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				ChangePage.changePanel(mf, mp, new MyPageMenuPage(mf));
				
			}
			
		});
		
		goKoreanFood.addActionListener(new ActionListener() { // order 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				ChangePage.changePanel(mf, mp, new OrderPage(mf));
				
			}
			
		});
		
	}
	
}
