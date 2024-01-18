package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingBtnEvent_05 extends JFrame implements ActionListener {

	Container cp;
	JButton j1, j2;

	public SwingBtnEvent_05(String title) {

		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 204));

		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {

		this.setLayout(new FlowLayout());

		j1 = new JButton("◀");
		j2 = new JButton("▶");

		this.add("South", j1);
		this.add("South", j2);

		// 버튼 색상 변경
		j1.setBackground(Color.black);
		j2.setBackground(Color.pink);

		// 글자 색상 변경
		j1.setForeground(Color.white);

		j1.addActionListener(this);
		j2.addActionListener(this);

		this.add(j1);
		this.add(j2);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == j1) {
			JOptionPane.showMessageDialog(this, "왼쪽으로 이동");
		} else if (ob == j2) {
			JOptionPane.showMessageDialog(this, "오른쪽으로 이동");
		}
	}

	public static void main(String[] args) {
		new SwingBtnEvent_05("버튼 이벤트 5");
	}

}