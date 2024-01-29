package homework_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracleDb.DbConnect;

public class QuizJdbc {

	DbConnect db = new DbConnect();
	Scanner s = new Scanner(System.in);

	public void insertMember() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.print("사원의 이름");
		String s_name = s.nextLine();
		System.out.print("사원의 부서");
		String buseo = s.nextLine();
		System.out.print("사원의 직책");
		String position = s.nextLine();
		System.out.print("사원의 성별");
		String gender = s.nextLine();
		System.out.print("사원의 급여");
		int pay = Integer.parseInt(s.nextLine());
		System.out.print("사원의 보너스");
		int bonus = Integer.parseInt(s.nextLine());

		String sql = "insert into sawonmember values(seq_smem.nextval,?,?,?,?,?,?,sysdate)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s_name);
			pstmt.setString(2, buseo);
			pstmt.setString(3, position);
			pstmt.setString(4, gender);
			pstmt.setInt(5, pay);
			pstmt.setInt(6, bonus);

			int a = pstmt.executeUpdate();

			if (a == 1) {
				System.out.println("++추가 되었습니다.++");
			} else {
				System.err.println("추가 실패,,,");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	public void selectMember() {

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select s_no, s_name, buseo, position, gender, to_char(pay,'L999,999,999') pay, to_char(bonus,'L999,999') bonus, ipsaday from sawonmember order by s_no";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("\t\t\t\t+++사원 정보 출력+++");
			System.out.println("사원번호\t사원명\t부서\t직급\t성별\t     월급여\t       보너스\t  입사일");
			System.out.println("--------------------------------------------------------------------------------------");

			while (rs.next()) {
				System.out.println(rs.getInt("s_no") + "\t" + rs.getString("s_name") + "\t" + rs.getString("buseo")
						+ "\t" + rs.getString("position") + "\t" + rs.getString("gender") + rs.getString("pay")
						+ rs.getString("bonus") + "\t  " + rs.getDate("ipsaday"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

	}

	public void deleteMember() {

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.print("삭제할 사원의 번호-->");
		int num = Integer.parseInt(s.nextLine());

		String sql = "delete from sawonmember where s_no=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);

			int a = pstmt.executeUpdate();

			if (a == 1) {
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println(num + "번 사원은 존재하지 않습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

	public void updateMember() {

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.print("수정할 사원의 번호-->");
		String num = s.nextLine();

		if (!this.isOneData(num)) {
			System.out.println("존재하지 않는 사원입니다.");
			return;
		}

		System.out.print("수정할 사원 이름 -->");
		String sname = s.nextLine();
		System.out.print("수정할 사원 부서 -->");
		String buseo = s.nextLine();
		System.out.print("수정할 사원 직급 -->");
		String position = s.nextLine();
		System.out.print("수정할 사원 성별 -->");
		String gender = s.nextLine();
		System.out.print("수정할 사원 급여 -->");
		String pay = s.nextLine();
		System.out.print("수정할 사원 보너스 -->");
		String bonus = s.nextLine();

		String sql = "update sawonmember set s_name=?, buseo=?, position=?, gender=?,pay=?,bonus=? where s_no=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sname);
			pstmt.setString(2, buseo);
			pstmt.setString(3, position);
			pstmt.setString(4, gender);
			pstmt.setString(5, pay);
			pstmt.setString(6, bonus);
			pstmt.setString(7, num);

			int a = pstmt.executeUpdate();

			if (a == 1) {
				System.out.println("수정되었습니다.");
			} else {
				System.out.println(num + "번 사원은 존재하지 않습니다.");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

	private boolean isOneData(String num) {
		boolean b = false;

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from  sawonmember where s_no=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				b = true;
			} else
				b = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
		return b;
	}

	public void serchMember() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		System.out.print("검색할 학생 이름을 입력하세요(일부도 가능)-->");
		String s_name = s.nextLine();

		String sql = "select s_no, s_name, buseo, position, gender, to_char(pay,'L999,999,999') pay, to_char(bonus,'L999,999') bonus, ipsaday from sawonmember where s_name like ? order by s_no";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + s_name + "%");

			rs = pstmt.executeQuery();

			System.out.println("\t\t\t\t+++사원 정보 출력+++");
			System.out.println("사원번호\t사원명\t부서\t직급\t성별\t     월급여\t       보너스\t  입사일");
			System.out.println("--------------------------------------------------------------------------------------");

			while (rs.next()) {
				System.out.println(rs.getInt("s_no") + "\t" + rs.getString("s_name") + "\t" + rs.getString("buseo")
						+ "\t" + rs.getString("position") + "\t" + rs.getString("gender") + rs.getString("pay")
						+ rs.getString("bonus") + "\t  " + rs.getDate("ipsaday"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}

	public static void main(String[] args) {

		QuizJdbc q = new QuizJdbc();
		Scanner s = new Scanner(System.in);

		int n;

		while (true) {

			System.out.println("1.사원정보입력	2.전체사원출력 	 3.사원삭제	4.사원수정		5.이름검색(이름일부) 	9.시스템종료");

			System.out.print("메뉴 선택====>");
			n = Integer.parseInt(s.nextLine());

			if (n == 1) {
				q.insertMember();
			} else if (n == 2) {
				q.selectMember();
			} else if (n == 3) {
				q.deleteMember();
			} else if (n == 4) {
				q.updateMember();
			} else if (n == 5) {
				q.serchMember();
			} else if (n == 9) {
				System.out.println("++++프로그램 종료.++++");
				break;
			}
		}

	}

}
