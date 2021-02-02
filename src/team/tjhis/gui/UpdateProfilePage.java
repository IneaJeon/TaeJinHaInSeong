package team.tjhis.gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import team.tjhis.member.MemberDTO;
import team.tjhis.member.UpdateProfile;

public class UpdateProfilePage extends JPanel {

	MainFrame mf;
	JPanel op;

	public UpdateProfilePage(MainFrame mf) {

		String dbFile = "src/team/tjhis/memberDB.txt";

		this.mf = mf;
		this.op = this;

		this.setLayout(null);
		this.setBounds(0, 120, 1440, 790);
		this.setBackground(Color.white);
		
		Image top = new ImageIcon("images/top.PNG").getImage();
		Image list = new ImageIcon("images/list.PNG").getImage();
		
		JLabel topLabel = new JLabel(new ImageIcon(top));
		topLabel.setSize(1400,100);
		topLabel.setLocation(0, 0);
		
		JLabel listLabel = new JLabel(new ImageIcon(list));
		listLabel.setSize(116,181);
		listLabel.setLocation(160, 120);
		

		JPasswordField pwdTf = new JPasswordField(20);
		pwdTf.setSize(200, 30);
		pwdTf.setLocation(280, 120);


		JPasswordField pwdConfirmTf = new JPasswordField(20);
		pwdConfirmTf.setSize(200, 30);
		pwdConfirmTf.setLocation(280, 170);


		JTextField pnTf = new JTextField(20);
		pnTf.setSize(200, 30);
		pnTf.setLocation(280, 220);


		JTextField addrTf = new JTextField(20);
		addrTf.setSize(200, 30);
		addrTf.setLocation(280, 270);

		JButton btn = new JButton("회원정보 수정");
		btn.setSize(120, 35);
		btn.setLocation(280, 325);
		btn.setBackground(new Color(0, 122, 251));
		btn.setForeground(Color.white);
		

		JTextArea textArea = new JTextArea();
		textArea.setSize(1440 / 2, 20);
		textArea.setLocation(0, 394);
		textArea.setBackground(new Color(0, 122, 251));
		textArea.setEditable(false);
		textArea.setForeground(Color.white);

		this.add(topLabel);
		this.add(listLabel);
		this.add(pwdTf);
		this.add(pwdConfirmTf);
		this.add(pnTf);
		this.add(addrTf);
		this.add(btn);
		this.add(textArea);

		btn.addActionListener(new ActionListener() {

			ObjectInputStream objIn = null;

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dbFile)));

					while (true) {
						MemberDTO dto = (MemberDTO) objIn.readObject();
						if (pwdTf.getText().equals(pwdConfirmTf.getText()) && !(pnTf.getText().isEmpty())
								&& !(addrTf.getText().isEmpty())) {
							dto.setPwd(pwdTf.getText());
							dto.setPhoneNum(pnTf.getText());
							dto.setAddr(addrTf.getText());
							textArea.setText("");
							String text = "회원정보 수정이 완료되었습니다.";
							textArea.append(text);
							
							return;
						}
					}
				} catch (FileNotFoundException e1) {

					e1.printStackTrace();
				} catch (IOException e1) {
					textArea.setText("");
					String text = "정보를 다시 입력해주세요.";
					textArea.append(text);
					
					return;
				} catch (ClassNotFoundException e1) {

					e1.printStackTrace();
				}

			}

		});
	}

	public void updateProfile() {
		new UpdateProfilePage(mf);
	}
}

//		Scanner sc = new Scanner(System.in);
//
//		while (true) {
//			System.out.println("===== 회원정보수정 =====");
//			System.out.println("1. 비밀번호 수정");
//			System.out.println("2. 휴대폰번호 수정");
//			System.out.println("3. 주소 수정");
//			System.out.println("9. 이전 메뉴로 돌아가기");
//			System.out.print("번호를 입력해주세요 : ");
//			int num = sc.nextInt();
//			sc.nextLine();
//			//
//			ObjectInputStream objIn = null;
//			//
//			switch (num) {
//			case 1:
//				System.out.print("현재 비밀번호를 입력해주세요 : ");
//				String pwd = sc.nextLine();
//				try {
//					objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dbFile)));
//					while (true) {
//						MemberDTO dto = (MemberDTO) objIn.readObject();
//						if (pwd.equals(dto.getPwd())) {
//							System.out.print("변경할 비밀번호를 입력해주세요 : ");
//							String changePwd = sc.nextLine();
//							System.out.print("변경할 비밀번호를 한번 더 입력해주세요 : ");
//							String changePwdConfirm = sc.nextLine();
//							if (changePwd.equals(changePwdConfirm)) {
//								dto.setPwd(changePwd);
//								System.out.println("비밀번호가 " + changePwd + "(으)로 변경되었습니다. ");
//								return;
//							}
//						}
//					}
//				} catch (EOFException e) {
//					System.out.println("일치하는 회원의 정보가 없습니다.");
//				} catch (FileNotFoundException e) {
//					e.printStackTrace();
//				} catch (IOException e) {
//					e.printStackTrace();
//				} catch (ClassNotFoundException e) {
//					e.printStackTrace();
//				} finally {
//					if (objIn != null) {
//						try {
//							objIn.close();
//						} catch (IOException e) {
//							e.printStackTrace();
//						}
//					}
//				}
//			case 2:
//				System.out.print("변경할 휴대폰번호를 입력해주세요 : ");
//				String changePhoneNum = sc.nextLine();
//				try {
//					objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dbFile)));
//					while (true) {
//						MemberDTO dto = (MemberDTO) objIn.readObject();
//						dto.setPhoneNum(changePhoneNum);
//						System.out.println("휴대폰번호가 " + changePhoneNum + "(으)로 변경되었습니다. ");
//						return;
//					}
//				} catch (EOFException e) {
//					e.printStackTrace();
//				} catch (FileNotFoundException e) {
//					e.printStackTrace();
//				} catch (IOException e) {
//					e.printStackTrace();
//				} catch (ClassNotFoundException e) {
//					e.printStackTrace();
//				} finally {
//					if (objIn != null) {
//						try {
//							objIn.close();
//						} catch (IOException e) {
//							e.printStackTrace();
//						}
//					}
//				}
//			case 3:
//				System.out.print("변경할 주소를 입력해주세요 : ");
//				String changeAddr = sc.nextLine();
//				try {
//					objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dbFile)));
//					while (true) {
//						MemberDTO dto = (MemberDTO) objIn.readObject();
//						dto.setAddr(changeAddr);
//						System.out.println("주소가 " + changeAddr + "(으)로 변경되었습니다. ");
//						return;
//					}
//				} catch (EOFException e) {
//					e.printStackTrace();
//				} catch (FileNotFoundException e) {
//					e.printStackTrace();
//				} catch (IOException e) {
//					e.printStackTrace();
//				} catch (ClassNotFoundException e) {
//					e.printStackTrace();
//				} finally {
//					if (objIn != null) {
//						try {
//							objIn.close();
//						} catch (IOException e) {
//							e.printStackTrace();
//						}
//					}
//				}
//			case 9:
//				System.out.println("이전 메뉴로 돌아갑니다.");
//				return;
//			default:
//				System.out.println("번호를 잘못입력하셨습니다. 다시 입력해주세요.");
//				break;
//			}
//		}
