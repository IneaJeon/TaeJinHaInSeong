package team.tjhis.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
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
		
		this.setBounds(408, 120, 619, 635);
		this.setLayout(null);
//		this.setBackground(Color.WHITE);
		
		/*폰트 컬러기본설정*/
		Color c1 = new Color(51, 51, 51);
		Color c2=new Color(255,1,1);
		Font font1 = new Font("나눔고딕", Font.PLAIN, 15);
		Font font2 = new Font("나눔고딕", Font.BOLD, 17);
		Font font3 = new Font("나눔고딕", Font.BOLD, 20);
		
		/* 로그인 필드 */
		JLabel signUplabel = new JLabel("회원가입");
		signUplabel.setHorizontalAlignment(JLabel.CENTER);
		signUplabel.setFont(font3);
		signUplabel.setForeground(new Color(51, 51, 51));
		signUplabel.setBounds(200, 30, 200, 30);
		add(signUplabel);
		
		/* 로그인 필드 */
		JLabel listLabel = new JLabel("필수사항 입력");
		listLabel.setHorizontalAlignment(JLabel.CENTER);
		listLabel.setFont(font1);
		listLabel.setForeground(new Color(51, 51, 51));
		listLabel.setBounds(455, 57, 200, 30);
		add(listLabel);
		
		/*line_top*/
		Image line2 = new ImageIcon("images/line_black.png").getImage().getScaledInstance(600, 1, 0);
		JLabel lineLabel2 = new JLabel(new ImageIcon(line2));
		lineLabel2.setBounds(10, 85, 600, 1);
		
		this.add(lineLabel2);

		/*== 아이디 라벨==*/
		JLabel idLabel = new JLabel("아이디");
		idLabel.setFont(font2);
		idLabel.setForeground(new Color(136, 136, 136));
		idLabel.setBounds(10, 110, 100, 30);
		add(idLabel);
		
		/* 아이디 필드 */
		JTextField idField = new JTextField("6자 이상 영문 숫자와 조합해 주세요");
		idField.setFont(font1);
		idField.setForeground(new Color(204, 204, 204));
		idField.setBounds(145, 100, 355, 50);
		idField.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		add(idField);
		
		/* 중복 체크 */
		JButton btn = new JButton("중복체크");
		btn.setFont(font2);
		btn.setBorderPainted(false);
		btn.setBounds(509, 100, 100, 50);
		btn.setBackground(new Color(0, 122, 251));
		btn.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		btn.setForeground(Color.WHITE);
		add(btn);
		
		/* == 비번 라벨 ==*/
		JLabel pwdLabel = new JLabel("비밀번호");
		pwdLabel.setFont(font2);
		pwdLabel.setForeground(new Color(136, 136, 136));
		pwdLabel.setBounds(10, 170, 100, 30);
		add(pwdLabel);
		
		/* 비번 필드 */
		JTextField pwdField = new JTextField("비밀번호를 입력해 주세요");
		pwdField.setFont(font1);
		pwdField.setForeground(new Color(204, 204, 204));
		pwdField.setBounds(145, 160, 355, 50);
		pwdField.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		add(pwdField);
		
		/* == 비번확인 라벨 ==*/
		JLabel pwdDbcLabel = new JLabel("비밀번호 확인");
		pwdDbcLabel.setFont(font2);
		pwdDbcLabel.setForeground(new Color(136, 136, 136));
		pwdDbcLabel.setBounds(10, 230, 150, 30);
		add(pwdDbcLabel);
		
		/*비번확인*/
		JTextField pwdDbcField = new JTextField("비밀번호를 입력해 주세요");
		pwdDbcField.setFont(font1);
		pwdDbcField.setForeground(new Color(204, 204, 204));
		pwdDbcField.setBounds(145, 220, 355, 50);
		pwdDbcField.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		add(pwdDbcField);
		

		/* == 이름 라벨 ==*/
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setFont(font2);
		nameLabel.setForeground(new Color(136, 136, 136));
		nameLabel.setBounds(10, 290, 100, 30);
		add(nameLabel);
		
		/*이름 필드*/
		JTextField nameField = new JTextField("이름을 입력해 주세요");
		nameField.setFont(font1);
		nameField.setForeground(new Color(204, 204, 204));
		nameField.setBounds(145, 280, 355, 50);
		nameField.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		add(nameField);
		
		/* == 전화번호 라벨 ==*/
		JLabel phonLabel = new JLabel("전화번호");
		phonLabel.setFont(font2);
		phonLabel.setForeground(new Color(136, 136, 136));
		phonLabel.setBounds(10, 350, 100, 30);
		add(phonLabel);
		
		/*전화번호 필드*/
		JTextField phonField = new JTextField("숫자만 입력해 주세요");
		phonField.setFont(font1);
		phonField.setForeground(new Color(204, 204, 204));
		phonField.setBounds(145, 340, 355, 50);
		phonField.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		add(phonField);
		
		/* == 주소 라벨 ==*/
		JLabel adrLabel = new JLabel("주소");
		adrLabel.setFont(font2);
		adrLabel.setForeground(new Color(136, 136, 136));
		adrLabel.setBounds(10, 410, 100, 30);
		add(adrLabel);
		
		JTextField adrField = new JTextField("주소를 입력해 주세요");
		adrField.setFont(font1);
		adrField.setForeground(new Color(204, 204, 204));
		adrField.setBounds(145,400, 355, 50);
		adrField.setBorder(BorderFactory.createLineBorder(Color.decode("#CCCCCC")));
		add(adrField);
		
		
		/*line_footer*/
		Image line1 = new ImageIcon("images/line_black.png").getImage().getScaledInstance(600, 1, 0);
		JLabel lineLabel1 = new JLabel(new ImageIcon(line1));
		lineLabel1.setBounds(10, 470, 600, 1);
		
		this.add(lineLabel1);
		
		
		/*체크박스 이미지*/
		Image image = new ImageIcon("images/Vectorcheck.PNG").getImage().getScaledInstance(15, 15, 0);
		JLabel checkLabel = new JLabel(new ImageIcon(image));
		checkLabel.setBounds(10, 490, 15, 15);
		
		this.add(checkLabel);
		
		/* == 이용약관 동의 라벨 ==*/
		JLabel tosLabel = new JLabel("이용약관에 동의 하시겠습니까?");
		tosLabel.setFont(font1);
		tosLabel.setForeground(new Color(136, 136, 136));
		tosLabel.setBounds(30, 483, 300, 30);
		add(tosLabel);
		

		/*체크박스 이미지*/
		Image button = new ImageIcon("images/button.PNG").getImage().getScaledInstance(161, 39, 0);
		JLabel buttonLabel = new JLabel(new ImageIcon(button));
		buttonLabel.setBounds(230, 550, 161, 39);
		
		this.add(buttonLabel);
		
		
		mf.add(signUpPage);

		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}