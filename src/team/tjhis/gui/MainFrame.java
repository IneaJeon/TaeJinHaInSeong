package team.tjhis.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	// 입출력을 할때 작성해야 할 경로를 미리 변수로 만들어서 어디서든 사용할 수 있게 작성.
	public static final String PATH = "src/team/tjhis/memberDB.txt";
	public static JPanel header = null;
	public static JPanel body = null;
	public static JPanel footer = null;

	public MainFrame() {
		

		this.setBounds(0, 0, 1440, 1029);

		this.setLayout(null);

		this.setTitle("저기요!");

		header = new LogoutHeader(this);
		footer = new Footer(this);
		body = new MainPage(this);
		this.add(body); // 첫 화면(메인 페이지)를 붙인다 
		
//		new SignUpPage(this);
//		new LoginPage(this);		
//		new FindIdPage(this);
//		new FindPwdPage(this); 
//		new MyPage(this);
//		new KoreanFoodPage(this); 
//		new ChineseFoodPage(this);
//		new FastFoodPage(this);
//		new SchoolFoodPage(this);
//		new JapaneseFoodPage(this);
//		new CartPage(this); 

		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}
	
}
