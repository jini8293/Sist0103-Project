package day0118;

import java.awt.Color;

import javax.swing.JFrame;

import org.w3c.dom.css.RGBColor;

public class SwingGibon_01 extends JFrame {

	public SwingGibon_01(String title) {
		super(title);

		// 시작 위치, 너비, 높이
		this.setBounds(500, 100, 300, 300);

		// 배경색
		// this.getContentPane().setBackground(Color.cyan);
		this.getContentPane().setBackground(new Color(35,12,77));

		// 프레임에 출력
		this.setVisible(true);

	}

	public static void main(String[] args) {

		new SwingGibon_01("스윙 기본");
	}

}
