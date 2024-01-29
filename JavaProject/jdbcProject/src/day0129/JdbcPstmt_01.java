package day0129;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracleDb.DbConnect;

public class JdbcPstmt_01 {

	DbConnect db = new DbConnect();

	Scanner s = new Scanner(System.in);

	// insert
	public void insertSangPum() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.print("type?");
		String type = s.nextLine();
		System.out.print("상품명?");
		String sang = s.nextLine();
		System.out.print("수량?");
		int su = Integer.parseInt(s.nextLine());
		System.out.print("단가?");
		int dan = Integer.parseInt(s.nextLine());

		// PreparedStatement는 미완의 sql문을 작성할 수 있다.
		// 변수를 ? 로 표시후 나중에 바인딩 시켜주면 된다.
		String sql = "insert into sales values (seq1.nextval,?,?,?,?,sysdate)";

		try {
			pstmt = conn.prepareStatement(sql);

			// ?를 순서대로 바인딩 한후 업데이트
			pstmt.setString(1, type);
			pstmt.setString(2, sang);
			pstmt.setInt(3, su);
			pstmt.setInt(4, dan);

			// 업데이트
			int n = pstmt.executeUpdate();

			if (n == 1) {
				System.out.println("인서트 성공");
			} else {
				System.out.println("인서트 실패");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			db.dbClose(pstmt, conn);
		}

	}

	// select
	public void writeSangPum() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from sales order by num";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("시퀀스\t카테고리\t상품명\t수량\t단가\t입고일");
			System.out.println("---------------------------------------------------");

			while (rs.next()) {
				System.out.println(rs.getInt("num") + "\t" + rs.getString("type") + "\t" + rs.getString("sangpum")
						+ "\t" + rs.getInt("su") + "\t" + rs.getInt("dan") + "\t" + rs.getDate("ipgo"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);

		}
	}

	// delete
	public void deleteSangPum() {
		// 삭제..시퀀스 번호로
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.print("삭제할 시퀀스는?");
		int num = Integer.parseInt(s.nextLine());

		String sql = "delete from sales where num=?";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, num);

			int n = pstmt.executeUpdate();

			if (n == 1) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	};

	// update
	public void updateSangPum() {

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.println("수정할 시퀀스는?");
		String num = s.nextLine();

		if (!this.isOneData(num)) {
			System.out.println("없는 시퀀스 입니다");
			return;
		}

		System.out.print("수정할 상품명?");
		String sang = s.nextLine();
		System.out.print("수정할 수량?");
		int su = Integer.parseInt(s.nextLine());
		System.out.print("수정할 단가?");
		int dan = Integer.parseInt(s.nextLine());

		String sql = "update sales set sangpum=? ,su=?, dan=? where num=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sang);
			pstmt.setInt(2, su);
			pstmt.setInt(3, dan);
			pstmt.setString(4, num);

			pstmt.execute();

			System.out.println("수정 완료.");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);

		}

	}

	// serch
	public void serchSangPum() {
		System.out.println("검색할 이름을 입력하세요(일부)");
		String sang = s.nextLine();

		String sql = "select num, sangpum, su, dan from sales where sangpum Like ?";

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, "%" + sang + "%");
			rs = pstmt.executeQuery();
			
			System.out.println("시퀀스\t상품명\t수량\t단가");
			System.out.println("-----------------------------");

			while (rs.next()) {
				System.out.println(rs.getInt("num") + "\t" + rs.getString("sangpum") + "\t" + rs.getInt("su") + "\t"
						+ rs.getInt("dan"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
			
		}

	}

	// 수정..num을 인자로 받아서 데이터가 있으면 true, 없으면 false를 반환하는 메서드
	public boolean isOneData(String num) {
		boolean b = false;

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from sales where num=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
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

	public static void main(String[] args) {

		JdbcPstmt_01 sales = new JdbcPstmt_01();
		Scanner s = new Scanner(System.in);
		int n;

		while (true) {
			System.out.println("***상품입고***");
			System.out.println("1.상품추가		2.상품전체출력 	 3.상품삭제	4.상품수정		5.검색(이름일부) 	9.종료");

			System.out.print("선텍할 메뉴는?====>");
			n = Integer.parseInt(s.nextLine());

			if (n == 1) {
				sales.insertSangPum();
			} else if (n == 2) {
				sales.writeSangPum();
			} else if (n == 3) {
				sales.deleteSangPum();
			} else if (n == 4) {
				sales.updateSangPum();
			} else if (n == 5) {
				sales.serchSangPum();
			} else if (n == 9) {
				System.out.println("프로그램 종료.");
				break;
			}
		}

	}

}
