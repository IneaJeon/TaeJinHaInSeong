package team.tjhis.gui;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PopUpPage {
	
	public static void successPopUp(MainFrame mf, String str) {
		// 원하는 곳에서 원하는 문자열에 대해서 팝업창을 띄워주는 메소드
		// 성공시 출력(아이콘, 이미지 구분할 예정)
		Dialog sd = new Dialog(mf, "");
		sd.setSize(350, 350);
		sd.setLocation(563, 292);
		
		JPanel panel = new JPanel();
		panel.add(new JLabel(str));
		JButton button = new JButton("확인");
		panel.setSize(140, 50);
		panel.setLocation(575, 464);
		sd.add(panel);
		panel.add(button);
		button.setOpaque(false);
		
		sd.setVisible(true); 
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sd.dispose();
				
			}
			
		});
		
	}
	
	public static void failPopUp(MainFrame mf, String str) {
		// 원하는 곳에서 원하는 문자열에 대해서 팝업창을 띄워주는 메소드
		// 실패시 출력(아이콘, 이미지 구분할 예정)
		Dialog sd = new Dialog(mf, "확인");
		sd.setSize(350, 350);
		sd.setLocation(563, 292);
		
		JPanel panel = new JPanel();
		panel.add(new JLabel(str));
		JButton button = new JButton("확인");
		panel.setSize(140, 50);
		panel.setLocation(575, 464);
		sd.add(panel);
		panel.add(button);
		button.setOpaque(false);
		
		sd.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				sd.dispose();
				
			}
			
		});
		
	}

}
