package team.tjhis.gui;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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

}
