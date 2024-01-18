package day07;

import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//jframe 시험문제 x
//인터페이스 추상클래스 차이점(중간시험)
//가장 큰 차이는 다중상속 여부
//공통점은 추상화된 메서드가 있으면 오버라이딩 해줘야함, 자기자신 객체화 x
class Myframe01 extends JFrame implements ActionListener{
	private JLabel label;
	private JButton b;
	private int count=0;
	public Myframe01() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("프레임연습");
		//setLayout(new FlowLayout());//flowlayout(만드는 순서대로 배치)
		Panel p = new Panel();
		b = new JButton("버튼 클릭");
		label = new JLabel("현재 카운트의 개수 : "+count);
		b.addActionListener(this);
		p.add(b);
		p.add(label);
		add(p);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("현재 카운트의 값 : "+count);
		
	}
	
}
public class Frame01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe01 f01 = new Myframe01();
	}

}
