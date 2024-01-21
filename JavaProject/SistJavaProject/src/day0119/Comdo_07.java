package day0119;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import org.w3c.dom.css.RGBColor;

public class Comdo_07 extends JFrame implements ItemListener, ActionListener {

	Container cp;

	JTextField tf;
	JButton add, del;
	JLabel lbl;
	JComboBox<String> combo;
	String[] names = { "박나래", "전현무", "덱스", "기안" };

	int idx = -1; // 멤버변수는 0을 자동초기화 되는데 0번 삭제를 막기 위해서

	public Comdo_07(String title) {
		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 410, 350);
		cp.setBackground(new Color(255, 204, 204));
		initdesign();
		this.setVisible(true);
	}

	public void initdesign() {
		this.setLayout(null);

		combo = new JComboBox<String>(names);
		combo.setBounds(50, 30, 100, 30);
		this.add(combo);

		tf = new JTextField();
		tf.setBounds(50, 90, 80, 30);
		this.add(tf);

		add = new JButton("주가");
		add.setBounds(160, 90, 80, 30);
		this.add(add);

		del = new JButton("삭제");
		del.setBounds(270, 90, 80, 30);
		this.add(del);

		lbl = new JLabel("아무것도 선택되지 않음", JLabel.CENTER);
		lbl.setBorder(new LineBorder(Color.pink, 8));
		lbl.setBounds(20, 200, 350, 60);
		this.add(lbl);

		// 이벤트
		combo.addItemListener(this);
		add.addActionListener(this);
		del.addActionListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		idx = combo.getSelectedIndex();
		String item = (String) combo.getSelectedItem();

		lbl.setText(idx + "번 인덱스의 " + item + "선택됨.");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob==add) {
			//입력한 이름을 앞뒤 공백 제거후 읽는다
			String text = tf.getText().trim();
			
			if(text.length()==0){
				JOptionPane.showMessageDialog(this, "이름을 입력후 추가버튼을 누르세요.");
			
			}else {
				combo.addItem(text);//콤보에 추가
				tf.setText("");//입력값 초기화
			}
		}else if(ob==del) {
			
			if(idx==-1) {
				JOptionPane.showInternalMessageDialog(this, "삭제할 항목을 선택후 삭제해 주세요");
			}else {
				combo.removeItemAt(idx);
				lbl.setText("해당 항목을 삭제했습니다.");
			}
		}
		
	}

	public static void main(String[] args) {
		new Comdo_07("콤보박스");
	}

}