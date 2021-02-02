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
		
		JButton goSchoolFood = new JButton(); // 분식 버튼
		JButton goFastFood = new JButton(); // 패스트푸드 버튼
		JButton goJapaneseFood = new JButton(); // 일식 버튼
		JButton goKoreanFood = new JButton(); // 한식 버튼
		JButton goChineseFood = new JButton(); // 중식 버튼
		
		JButton goSignIn = new JButton(); // 로그인 버튼
		JButton goSignUp = new JButton(); // 회원가입 버튼
		JButton goMyPage = new JButton(); // 마이페이지 버튼
		
		goSignIn.setBounds(0, 0, 0, 0);
		goSignUp.setBounds(0, 0, 0, 0);
		goMyPage.setBounds(0, 0, 0, 0);
		
		goSignIn.setOpaque(false);
		goSignUp.setOpaque(false);
		goMyPage.setOpaque(false);
		
		goSchoolFood.setBounds(221, 522, 150, 150);
		goFastFood.setBounds(429, 522, 150, 150);
		goJapaneseFood.setBounds(639, 522, 150, 150);
		goKoreanFood.setBounds(851, 522, 150, 150);
		goChineseFood.setBounds(1061, 522, 150, 150);
		
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
		
		goSchoolFood.addActionListener(new ActionListener() { // 분식 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				ChangePage.changePanel(mf, mp, new SchoolFoodPage(mf));
						
			}
			
		});
		
		goFastFood.addActionListener(new ActionListener() { // 패스트푸드 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				ChangePage.changePanel(mf, mp, new FastFoodPage(mf));
				
			}
			
		});
		
		goJapaneseFood.addActionListener(new ActionListener() { // 일식 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.changePanel(mf, mp, new JapaneseFoodPage(mf));
				
			}
			
		});
		
		goKoreanFood.addActionListener(new ActionListener() { // 한식 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.changePanel(mf, mp, new KoreanFoodPage(mf));
				
			}
			
		});
		
		goChineseFood.addActionListener(new ActionListener() { // 중식 버튼 누를시
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				ChangePage.changePanel(mf, mp, new ChineseFoodPage(mf));
				
			}
			
		});
		
	}
	
}
