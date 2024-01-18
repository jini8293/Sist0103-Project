package day0118;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.InitialContext;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.w3c.dom.css.RGBColor;

public class SwingComponent_09 extends JFrame {

	Container cp;
	JTextField t1, t2;
	JLabel lbl1, lbl2, lbl3, lbl4;
	Icon i1=new ImageIcon("C:\\sist0103\\image\\ame9.gif");
	Icon i2=new ImageIcon("C:\\sist0103\\image\\45-pandadog.gif");

	public SwingComponent_09(String title) {
		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 204));
		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {
		
		this.setLayout(null);
		
		t1=new JTextField();
		t1.setBounds(10, 20, 80, 30);
		this.add(t1);
		
		t2=new JTextField("Have a Nice Day");
		t2.setBounds(10, 60, 100, 30);
		this.add(t2);
		
		lbl1 = new JLabel("안녕하세요",JLabel.CENTER);
		lbl1.setBounds(10,100,200,30);
		lbl1.setBackground(Color.orange);
		lbl1.setOpaque(true);
		this.add(lbl1);
		
		lbl2 = new JLabel("Haappy Day",i1,JLabel.RIGHT);
		lbl2.setBounds(10,150,200,30);
		lbl2.setBorder(new LineBorder(Color.red));
		//lbl2.setBackground(Color.orange);
		//lbl2.setOpaque(true);
		this.add(lbl2);
		
		lbl3 = new JLabel("스윙공부",i2,JLabel.CENTER);
		lbl3.setBounds(10,180,200,30);
		lbl3.setBorder(new TitledBorder("쌍용교육"));
		//lbl2.setBackground(Color.orange);
		//lbl2.setOpaque(true);
		this.add(lbl3);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		
		lbl4 = new JLabel(sdf.format(new Date()),i1,JLabel.CENTER);
		lbl4.setBounds(10,210,200,30);
		lbl4.setBorder(new LineBorder(Color.pink,2));
		this.add(lbl4);
	}

	public static void main(String[] args) {
		new SwingComponent_09("스윙 컴포넌트_9");
	}

}