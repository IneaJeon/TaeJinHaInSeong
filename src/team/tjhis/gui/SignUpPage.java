package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class SignUpPage extends JPanel{
	
	private MainFrame mf;
	private JPanel signUpPage;

	/* 기본생성자 */
	public SignUpPage() {}

	public SignUpPage(MainFrame mf) {
		
		this.mf = mf;
		this.signUpPage = this;
		
		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.white);
		
		
		/* 회원가입 */
		Image signUpImg = new ImageIcon("images/signUp.PNG").getImage().getScaledInstance(1440, 790, 0);
		
		JLabel logoLabel = new JLabel(new ImageIcon(signUpImg));
		logoLabel.setBounds(0, 0, 1440, 790);
		
		
		/*이름 필드*/
		JTextField nameF = new JTextField(20);
		nameF.setSize(336,40);
		nameF.setLocation(554, 200);
		nameF.setBorder(null);
		
		/* id 필드 */
		JTextField idF = new JTextField(20);
		idF.setSize(336,40);
		idF.setLocation(554, 260);
		idF.setBorder(null);
		
		/* 비번 필드 */
		JTextField pwdF = new JTextField(20);
		pwdF.setSize(336,40);
		pwdF.setLocation(554, 320);
		pwdF.setBorder(null);
		
		/* 비번확인 필드 */
		JTextField pwdDF = new JTextField(20);
		pwdDF.setSize(336,40);
		pwdDF.setLocation(554, 380);
		pwdDF.setBorder(null);
		
		/* 전화번호 필드 */
		JTextField phonF = new JTextField(20);
		phonF.setSize(336,40);
		phonF.setLocation(554, 440);
		phonF.setBorder(null);
		
		/* 주소 필드 */
		JTextField adrF = new JTextField(20);
		adrF.setSize(336,40);
		adrF.setLocation(554, 500);
		adrF.setBorder(null);
		
		/* 확인 필드 */
		JButton signUpBtn = new JButton("확인");
		signUpBtn.setSize(205, 50);
		signUpBtn.setLocation(620, 590);
		signUpBtn.setOpaque(false);

		this.add(logoLabel);
		this.add(nameF);
		this.add(idF);
		this.add(pwdF);
		this.add(pwdDF);
		this.add(phonF);
		this.add(adrF);
		this.add(signUpBtn);


		signUpBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PopUpPage.popUp(mf, "images/welcome.png");
			}
		});

	}

}