package team.tjhis.gui;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import team.tjhis.member.MemberWithdraw;

public class PopUpPage {

	public static void popUp(MainFrame mf, String str) {
		// 원하는 곳에서 원하는 문자열에 대해서 팝업창을 띄워주는 메소드
		// 성공시 출력(아이콘, 이미지 구분할 예정)
		Dialog sd = new Dialog(mf);
		sd.setLayout(null);
		sd.setBounds(563, 292, 350, 350);

		Image image = new ImageIcon(str).getImage().getScaledInstance(350, 350, 0);
		
		JLabel label = new JLabel(new ImageIcon(image));
		label.setBounds(0, 15, 350, 350);

		JButton button = new JButton("확인");
		button.setBounds(100, 275, 150, 35);
		button.setBackground(new Color(0,122,251));
		button.setOpaque(false);

		sd.add(label);
		sd.add(button);

		sd.setVisible(true);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				sd.dispose();

			}

		});
		
	}
	
	public static void returnPopUp(MainFrame mf, String str) {
		// 원하는 곳에서 원하는 문자열에 대해서 팝업창을 띄워주는 메소드
		// 성공시 출력(아이콘, 이미지 구분할 예정)
		Dialog sd = new Dialog(mf);
		sd.setLayout(null);
		sd.setBounds(563, 292, 350, 350);
		
		Image image = new ImageIcon(str).getImage().getScaledInstance(350, 350, 0);
		
		JLabel label = new JLabel(new ImageIcon(image));
		label.setBounds(0, 15, 350, 350);
		
		JButton button = new JButton("확인");
		button.setBounds(100, 275, 150, 35);
		button.setBackground(new Color(0,122,251));
		button.setOpaque(false);

		sd.add(label);
		sd.add(button);
		
		sd.setVisible(true); 
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ChangePage.returnMainPage(mf, MainFrame.body);
				sd.dispose();
				
			}
			
		});
		
	}

	public static void findIdSuccessPopUp(MainFrame mf, String str, String text) {

		Dialog sd = new Dialog(mf);
		sd.setLayout(null);
		sd.setBounds(563, 292, 350, 350);

		Image image = new ImageIcon(str).getImage().getScaledInstance(350, 350, 0);

		JLabel label = new JLabel(new ImageIcon(image));
		label.setBounds(0, 15, 350, 350);

		JTextArea textArea = new JTextArea(text);
		textArea.setSize(150, 20);
		textArea.setLocation(100, 170);
		textArea.setEditable(false);
		textArea.setBackground(new Color(245, 246, 247));

		JButton button = new JButton("확인");
		button.setBounds(100, 275, 150, 35);
		button.setBackground(new Color(0,122,251));
		button.setOpaque(false);

		label.add(textArea);
		sd.add(button);
		sd.add(label);

		sd.setVisible(true);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				sd.dispose();

			}

		});

	}
	
	/* 회원탈퇴 버튼 누른 경우 확인 절차 위한 팝업창 */
	public static void withdrawPopUp(MainFrame mf, String str) {

		Dialog sd = new Dialog(mf);
		sd.setLayout(null);
		sd.setBounds(563, 292, 350, 350);

		Image image = new ImageIcon(str).getImage().getScaledInstance(350, 350, 0);
		
		JLabel label = new JLabel(new ImageIcon(image));
		label.setBounds(0, 15, 350, 350);

		/* 확인 버튼 */
		JButton okBtn = new JButton("확인");
		okBtn.setBounds(50, 275, 118, 35);
		okBtn.setBackground(new Color(0,122,251));
		okBtn.setOpaque(false);

		/* 취소 버튼 */
		JButton cancelBtn = new JButton("취소");
		cancelBtn.setBounds(182, 275, 118, 35);
		cancelBtn.setBackground(new Color(0,122,251));
		cancelBtn.setOpaque(false);

		sd.add(label);
		sd.add(okBtn);
		sd.add(cancelBtn);

		sd.setVisible(true);

		
		/* 확인 버튼 누른 경우 */
		okBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				sd.dispose();

				/* 회원 탈퇴 절차 진행 */
				new MemberWithdraw().withdraw();
				
				/* 탈퇴 완료 안내 팝업창 */
				returnPopUp(mf, "images/popUpWithdrawalCompleted.png", false);	
			}
		});
		
		
		/* 취소 버튼 누른 경우 */
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sd.dispose();
			}
		});

	}
	
	
	public static void returnPopUp(MainFrame mf, String str, boolean isLoggedIn) {
		// 원하는 곳에서 원하는 문자열에 대해서 팝업창을 띄워주는 메소드
		// 성공시 출력(아이콘, 이미지 구분할 예정)
		Dialog sd = new Dialog(mf);
		sd.setLayout(null);
		sd.setBounds(563, 292, 350, 350);
		
		Image image = new ImageIcon(str).getImage().getScaledInstance(350, 350, 0);
		
		JLabel label = new JLabel(new ImageIcon(image));
		label.setBounds(0, 15, 350, 350);
		
		JButton button = new JButton("확인");
		button.setBounds(100, 275, 150, 35);
		button.setBackground(new Color(0,122,251));
		button.setOpaque(false);

		sd.add(label);
		sd.add(button);
		
		sd.setVisible(true); 
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sd.dispose();
				ChangePage.returnMainPage(mf, MainFrame.body);
				
				/* 로그인이 된 상태의 헤더로 변경된 메인페이지로 돌아감 */
				if(isLoggedIn) {
					ChangePage.changeHeader(mf, new LoginHeader(mf));					

				/* 로그인되지 않은 상태의 헤더로 변경된 메인페이지로 돌아감 */
				}else {
					ChangePage.changeHeader(mf, new LogoutHeader(mf));						
				}
			}
			
		});
		
	}
	
	public static void selectPopUp(MainFrame mf, String str) {

		Dialog sd = new Dialog(mf);
		sd.setLayout(null);
		sd.setBounds(563, 292, 350, 350);

		Image image = new ImageIcon(str).getImage().getScaledInstance(350, 350, 0);
		
		JLabel label = new JLabel(new ImageIcon(image));
		label.setBounds(0, 15, 350, 350);

		/* 확인 버튼 */
		JButton okBtn = new JButton("확인");
		okBtn.setBounds(50, 275, 118, 35);
		okBtn.setBackground(new Color(0,122,251));
		okBtn.setOpaque(false);

		/* 취소 버튼 */
		JButton cancelBtn = new JButton("취소");
		cancelBtn.setBounds(182, 275, 118, 35);
		cancelBtn.setBackground(new Color(0,122,251));
		cancelBtn.setOpaque(false);

		sd.add(label);
		sd.add(okBtn);
		sd.add(cancelBtn);

		sd.setVisible(true);

		
		/* 확인 버튼 누른 경우 */
		okBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				sd.dispose();
				CartPage.count = 0;
				ChangePage.returnMainPage(mf, MainFrame.body);
			}
		});
		
		
		/* 취소 버튼 누른 경우 */
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sd.dispose();
			}
		});

	}

}//class
