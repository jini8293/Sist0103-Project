package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import oracleDb.DbConnect;

public class CarMainList extends JFrame implements ActionListener {

	Container cp;
	JLabel lbTitle; // 내차 조회하기 라벨
	JTextField tfNum; // 내차 입력 칸
	JButton bt_jo; // 조회버튼
	DefaultTableModel model;
	JTable table;

	CarDbModel cd = new CarDbModel();
	MycarUpdate mycarupdate = new MycarUpdate();
	DbConnect db = new DbConnect();

	public CarMainList() {
		setTitle("자동차 관리 시스템");
		cp = this.getContentPane();

		this.setSize(960, 400);
		this.setLocationRelativeTo(null);
		cp.setBackground(new Color(255, 255, 200));
		this.initDesign();
		this.setVisible(true);
	}

	public void initDesign() {
		this.setLayout(null);

		lbTitle = new JLabel("내 차 조회하기", JLabel.CENTER);
		lbTitle.setBounds(20, 20, 300, 50);
		lbTitle.setBorder(new LineBorder(Color.BLACK, 3));
		lbTitle.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		this.add(lbTitle);

		tfNum = new JTextField();
		tfNum.setBounds(20, 80, 300, 30);
		add(tfNum);

		bt_jo = new JButton("조회");
		bt_jo.setBounds(240, 120, 80, 30);
		add(bt_jo);
		bt_jo.addActionListener(this);

		String[] title = { "No", "회사", "모델명", "번호", "등록일자" };

		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		JScrollPane jScollPane = new JScrollPane(table);
		jScollPane.setBounds(360, 20, 560, 320);
		table.getColumn("No").setPreferredWidth(10);
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();

		for (int i = 0; i < tcm.getColumnCount(); i++) {
			tcm.getColumn(i).setCellRenderer(dtcr);
		}

		this.add("Center", jScollPane);

		this.selectCar();

	}

	public void selectCar() {

		model.setRowCount(0);

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select cno, car_company,car_model,c.mycar_num,to_char(mycar_rd,'yy-mm-dd') mycar_rd from car c, mycar m where c.mycar_num=m.mycar_num order by cno ";

		conn = db.getOracle();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Vector<String> data = new Vector<String>();

				data.add(rs.getString("cno"));
				data.add(rs.getString("car_company"));
				data.add(rs.getString("car_model"));
				data.add(rs.getString("mycar_num"));
				data.add(rs.getString("mycar_rd"));

				// 테이블에 추가
				model.addRow(data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	public void selectMycar() {
		model.setRowCount(0);
		String num = tfNum.getText();

		String sql = "select cno, car_company,car_model,c.mycar_num,to_char(mycar_rd,'yy-mm-dd') mycar_rd from car c, mycar m where c.mycar_num=m.mycar_num and c.mycar_num Like '%"
				+ num + "%' order by cno";

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Vector<String> data = new Vector<String>();

				data.add(rs.getString("cno"));
				data.add(rs.getString("car_company"));
				data.add(rs.getString("car_model"));
				data.add(rs.getString("mycar_num"));
				data.add(rs.getString("mycar_rd"));

				// 테이블에 추가
				model.addRow(data);

			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);

				int row = table.getSelectedRow();
				if (row != -1) {
				
					String num = JOptionPane.showInputDialog("차량 번호 뒷자리를 입려해주세요~");

					String sql = "select mycar_num, to_char(mycar_rd,'yyyy-mm-dd') mycar_rd, to_char(mycar_gumsa,'yyyy-mm-dd') mycar_gumsa, mycar_avgac, mycar_mile, mycar_engine, mycar_tire  from mycar where mycar_num like '%"
							+ num + "%'";
					Connection conn = db.getOracle();
					PreparedStatement pstmt = null;
					ResultSet rs = null;

					try {
						pstmt = conn.prepareStatement(sql);
						rs = pstmt.executeQuery();
						if (rs.next()) {
							mycarupdate.tf1.setText(rs.getString("mycar_num"));
							mycarupdate.tf2.setText(rs.getString("mycar_rd"));
							mycarupdate.tf3.setText(rs.getString("mycar_gumsa"));
							mycarupdate.tf4.setText(rs.getString("mycar_avgac"));
							mycarupdate.tf5.setText(rs.getString("mycar_mile"));
							mycarupdate.cbengine.setSelectedItem(rs.getString("mycar_engine"));
							mycarupdate.cbtire.setSelectedItem(rs.getString("mycar_tire"));

							//mycarupdate.setVisible(true);
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} finally {
						db.dbClose(rs, pstmt, conn);
					}
					mycarupdate.setVisible(true);
				}
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == bt_jo) {
			this.selectMycar();
		}
	}

	public static void main(String[] args) {
		new CarMainList();

	}

}
