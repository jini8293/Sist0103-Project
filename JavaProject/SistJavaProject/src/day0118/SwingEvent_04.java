package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingEvent_04 extends JFrame implements ActionListener {

	Container cp;
	JButton j1, j2, j3;

	public SwingEvent_04(String title) {

		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 204));

		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {

		// 레이아웃변경
		this.setLayout(new FlowLayout());

		// 버튼 3개 생성
		j1 = new JButton("버튼 #1");
		j2 = new JButton("버튼 #2");
		j3 = new JButton("버튼 #3");

		// 버튼 색상 변경
		j1.setBackground(Color.black);
		j2.setBackground(Color.pink);
		j3.setBackground(Color.blue);

		j1.setForeground(Color.white);
		j3.setForeground(Color.white);
		
		//버튼에 이벤트 발생  이벤트 핸들러와 이벤트 발생 객체 연결
		j1.addActionListener(this);
		j2.addActionListener(this);
		j3.addActionListener(this);

		// 프레임에 출력
		this.add(j1);
		this.add(j2);
		this.add(j3);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob =e.getSource(); //버튼의 어떤 메서드 호출인지 정확하게 지정해주어야함
		
		//메세지를 다이얼로그 형태로 보여준다
		//JOptionPane.showMessageDialog(this, "버튼 클릭");
		
		//버튼 마다 다른 메세지 출력하려면?
		if(ob==j1) {
			JOptionPane.showMessageDialog(this, "1번 버튼 클릭");
		}else if(ob==j2) {
			JOptionPane.showMessageDialog(this, "2번 버튼 클릭");
		}else if(ob==j3) {
			JOptionPane.showMessageDialog(this, "3번 버튼 클릭");
		}
	}

	public static void main(String[] args) {
		new SwingEvent_04("스윙 시작");
	}

}
