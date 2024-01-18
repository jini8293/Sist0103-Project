package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;

import org.w3c.dom.css.RGBColor;

//2개의 텍스트필드에 숫자를 넣고 버튼을 만든후 클릭하면 라벨에 2+3=5 이렇게 출력해 보자
public class SwingTextF_10 extends JFrame {

	Container cp;
	JTextField tfn1, tfn2;
	JButton btnAdd, btnAdd2, btnAdd3, btnAdd4;
	JLabel lbln1, lbln2, lblr;

	public SwingTextF_10(String title) {
		super("텍스트필드 문제");

		cp = this.getContentPane();

		this.setBounds(300, 100, 500, 300);
		cp.setBackground(new Color(255, 204, 204));
		initDisign();
		this.setVisible(true);
	}

	public void initDisign() {
		this.setLayout(null);

		lbln1 = new JLabel("숫자 1");
		lbln1.setBounds(20, 20, 50, 30);

		lbln2 = new JLabel("숫자 2");
		lbln2.setBounds(20, 60, 50, 30);

		this.add(lbln1);
		this.add(lbln2);

		tfn1 = new JTextField();
		tfn1.setBounds(80, 20, 80, 30);
		this.add(tfn1);

		tfn2 = new JTextField();
		tfn2.setBounds(80, 60, 80, 30);
		this.add(tfn2);

		btnAdd = new JButton("+");
		btnAdd.setBounds(10, 110, 50, 40);
		this.add(btnAdd);

		btnAdd2 = new JButton("-");
		btnAdd2.setBounds(80, 110, 50, 40);
		this.add(btnAdd2);

		btnAdd3 = new JButton("*");
		btnAdd3.setBounds(150, 110, 50, 40);
		this.add(btnAdd3);

		btnAdd4 = new JButton("/");
		btnAdd4.setBounds(220, 110, 50, 40);
		this.add(btnAdd4);

		lblr = new JLabel("결과나오는곳");
		lblr.setBounds(20, 170, 250, 60);
		lblr.setBorder(new TitledBorder("결과확인"));
		lblr.setFont(new FontUIResource("", Font.BOLD, 25));
		this.add(lblr);

		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int num1 = Integer.parseInt(tfn1.getText().trim());
				int num2 = Integer.parseInt(tfn2.getText().trim());
				int sum = num1 + num2;

				String s = " " + sum;
				lblr.setText(s);
			}
		});

		btnAdd2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tfn1.getText().trim());
				int num2 = Integer.parseInt(tfn2.getText().trim());
				int b = num1 - num2;

				String y = " " + b;
				lblr.setText(y);

			}
		});

		btnAdd3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tfn1.getText().trim());
				int num2 = Integer.parseInt(tfn2.getText().trim());
				int g = num1 * num2;

				String u = " " + g;

				lblr.setText(u);

			}
		});

		btnAdd4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tfn1.getText().trim());
				int num2 = Integer.parseInt(tfn2.getText().trim());
				int n = num1 / num2;

				String p = " " + n;
				lblr.setText(p);

			}

		});

	}

	public static void main(String[] args) {
		new SwingTextF_10("텍스트필드공부_10");
	}

}