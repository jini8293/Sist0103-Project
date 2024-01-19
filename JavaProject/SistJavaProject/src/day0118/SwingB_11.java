package day0118;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;

import org.w3c.dom.css.RGBColor;

public class SwingB_11 extends JFrame implements ActionListener {

	Container cp;
	JButton[] btn = new JButton[5];
	String[] btnLabel = { "Red", "Green", "Blue", "Magenta", "pink" };
	Color[] btnColors = { Color.red, Color.green, Color.blue, Color.magenta, Color.pink };
	JLabel tf;

	public SwingB_11(String title) {
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
		p.setBackground(Color.white);

		this.add(p, BorderLayout.NORTH); // 프레임의 상단에 패널 배치

		// 버튼생성
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(btnLabel[i]);
			btn[i].setBackground(btnColors[i]);
			p.add(btn[i]);

			// 버튼 6개 이벤트 추가
			btn[i].addActionListener(this);

		}
		btn[0].setForeground(Color.white);
		btn[2].setForeground(Color.white);
		btn[3].setForeground(Color.white);


		tf = new JLabel("안녕하세요", JLabel.CENTER);
		tf.setFont(new Font("",Font.BOLD,30));
		this.add(tf);

	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		for (int i = 0; i < btn.length; i++) {
			if (ob == btn[i]) {
				tf.setForeground(btnColors[i]);
				this.setTitle("Color: " + btnLabel[i]);

			}
		}

	}

	public static void main(String[] args) {
		new SwingB_11("배열버튼 이벤트_8");
	}

}