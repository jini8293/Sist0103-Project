package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.w3c.dom.css.RGBColor;

public class SwingEvent_07 extends JFrame {

	Container cp;
	JButton j1, j2;

	public SwingEvent_07(String title) {
		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 204));
		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {
		// Flow레이아웃으로 버튼 두개 생성
		this.setLayout(new FlowLayout());

		j1 = new JButton("버튼색상 그레이로 변경");
		j2 = new JButton("버트색상 그린으로 변경");

		// j1.setBackground(Color.gray);
		// j2.setBackground(Color.green);

		this.add(j1);
		this.add(j2);

		// 버튼 1 생성 및 이벤트 주기 (익명내부클래스 형식)
		j1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// getContentPane().setBackground(Color.gray);
				cp.setBackground(Color.gray);
			}
		});

		// 버튼 2 생성 및 이벤트 주기 (익명내부클래스 형식)
		j2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cp.setBackground(Color.green);

			}
		});

	}

	public static void main(String[] args) {
		new SwingEvent_07("스윙 시작");
	}

}
