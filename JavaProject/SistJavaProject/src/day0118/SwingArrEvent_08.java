package day0118;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.w3c.dom.css.RGBColor;

public class SwingArrEvent_08 extends JFrame implements ActionListener {

	Container cp;
	JButton[] btn = new JButton[6];
	String[] btnLabel = { "Red", "Green", "Blue", "Magenta", "Gray", "Yellow" };
	Color[] btnColors = { Color.red, Color.green, Color.blue, Color.magenta, Color.gray, Color.yellow };

	public SwingArrEvent_08(String title) {
		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 600, 300);
		cp.setBackground(new Color(255, 204, 204));
		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {

		// Panel은 기본이 FlowLayout
		JPanel p = new JPanel();
		p.setBackground(Color.orange);

		this.add(p, BorderLayout.NORTH); // 프레임의 상단에 패널 배치

		// 버튼생성
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(btnLabel[i]);
			btn[i].setBackground(btnColors[i]);
			p.add(btn[i]);

			// 버튼 6개 이벤트 추가
			btn[i].addActionListener(this); 
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		for (int i = 0; i < btn.length; i++) {
			if (ob == btn[i]) {
				cp.setBackground(btnColors[i]);
				this.setTitle("Color: "+btnLabel[i]);
				
			}
		}

	}

	public static void main(String[] args) {
		new SwingArrEvent_08("배열버튼 이벤트_8");
	}

}