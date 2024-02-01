package swing;

import java.awt.Color;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.AlgorithmConstraints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.css.RGBColor;

public class MycarUpdate extends JFrame {

	Container cp;
	DefaultTableModel model;
	JTable table;

	JLabel com, cmodel, fuel, fe, op, dis, en, sh, size, price;
	JButton bt_su, bt_del;

	JLabel img, mnum, mrd, mgumsa, mavgac, mengine, mtire, mmile;
	JTextField tf1, tf2, tf3, tf4, tf5;
	JComboBox<String> cbengine, cbtire;

	//CarMainList cm = new CarMainList();

	public MycarUpdate() {
		super("내 자동차 정보");

		cp = this.getContentPane();

		this.setBounds(300, 100, 800, 690);
		cp.setBackground(new Color(255, 255, 255));
		initDesign();
		this.setVisible(true);
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

		fuel = new JLabel();
		fe = new JLabel();
		op = new JLabel();
		dis = new JLabel();
		en = new JLabel();
		sh = new JLabel();
		size = new JLabel();
		price = new JLabel();

		fuel.setBounds(80, 80, 120, 30);
		car1.add(fuel);
		fe.setBounds(80, 120, 120, 30);
		car1.add(fe);
		op.setBounds(80, 160, 120, 30);
		car1.add(op);
		dis.setBounds(80, 200, 120, 30);
		car1.add(dis);
		en.setBounds(290, 80, 120, 30);
		car1.add(en);
		sh.setBounds(290, 120, 120, 30);
		car1.add(sh);
		size.setBounds(290, 160, 120, 30);
		car1.add(size);
		price.setBounds(290, 200, 120, 30);
		car1.add(price);

		com = new JLabel("현대");
		cmodel = new JLabel("아이오닉5");

		com.setBounds(27, 25, 60, 30);
		com.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		car1.add(com);
		cmodel.setBounds(90, 25, 120, 30);
		cmodel.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		car1.add(cmodel);

		bt_su = new JButton("수정");
		bt_su.setBounds(590, 605, 80, 30);
		add(bt_su);

		bt_del = new JButton("삭제");
		bt_del.setBounds(685, 605, 80, 30);
		add(bt_del);

		JPanel car2 = new JPanel();
		car2.setLayout(null);
		car2.setBounds(20, 300, 745, 290);
		this.add(car2);

		img = new JLabel("이미지");
		mnum = new JLabel("● 번호");
		mrd = new JLabel("● 등록일");
		mgumsa = new JLabel("● 최근 검사일");
		mavgac = new JLabel("● 평균 연비");
		mengine = new JLabel("● 엔진오일 및 오일필터");
		mtire = new JLabel("● 타이어");
		mmile = new JLabel("● 주행거리");

		mnum.setBounds(40, 17, 60, 30);
		mnum.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mnum.setForeground(new Color(128, 128, 128));
		car2.add(mnum);
		mrd.setBounds(40, 80, 60, 30);
		mrd.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mrd.setForeground(new Color(128, 128, 128));
		car2.add(mrd);
		mgumsa.setBounds(40, 145, 90, 30);
		mgumsa.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mgumsa.setForeground(new Color(128, 128, 128));
		car2.add(mgumsa);
		mavgac.setBounds(40, 207, 90, 30);
		mavgac.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mavgac.setForeground(new Color(128, 128, 128));
		car2.add(mavgac);

		mengine.setBounds(370, 20, 150, 30);
		mengine.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mengine.setForeground(new Color(128, 128, 128));
		car2.add(mengine);
		mtire.setBounds(370, 100, 90, 30);
		mtire.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mtire.setForeground(new Color(128, 128, 128));
		car2.add(mtire);
		mmile.setBounds(370, 180, 90, 30);
		mmile.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		mmile.setForeground(new Color(128, 128, 128));
		car2.add(mmile);

		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		tf5 = new JTextField();

		tf1.setBounds(55, 49, 200, 30);
		car2.add(tf1);
		tf2.setBounds(55, 112, 200, 30);
		car2.add(tf2);
		tf3.setBounds(55, 177, 200, 30);
		car2.add(tf3);
		tf4.setBounds(55, 240, 200, 30);
		car2.add(tf4);
		tf5.setBounds(380, 216, 200, 30);
		car2.add(tf5);

		String[] engine = { "교체 완료", "교체 필요" };
		cbengine = new JComboBox<String>(engine);
		cbengine.setBounds(380, 58, 200, 30);
		car2.add(cbengine);

		String[] tire = { "이상 없음", "이상 있음", "이상 있음(점검 필요)" };
		cbtire = new JComboBox<String>(tire);
		cbtire.setBounds(380, 137, 200, 30);
		car2.add(cbtire);

		ImageIcon icon = new ImageIcon("image/car2.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(300, 130, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel lbimage = new JLabel(changeIcon, JLabel.CENTER);
		lbimage.setBounds(40, 60, 250, 200);
		add(lbimage);

	}
/*
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if (ob == bt_su) {

			String mnum = JOptionPane.showInputDialog("차량 번호 뒷자리를 입력해주세요");
			cm.updateMycar(mnum);

		}

	}
*/
	public static void main(String[] args) {
	new MycarUpdate();
	}

}