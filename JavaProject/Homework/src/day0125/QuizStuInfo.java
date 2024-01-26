package day0125;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

import oracleDb.DbConnect;

public class QuizStuInfo {

	DbConnect db = new DbConnect();

	public void insert() {
		Scanner s = new Scanner(System.in);
		String s_name, s_gender, s_age, s_hp;

		String sql = "";

		System.out.println("학생명을 입력하세요");
		s_name = s.nextLine();
		System.out.println("성별을 입력하세요");
		s_gender = s.nextLine();
		System.out.println("나이를 입력하세요");
		s_age = s.nextLine();
		System.out.println("연락처를 입력하세요");
		s_hp = s.nextLine();

		sql = "insert into stuinfo values (seq_info.nextval,'" + s_name + "','" + s_gender + "'," + s_age + ",'" + s_hp
				+ "sysdate)";
		System.out.println(sql);

		Connection conn = null;
		Statement stmt = null;

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("+++데이터 추가완료.+++");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	}

	public void select() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select * from stuinfo order by s_no";

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			System.out.println("\t++stuinfo 테이블++");
			System.out.println("번호\t이름\t성별\t나이\t연락처\t가입일");
			System.out.println("------------------------------------------");

			while (rs.next()) {
				int no = rs.getInt("s_no");
				String name = rs.getString("s_name");
				String gender = rs.getString("s_gender");
				int age = rs.getInt("s_age");
				String hp = rs.getString("s_hp");
				Date day = rs.getDate("gaipday");

				System.out.println(no + "\t" + name + "\t" + gender + "\t" + age + "\t" + hp + "\t" + day);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}

	}

	public void delete() {

		Scanner s = new Scanner(System.in);
		String s_name;
		String sql = "";

		System.out.println("삭제할 학생 이름을 입력하세요");
		s_name = s.nextLine();

		sql = "delete from stuinfo where s_name='" + s_name + "'";
		System.out.println(sql);

		Connection conn = null;
		Statement stmt = null;

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);

			if (a == 0) {
				System.err.println("없는 학생입니다.");
			} else {
				System.out.println("해당 학생의 정보가 삭제되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}

	}

	public void update() {
		Scanner s = new Scanner(System.in);
		String s_no, s_name, s_gender, s_age, s_hp;
		String sql = "";

		System.out.println("수정할 학생 번호을 입력해주세요");
		s_no = s.nextLine();

		if (!this.getOneData(s_no)) {
			System.out.println("해당학생은 존재하지 않습니다");
			return; // 메서드 종료
		}

		System.out.println("학생명을 입력하세요");
		s_name = s.nextLine();
		System.out.println("성별을 입력하세요");
		s_gender = s.nextLine();
		System.out.println("나이를 입력하세요");
		s_age = s.nextLine();
		System.out.println("연락처를 입력하세요");
		s_hp = s.nextLine();

		sql = "update stuinfo set s_name='" + s_name + "', s_gender='" + s_gender + "', s_age=" + s_age + ", s_hp='"
				+ s_hp + "' where s_no="+s_no;
		System.out.println(sql);

		Connection conn = null;
		Statement stmt = null;

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);

			if (a == 0) {
				System.out.println("수정할 학생이 존재하지 않습니다");
			} else {
				System.out.println("+++" + s_name + "학생이 수정 되었습니다+++");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}

	}

	public boolean getOneData(String s_no) {

		boolean flag = false;

		String sql = "select * from stuinfo where s_no=" + s_no;

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
		return flag;
	}

	public void serch() {
		Scanner s = new Scanner(System.in);
		String s_name;
		String sql = "";

		System.out.println("검색할 학생 이름을 입력하세요(ex. 이수연 검색시->이, 수연, 이수연으로 입력");
		s_name = s.nextLine();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		
		sql = "select * from stuinfo where s_name Like '%" + s_name + "%'";

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			System.out.println("\t+++학생 정보+++");
			System.out.println("번호\t이름\t성별\t나이\t연락처\t가입일");
			System.out.println("------------------------------------------");

			while (rs.next()) {
				int no = rs.getInt("s_no");
				String name = rs.getString("s_name");
				String gender = rs.getString("s_gender");
				int age = rs.getInt("s_age");
				String hp = rs.getString("s_hp");
				Date day = rs.getDate("gaipday");

				System.out.println(no + "\t" + name + "\t" + gender + "\t" + age + "\t" + hp + "\t" + day);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}

	}

	public static void main(String[] args) {
		QuizStuInfo qs = new QuizStuInfo();

		Scanner s = new Scanner(System.in);
		int n = 0;

		while (true) {
			System.out.println("++학생 정보 서비스++");
			System.out.println("1.학생정보입력	2.정보출력		3.정보삭제		4.정보수정		5.학생검색		9.종료");

			n = Integer.parseInt(s.nextLine());

			if (n == 1) {
				qs.insert();
			} else if (n == 2) {
				qs.select();
			} else if (n == 3) {
				qs.delete();
			} else if (n == 4) {
				qs.update();
			}else if (n == 5) {
				qs.serch();
			} else if (n == 9) {
				System.out.println("+++서비스를 종료합니다+++");
				break;
			}

		}
	}
}


