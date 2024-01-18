package day09;

import java.util.Vector;


import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Event05 extends JFrame{
	public Event05() {
		setSize(400, 200);
		JPanel p = new JPanel();
		String[] name = {"고양이","강아지","햄스터"};
		
		Vector<Integer> vt = new Vector<Integer>();
		vt.add(220);
		vt.add(225);
		vt.add(230);
		vt.add(235);
		vt.add(240);
		vt.add(245);
		
		JComboBox obj1=new JComboBox(name);
		JComboBox obj2=new JComboBox(vt);
		p.add(obj1);
		p.add(obj2);
		add(p);
		setVisible(true);
	}
}

public class ex05 {
	public static void main(String[] args) {
		Event05 e = new Event05();
	}
}
