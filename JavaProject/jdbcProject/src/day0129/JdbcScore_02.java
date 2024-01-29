package day0129;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracleDb.DbConnect;

public class JdbcScore_02 {

	DbConnect db = new DbConnect();
	Scanner s = new Scanner(System.in);

	// insert
	public void insertScore() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.print("학생 이름은?");
		String name = s.nextLine();
		System.out.print("학생의 자바 점수는?");
		int java = Integer.parseInt(s.nextLine());
		System.out.print("학생의 오라클 점수는?");
		int oracle = Integer.parseInt(s.nextLine());

		String sql = "insert into sungjuk (num, name, java, oracle) values (sung_juk.nextval, ?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setInt(2, java);
			pstmt.setInt(3, oracle);

			int a = pstmt.executeUpdate();

			if (a == 1) {
				System.out.println("++추가 완료++");
			} else {
				System.err.println("++추가 실패++");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

	// select
	public void selectScore() {
		this.calcTotalAverage();
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from sungjuk order by num";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("\t    +++학생 성적 출력+++");
			System.out.println("번호\t이름\t자바점수\t오라클점수\t총점수\t평균");
			System.out.println("---------------------------------------------------");

			while (rs.next()) {
				System.out.println(rs.getInt("num") + "\t" + rs.getString("name") + "\t" + rs.getInt("java") + "\t"
						+ rs.getInt("oracle") + "\t" + rs.getInt("total") + "\t" + rs.getDouble("average"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}

	// total&average
	public void calcTotalAverage() {
		Connection conn = db.getOracle();
		Statement stmt = null;

		String sql = "update sungjuk set total = java+oracle, average=(java+oracle)/2";

		try {
			stmt = conn.createStatement();

			stmt.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	}

	// delete
	public void deleteScore() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.print("삭제할 학생의 번호-->");
		int num = Integer.parseInt(s.nextLine());

		String sql = "delete from sungjuk where num=?";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, num);
			int a = pstmt.executeUpdate();

			if (a == 1) {
				System.out.println("삭제 성공.");
			} else {
				System.out.println(num+"번 학생은 존재하지 않습니다.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// update
	public void updateScore() {

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		
		System.out.println("수정할 학생의 번호 선택");
		String num = s.nextLine();

		if (!this.isOneData(num)) {
			System.out.println("존재하지 않는 번호입니다");
			return;
		}
		
		System.out.print("수정할 자바 점수");
		int java = Integer.parseInt(s.nextLine());
		System.out.print("수정할 오라클 점수");
		int oracle = Integer.parseInt(s.nextLine());
		
		String sql = "update sungjuk set java=? ,oracle=? where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, java);
			pstmt.setInt(2, oracle);
			pstmt.setString(3, num);
			int n = pstmt.executeUpdate();
			
			if(n==1) {
			System.out.println("수정 완료.");
			}else {
				System.out.println(num+"번 학생이 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
	}

	public boolean isOneData(String num) {
		
		boolean b = false;

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from sungjuk where num=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()==true) {
				b = true;// 데이터 있는경우
			} else {
				b = false;// 데이터 없는 경우
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);

		}

		return b;
	}

	// serch
	public void serchScore() {
		
	}

	public void process() {

		while (true) {
			System.out.println("+++학생 점수 열람표+++");
			System.out.println("1.학생성적추가	2.학생정보전체출력	3.학생정보삭제	4.학생정보수정	5.학생정보검색	0.종료");

			int n = Integer.parseInt(s.nextLine());

			switch (n) {
			case 1: {
				this.insertScore();
				break;
			}
			case 2: {
				this.selectScore();
				break;
			}
			case 3: {
				this.deleteScore();
				break;
			}
			case 4: {
				this.updateScore();
				break;
			}
			case 0: {
				System.out.println("성적프로그램 종료.");
				System.exit(0);
			}

			}
		}
	}

	public static void main(String[] args) {
		JdbcScore_02 j = new JdbcScore_02();
		j.process();
	}

}
