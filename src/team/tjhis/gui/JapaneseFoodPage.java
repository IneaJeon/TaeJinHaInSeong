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

	public JapaneseFoodPage(MainFrame mf) {

		this.mf = mf;
		this.op = this;

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.white);

		Image logo = new ImageIcon("images/logo.PNG").getImage();
		Image menu = new ImageIcon("images/menu.PNG").getImage();
		Image calorie = new ImageIcon("images/calorie.PNG").getImage();

		JLabel logoLabel = new JLabel(new ImageIcon(logo));
		logoLabel.setSize(300, 350);
		logoLabel.setLocation(0, 35);

		JLabel menuLabel = new JLabel(new ImageIcon(menu));
		menuLabel.setSize(480, 250);
		menuLabel.setLocation(230, 0);

		JLabel calorieLabel = new JLabel(new ImageIcon(calorie));
		calorieLabel.setSize(360, 100);
		calorieLabel.setLocation(290, 250);

		JButton btn1 = new JButton("담기");
		btn1.setSize(80, 30);
		btn1.setLocation(290, 225);
		btn1.setBackground(new Color(0, 122, 251));
		btn1.setForeground(Color.white);

		JButton btn2 = new JButton("담기");
		btn2.setSize(80, 30);
		btn2.setLocation(430, 225);
		btn2.setBackground(new Color(0, 122, 251));
		btn2.setForeground(Color.white);

		JButton btn3 = new JButton("담기");
		btn3.setSize(80, 30);
		btn3.setLocation(570, 225);
		btn3.setBackground(new Color(0, 122, 251));
		btn3.setForeground(Color.white);

		JButton cartListButton = new JButton("장바구니로 이동");
		cartListButton.setSize(130, 30);
		cartListButton.setLocation(410, 348);
		cartListButton.setBackground(new Color(0, 122, 251));
		cartListButton.setForeground(Color.white);

		this.add(logoLabel);
		this.add(menuLabel);
		this.add(calorieLabel);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(cartListButton);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});

		cartListButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}

		});
	}

}
