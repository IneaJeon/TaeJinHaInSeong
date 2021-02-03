package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JapaneseFoodPage extends JPanel {

	MainFrame mf;
	JPanel op;
	
	public JapaneseFoodPage() {}

	public JapaneseFoodPage(MainFrame mf) {

		this.mf = mf;
		this.op = this;

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.white);

		Image image = new ImageIcon("images/JapaneseFood.PNG").getImage().getScaledInstance(1440, 790, 0);
		
		JLabel logoLabel = new JLabel(new ImageIcon(image));
		logoLabel.setBounds(0, 0, 1440, 790);
		
		JButton btn1 = new JButton();
		btn1.setSize(140, 50);
		btn1.setLocation(575, 464);
		btn1.setBackground(new Color(0, 122, 251));
		btn1.setForeground(Color.white);
		btn1.setOpaque(false);

		JButton btn2 = new JButton();
		btn2.setSize(140, 50);
		btn2.setLocation(855, 464);
		btn2.setBackground(new Color(0, 122, 251));
		btn2.setForeground(Color.white);
		btn2.setOpaque(false);

		JButton btn3 = new JButton("담기");
		btn3.setSize(140, 50);
		btn3.setLocation(1150, 464);
		btn3.setBackground(new Color(0, 122, 251));
		btn3.setForeground(Color.white);
		btn3.setOpaque(false);

		JButton cartListButton = new JButton("장바구니로 이동");
		cartListButton.setSize(190, 50);
		cartListButton.setLocation(840, 674);
		cartListButton.setBackground(new Color(0, 122, 251));
		cartListButton.setForeground(Color.white);
		cartListButton.setOpaque(false);

		this.add(logoLabel);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(cartListButton);
		
		mf.add(this);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.failPopUp(mf, "영업이 종료되었습니다.");
				
			}

		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.failPopUp(mf, "영업이 종료되었습니다.");
			}

		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.failPopUp(mf, "영업이 종료되었습니다.");
			}

		});

		cartListButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.failPopUp(mf, "영업이 종료되었습니다.");
			}

		});
	}

}
