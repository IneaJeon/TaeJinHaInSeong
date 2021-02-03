package team.tjhis.gui;

import java.awt.Dialog;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PopUpPage {
	
	public static void popUp(MainFrame mf, String str) {
		// 원하는 곳에서 원하는 문자열에 대해서 팝업창을 띄워주는 메소드
		// 성공시 출력(아이콘, 이미지 구분할 예정)
		Dialog sd = new Dialog(mf);
		sd.setBounds(563, 292, 350, 350);
		
		Image image = new ImageIcon(str).getImage().getScaledInstance(350, 350, 0);
		
		JLabel label = new JLabel(new ImageIcon(image));
		label.setSize(350, 350);
		
		JButton button = new JButton("확인");
		button.setBounds(100, 260, 150, 38);

		
		button.setOpaque(false);
		label.add(button);
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
