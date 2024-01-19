package day0119;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import org.w3c.dom.css.RGBColor;

import day0112.SuperObj_03;

public class SwingTable extends JFrame {

	Container cp;

	JTable table;
	JLabel lblTitle, lblOut;

	public SwingTable(String title) {
		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 204));
		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {
		String[][] data = { { "송혜교", "서울", "010-1111-4444" }, { "전지현", "인천", "010-2222-4444" },
				{ "이효리", "부산", "010-2222-5555" } };

		String[] title = { "이름", "주소", "연락처" };

		lblTitle = new JLabel("JTable연습", JLabel.CENTER);

		lblOut = new JLabel("결과 출력 하는 곳", JLabel.CENTER);

		table = new JTable(data, title);
		JScrollPane pane = new JScrollPane(table);

		// 테이블에 마우스 이벤트 추가
		table.addMouseListener(new TableEvent());

		this.add("North", lblTitle);
		this.add("Center", pane);
		this.add("South", lblOut);
	}

	class TableEvent extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {

			super.mouseClicked(e);// 아래로 테스트
			// System.out.println("출력");

			int rowNum = table.getSelectedRow();// 아래로 테스트
			// JOptionPane.showMessageDialog(SwingTable.this, "행번호: "+rowNum);

			String str = "이름: " + table.getValueAt(rowNum, 0) + ", 주소: " + table.getValueAt(rowNum, 1) + ", 핸드폰: "
					+ table.getValueAt(rowNum, 2);
			lblOut.setText(str);
		}

	}

	public static void main(String[] args) {
		new SwingTable("스윙 시작");
	}

}
