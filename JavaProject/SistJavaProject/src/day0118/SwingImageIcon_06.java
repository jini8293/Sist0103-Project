package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingImageIcon_06 extends JFrame implements ActionListener {

	Container cp;

	// 이미지 아이콘 가져온다
	ImageIcon ic1 = new ImageIcon("C:\\sist0103\\image\\LEFT.GIF");
	ImageIcon ic2 = new ImageIcon("C:\\sist0103\\image\\leftDown.gif");
	ImageIcon ic3 = new ImageIcon("C:\\sist0103\\image\\leftRollover.gif");
	ImageIcon ic4 = new ImageIcon("C:\\sist0103\\image\\chick.gif");
	ImageIcon ic5 = new ImageIcon("C:\\sist0103\\image\\an07.gif");

	JButton j1, j2, j3, j4, j5;

	public SwingImageIcon_06(String title) {

		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 204));

		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {
		// 2행 2열
		this.setLayout(new GridLayout(2, 2));
		j1 = new JButton("hello", ic1);
		j1.setHorizontalTextPosition(JButton.CENTER);// 텍스트 가로위치
		j1.setVerticalTextPosition(JButton.BOTTOM);// 텍스트 세로위치
		this.add(j1);

		j1.setRolloverIcon(ic2);
		j1.setPressedIcon(ic3);

		// 버튼 2
		j2 = new JButton(ic4);
		this.add(j2);

		// 버튼 3
		j3 = new JButton("스윙버튼");
		this.add(j3);

		// 버튼 4
		j4 = new JButton("안녕", ic5);
		this.add(j4);

		j1.addActionListener(this);
		j2.addActionListener(this);
		j3.addActionListener(this);
		j4.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == j1) {
			JOptionPane.showMessageDialog(this, "hello버튼 입니다");
		} else if (ob == j2) {
			JOptionPane.showMessageDialog(this, "2번 버튼 입니다");
		} else if (ob == j3) {
			JOptionPane.showMessageDialog(this, "스윙버튼 입니다");
		} else if (ob == j4) {
			JOptionPane.showMessageDialog(this, "안녕");
		}

	}

	public static void main(String[] args) {
		new SwingImageIcon_06("이미지 버튼 6");
	}

}