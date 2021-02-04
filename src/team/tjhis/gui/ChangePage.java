package team.tjhis.gui;

import javax.swing.JPanel;

public class ChangePage {

	public static void changePanel(MainFrame mf, JPanel op, JPanel np) {
		// 메인프레임, 현재 페이지, 넘어갈 페이지 3개를 입력받아
		mf.remove(op); // 현재 페이지를 메인프레임에서 지우고
		MainFrame.body = np;
		mf.add(MainFrame.body); // 넘어갈 페이지를 메인프레임에 붙인 뒤
		mf.repaint(); // 새로고침
		
	}
	
	public static void returnMainPage(MainFrame mf, JPanel op) {
		// 메인프레임, 현재 페이지 2개를 입력받아
		if(op instanceof ChineseFoodPage) {
			
		}
		mf.remove(MainFrame.body); // 현재 페이지를 메인프레임에서 지우고
		MainFrame.body = new MainPage(mf);
		mf.add(MainFrame.body); // 메인페이지를 메인프레임에 붙인 뒤
		mf.repaint(); // 새로고침
		
	}
	
	public static void changeHeader(MainFrame mf, JPanel np) {
	
		mf.remove(MainFrame.header);	// 현재 헤더 지우기
		MainFrame.header = np;			// 바꿀 헤더를 header에 저장
		mf.add(MainFrame.header);		// 바꾼 헤더를 메인프레임에 추가
		mf.repaint();
	}

}