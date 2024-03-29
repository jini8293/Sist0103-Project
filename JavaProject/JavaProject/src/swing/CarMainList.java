package swing;

import java.awt.Color;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
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

		mycarupdate.bt_su.addActionListener(this);
		mycarupdate.bt_del.addActionListener(this);

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

					String num = JOptionPane.showInputDialog("차량 번호 뒷자리를 입력해주세요.");

					String sql = "select c.car_company, c.car_model,c.car_fuel, c.car_fe, c.car_op, c.car_dis, c.car_en, c.car_sh, c.car_size, c.car_price,m.mycar_num, to_char(m.mycar_rd,'yyyy-mm-dd') mycar_rd, to_char(m.mycar_gumsa,'yyyy-mm-dd') mycar_gumsa, m.mycar_avgac, m.mycar_mile, m.mycar_engine, m.mycar_tire \r\n"
							+ "from car c,mycar m where m.mycar_num=c.mycar_num and m.mycar_num like '____" + num + "'";
					Connection conn = db.getOracle();
					PreparedStatement pstmt = null;
					ResultSet rs = null;

					try {
						pstmt = conn.prepareStatement(sql);
						rs = pstmt.executeQuery();
						if (rs.next()) {
							mycarupdate.fuel.setText(rs.getString("car_fuel"));
							mycarupdate.fe.setText(rs.getString("car_fe"));
							mycarupdate.op.setText(rs.getString("car_op"));
							mycarupdate.dis.setText(rs.getString("car_dis"));
							mycarupdate.en.setText(rs.getString("car_en"));
							mycarupdate.sh.setText(rs.getString("car_sh"));
							mycarupdate.size.setText(rs.getString("car_size"));
							mycarupdate.price.setText(rs.getString("car_price"));
							mycarupdate.com.setText(rs.getString("car_company"));
							mycarupdate.cmodel.setText(rs.getString("car_model"));
							mycarupdate.tf1.setText(rs.getString("mycar_num"));
							mycarupdate.tf2.setText(rs.getString("mycar_rd"));
							mycarupdate.tf3.setText(rs.getString("mycar_gumsa"));
							mycarupdate.tf4.setText(rs.getString("mycar_avgac"));
							mycarupdate.tf5.setText(rs.getString("mycar_mile"));
							mycarupdate.cbengine.setSelectedItem(rs.getString("mycar_engine"));
							mycarupdate.cbtire.setSelectedItem(rs.getString("mycar_tire"));

							mycarupdate.setVisible(true);
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					} finally {
						db.dbClose(rs, pstmt, conn);
					}
					// if (num == null) {
					// mycarupdate.setVisible(false);
					// }
				}
			}
		});

	}

	public void updateMycar(String mnum) {

		String mnum1 = mycarupdate.tf1.getText();
		String mrd = mycarupdate.tf2.getText();
		String mgumsa = mycarupdate.tf3.getText();
		String mavgac = mycarupdate.tf4.getText();
		String mengine = (String) mycarupdate.cbengine.getSelectedItem();
		String mtire = (String) mycarupdate.cbtire.getSelectedItem();
		String mmile = mycarupdate.tf5.getText();

		String sql = "update mycar set mycar_num=?, mycar_rd=?, mycar_gumsa=?, mycar_avgac=?, mycar_engine=?, mycar_tire=?,mycar_mile=? where mycar_num Like '%"
				+ mnum + "%'";

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mnum1);
			pstmt.setString(2, mrd);
			pstmt.setString(3, mgumsa);
			pstmt.setString(4, mavgac);
			pstmt.setString(5, mengine);
			pstmt.setString(6, mtire);
			pstmt.setString(7, mmile);

			int a = pstmt.executeUpdate();

			if (a == 0) {
				JOptionPane.showMessageDialog(this, "없는 번호입니다");
			} else {
				JOptionPane.showMessageDialog(this, "수정되었습니다");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	public void deleteMycar(String mnum) {
		String sql  = "delete from mycar where mycar_num like '____"+mnum+"'";
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			int a = pstmt.executeUpdate();

			if (a == 0) {
				JOptionPane.showMessageDialog(this, "없는 번호입니다");
			} else {
				JOptionPane.showMessageDialog(this, "삭제되었습니다");
				mycarupdate.dispose();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == bt_jo) {
			this.selectMycar();
		} else if (ob == mycarupdate.bt_su) {

			String mnum = JOptionPane.showInputDialog("차량 번호 뒷자리를 입력해주세요");
			updateMycar(mnum);

		} else if ( ob == mycarupdate.bt_del) {
			String mnum = JOptionPane.showInputDialog("차량 번호 뒷자리를 입력해주세요");
			deleteMycar(mnum);
			
		}
	}

	public static void main(String[] args) {
		new CarMainList();

	}

}