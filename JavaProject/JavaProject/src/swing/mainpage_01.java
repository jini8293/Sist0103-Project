package swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

import org.w3c.dom.css.RGBColor;

public class mainpage_01 extends JFrame {

	Container cp;
	JLabel img, com, cmodel, fuel, fe, op, dis, en, sh, size, price;
	DefaultTableModel model;
	JTable table;
	JButton bt_su, bt_del;

	public mainpage_01(String title) {
		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 800, 650);
		cp.setBackground(new Color(255, 255, 255));
		initDesign();
		// this.setVisible(true);
	}

	public void initDesign() {
		this.setLayout(null);

		JPanel car1 = new JPanel();
		car1.setLayout(null);
		car1.setBounds(315, 30, 450, 255);
		this.add(car1);
		JLabel lbl1 = new JLabel("연료");
		JLabel lbl2 = new JLabel("연비");
		JLabel lbl3 = new JLabel("출력");
		JLabel lbl4 = new JLabel("배기량");
		JLabel lbl5 = new JLabel("엔진");
		JLabel lbl6 = new JLabel("변속");
		JLabel lbl7 = new JLabel("크기");
		JLabel lbl8 = new JLabel("가격");

		lbl1.setBounds(30, 80, 60, 30);
		lbl1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lbl1.setForeground(new Color(128, 128, 128));
		car1.add(lbl1);
		lbl2.setBounds(30, 120, 60, 30);
		lbl2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lbl2.setForeground(new Color(128, 128, 128));
		car1.add(lbl2);
		lbl3.setBounds(30, 160, 60, 30);
		lbl3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lbl3.setForeground(new Color(128, 128, 128));
		car1.add(lbl3);
		lbl4.setBounds(30, 200, 60, 30);
		lbl4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lbl4.setForeground(new Color(128, 128, 128));
		car1.add(lbl4);
		lbl5.setBounds(240, 80, 60, 30);
		lbl5.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lbl5.setForeground(new Color(128, 128, 128));
		car1.add(lbl5);
		lbl6.setBounds(240, 120, 60, 30);
		lbl6.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lbl6.setForeground(new Color(128, 128, 128));
		car1.add(lbl6);
		lbl7.setBounds(240, 160, 60, 30);
		lbl7.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lbl7.setForeground(new Color(128, 128, 128));
		car1.add(lbl7);
		lbl8.setBounds(240, 200, 60, 30);
		lbl8.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lbl8.setForeground(new Color(128, 128, 128));
		car1.add(lbl8);

		JLabel car_company = new JLabel("현대");
		JLabel car_model = new JLabel("아이오닉5");

		car_company.setBounds(27, 25, 60, 30);
		car_company.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		car1.add(car_company);
		car_model.setBounds(90, 25, 120, 30);
		car_model.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		car1.add(car_model);

		bt_su = new JButton("수정");
		bt_su.setBounds(590, 560, 80, 30);
		add(bt_su);

		bt_del = new JButton("삭제");
		bt_del.setBounds(685, 560, 80, 30);
		add(bt_del);

		// JPanel car2 = new JPanel();
		// car2.setLayout(null);
		// car2.setBounds(20, 300,745, 250);
		// this.add(car2);

		String[] title = { "No", "등록일", "검사일", "평균연비", "엔진오일&오일필터", "타이어", "주행거리" };

		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		// listScroll.setPreferredSize(new Dimension(200,200));
		this.add("Center", new JScrollPane(table));

	}

	// public static void main(String[] args) {
	// new mainpage_01("스윙 시작");
	// }

}
