package day0119;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import org.w3c.dom.css.RGBColor;

public class CheckRadio_03 extends JFrame implements ActionListener, ItemListener {

	Container cp;
	JCheckBox[] cbHobby = new JCheckBox[4];
	JCheckBox cbDriver;
	JCheckBox font;
	JButton btnHobby;
	JLabel lbl;

	public CheckRadio_03(String title) {
		super(title);

		cp = this.getContentPane();

		this.setBounds(400, 300, 350, 300);
		cp.setBackground(new Color(255, 204, 204));
		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {
		this.setLayout(null);
		cbDriver = new JCheckBox("운전면허");
		cbDriver.setBounds(20, 20, 100, 30);
		cbDriver.setOpaque(false);
		cbDriver.addItemListener(this);// ItemListener이벤트 핸들러와 연결되는 객체임을 표시
		this.add(cbDriver);
		
		font = new JCheckBox("글꼴 굵게");
		font.setBounds(20,60,100,30);
		font.setOpaque(false);
		font.addItemListener(this);
		this.add(font);

		lbl = new JLabel("Have a Nice Day.", JLabel.CENTER);
		lbl.setBounds(20, 200, 300, 50);
		lbl.setBorder(new LineBorder(Color.red, 5));
		
		this.add(lbl);

		// 취미 체크박스
		String[] hobbys = { "여행", "게임", "넷플릭스", "코딩" };
		int xpos = 20;

		for (int i = 0; i < cbHobby.length; i++) {
			cbHobby[i] = new JCheckBox(hobbys[i]);
			cbHobby[i].setBounds(xpos, 100, 80, 30);
			cbHobby[i].setOpaque(false);
			this.add(cbHobby[i]);
			xpos += 85;
		}

		// 버튼
		btnHobby = new JButton("나의 취미 출력");
		btnHobby.setBounds(60, 150, 220, 30);
		btnHobby.addActionListener(this);
		this.add(btnHobby);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == btnHobby) {
			String s = "나의 취미는 ";
			int select=0;
			for (int i = 0; i < cbHobby.length; i++) {
				if (cbHobby[i].isSelected()) {
					select++;
					s += "[" + cbHobby[i].getText() + "]";
				}
			}
			if(select==0) {
				s+="없습니다.";
			}else {
				s+= "입니다.";
			}
			lbl.setText(s);
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource();

		if (ob == cbDriver) {
			String s = "체크상태:" + cbDriver.isSelected() + " , 텍스트 :" + cbDriver.getText();
			lbl.setText(s);
		}
		
		if (ob == font) {
			
			if(font.isSelected()==true) {
				lbl.setFont(new Font("",Font.BOLD,12));
				
			}else if(font.isSelected()==false) {
				lbl.setFont(new Font("",Font.PLAIN,12));
				
			}
		}
		
		
		
		

	}

	public static void main(String[] args) {
		new CheckRadio_03("체크박스_03");
	}

}