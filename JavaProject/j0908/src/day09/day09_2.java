package day09;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


class Event04 extends JFrame implements ActionListener{
	JLabel text;
	JRadioButton j1,j2,j3;
	ButtonGroup group;
	public Event04() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("프레임연습");
		
		
		JPanel p=new JPanel();
		
		text = new JLabel("아무것도 선택되지 않았습니다.");
		
		
		j1=new JRadioButton("메론");
		j2=new JRadioButton("사과");
		j3=new JRadioButton("포도");
		
		group = new ButtonGroup();
		group.add(j1);
		group.add(j2);
		group.add(j3);
		
		j1.addActionListener(this);
		j2.addActionListener(this);
		j3.addActionListener(this);
		
		p.add(j1);
		p.add(j2);
		p.add(j3);
		p.add(text);
		add(p);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==j1)
			text.setText(j1.getText()+"선택");
		if(e.getSource()==j2)
			text.setText(j2.getText()+"선택");
		if(e.getSource()==j3)
			text.setText(j3.getText()+"선택");
	}
	
}

public class day09_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event04 f01 = new Event04();
	}

}
