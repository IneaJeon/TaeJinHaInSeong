package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FastFoodPage extends JPanel {

	private MainFrame mf;
	private JPanel fastFoodPage;
	private int count;

	public FastFoodPage() {
	}

	public FastFoodPage(MainFrame mf) {

		this.mf = mf;
		this.fastFoodPage = this;

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.WHITE);

		Image ff = new ImageIcon("images/fastfood.png").getImage().getScaledInstance(1440, 790, 0);

		JLabel label = new JLabel(new ImageIcon(ff));
		label.setBounds(0, 0, 1440, 790);

		/* 담기1 */
		JButton btn1 = new JButton();
		btn1.setSize(140, 50);
		btn1.setLocation(450, 580);
		btn1.setOpaque(false);

		/* 담기2 */
		JButton btn2 = new JButton();
		btn2.setSize(140, 50);
		btn2.setLocation(800, 580);
		btn2.setOpaque(false);

		/* 담기3 */
		JButton btn3 = new JButton();
		btn3.setSize(140, 50);
		btn3.setLocation(1180, 580);
		btn3.setOpaque(false);

		/* 장바구니 이동 */
		JButton cartButton = new JButton();
		cartButton.setSize(190, 50);
		cartButton.setLocation(780, 670);
		cartButton.setOpaque(false);

		fastFoodPage.add(label);
		fastFoodPage.add(btn1);
		fastFoodPage.add(btn2);
		fastFoodPage.add(btn3);
		fastFoodPage.add(cartButton);

		mf.add(fastFoodPage);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "재료가 소진되어 주문이 불가능합니다.");

			}

		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "재료가 소진되어 주문이 불가능합니다.");
			}

		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "재료가 소진되어 주문이 불가능합니다.");

			}

		});

		cartButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				PopUpPage.popUp(mf, "장바구니가 비어 있습니다.");

			}

		});

	}

}
