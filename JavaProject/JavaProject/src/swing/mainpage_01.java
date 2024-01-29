package swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import org.w3c.dom.css.RGBColor;

public class mainpage_01 extends JFrame {

	Container cp;

	public mainpage_01(String title) {
		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 1000, 810);
		cp.setBackground(new Color(255, 204, 204));
		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {
		this.setLayout(null);
		
		
		JPanel pTop = new JPanel();
		pTop.setBounds(450,30, 500, 300);
		this.add(pTop);
		
		
		JPanel pB = new JPanel();
		pB.setBounds(20, 350, 930, 400);
		this.add(pB);
	}
	
	public static void main(String[] args) {
		new mainpage_01("스윙 시작");
	}

}

