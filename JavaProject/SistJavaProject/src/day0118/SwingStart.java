package day0118;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

import org.w3c.dom.css.RGBColor;

public class SwingStart extends JFrame {

	Container cp;

	public SwingStart(String title) {
		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 204));
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new SwingStart("스윙 시작");
	}

}
