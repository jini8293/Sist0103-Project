package day0119;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.w3c.dom.css.RGBColor;

public class Check extends JFrame implements ItemListener, ActionListener {

	Container cp;

	JCheckBox man;
	JCheckBox[] con = new JCheckBox[4];
	JRadioButton[] rb = new JRadioButton[4];
	Color[] colors = { Color.red, Color.green, Color.pink, Color.blue };
	JLabel lbl;

	public Check(String title) {
		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 350, 300);
		cp.setBackground(new Color(255, 204, 204));
		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {
		this.setLayout(null);

		man = new JCheckBox("남자");
		man.setBounds(20, 20, 100, 30);
		man.setOpaque(false);
		man.addItemListener(this);
		this.add(man);

		lbl = new JLabel("여자입니다.", JLabel.CENTER);
		lbl.setBounds(20, 200, 300, 50);
		lbl.setBorder(new LineBorder(Color.red, 5));
		this.add(lbl);

		String[] country = { "이탈리아", "미국", "호주", "일본" };
		JPanel pB = new JPanel();
		// pB.setLayout(null);
		pB.setBounds(20, 55, 300, 50);
		pB.setBorder(new TitledBorder("내가가본나라"));
		this.add(pB);
		int x = 20;

		for (int i = 0; i < con.length; i++) {
			con[i] = new JCheckBox(country[i]);
			con[i].setBounds(x, 55, 100, 30);
			con[i].addActionListener(this);
			pB.add(con[i]);
			x += 85;
		}

		String[] str = { "빨강", "초록", "핑크", "파랑" };
		JPanel pTop = new JPanel();
		// pTop.setLayout(null);
		pTop.setBounds(20, 120, 300, 50);
		pTop.setBorder(new TitledBorder("색상"));
		this.add("West", pTop);

		ButtonGroup bg = new ButtonGroup();
		for (int i = 0; i < rb.length; i++) {
			rb[i] = new JRadioButton(str[i], i == 1 ? true : false);
			rb[i].setBounds(x, 120, 100, 30);
			bg.add(rb[i]);
			rb[i].addActionListener(this);
			
			pTop.add(rb[i]);
			x += 85;
		}
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		String s = "내가 가본나라는 ";
		int select = 0;
		for (int i = 0; i < con.length; i++) {
			if (con[i].isSelected() == true) {
				select++;
				s += "[" + con[i].getText() + "]";
			}
		}
		if (select == 0) {
			s += "없습니다.";
		} else {
			s += "입니다.";
		}
		lbl.setText(s);

	
		for (int i = 0; i < rb.length; i++) {
			if (rb[i].isSelected()==true) {
				cp.setBackground(colors[i]);
			}
				
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource();

		if (ob == man) {
			if (man.isSelected() == true) {
				String s = man.getText() + "입니다.";
				lbl.setFont(new Font("", Font.BOLD, 12));
				lbl.setText(s);
			} else if (man.isSelected() == false) {
				String s = "여자입니다.";
				lbl.setFont(new Font("", Font.BOLD, 12));
				lbl.setText(s);
			}
		}

	}

	public static void main(String[] args) {
		new Check("스윙 시작");
	}

}
