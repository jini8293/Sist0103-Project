package day0126;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

import oracleDb.DbConnect;

public class HelloCrud {

	DbConnect db = new DbConnect();

	public void insert() {
		Scanner s = new Scanner(System.in);
		String name, addr;
		String sql = "";
		System.out.println("이름을 입력하세요");
		name = s.nextLine(); // name은 변수

		System.out.println("주소를 입력하세요");
		addr = s.nextLine();

		sql = "insert into hello values (seq1.nextval,'" + name + "','" + addr + "', sysdate)";
		System.out.println(sql);

		// 1.db연결
		Connection conn = null;
		Statement stmt = null; // sql문 객체 전송에 필요한 API

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();

			// 2. sql문 실행
			stmt.execute(sql);
			System.out.println("**데이터 추가됨**");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}

	}

	public void select() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select * from hello order by num";

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			System.out.println("\t**hello 테이블");
			System.out.println("시퀀스\t이름\t주소\t        가입날짜");
			System.out.println("------------------------------------------");

			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				Date sdate = rs.getDate("sdate");

				System.out.println(num + "\t" + name + "\t" + addr + "\t" + sdate);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}

	}

	public void delete() {

		Scanner s = new Scanner(System.in);
		String num;
		String sql = "";

		System.out.println("삭제할 번호 입력");
		num = s.nextLine();

		sql = "delete from hello where num=" + num;
		System.out.println(sql);
		Connection conn = null;
		Statement stmt = null;

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();

			int a = stmt.executeUpdate(sql);

			// 없는 번호 입력시 실제 삭제가 안되므로 0이 반환됨
			if (a == 0) {
				System.out.println("없는 데이터 번호입니다");
			} else {
				System.out.println("삭제 되었습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
	}

	// 수정
	public void update() {

		Scanner s = new Scanner(System.in);
		String num, name, addr;
		String sql = "";

		System.out.println("수정할 번호 입력");
		num = s.nextLine();
		
		if(!this.getOneData(num)) {
			System.out.println("해당번호는 존재하지 않습니다");
			return; //메서드 종료
		}

		System.out.println("수정할 이름으로 변경해주세요");
		name = s.nextLine();
		System.out.println("수정할 주소로 변경해주세요");
		addr = s.nextLine();

		sql = "update hello set name='" + name + "', addr='" + addr + "' where num=" + num;
		System.out.println(sql);

		Connection conn = null;
		Statement stmt = null;

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);

			if (a == 0) {
				System.out.println("수정할 데이터가 존재하지 않습니다");
			} else {
				System.out.println("***수정 되었습니다***");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}

	}

	// 수정하려는 데이터 조회
	public boolean getOneData(String num)
	{
		boolean flag = false;
		
		String sql = "select * from hello where num="+num;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		conn=db.getOracle();
		try {
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			//한개만 조회할 경우는 if문
			if(rs.next()) {
				flag=true;
			}else {
				flag=false;
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		return flag;
	}

	public static void main(String[] args) {
		HelloCrud hc = new HelloCrud();

		Scanner s = new Scanner(System.in);
		int n = 0;

		while (true) {
			System.out.println("**hello DB 연습**");
			System.out.println("1.insert	2.select	3.delete	4.update	9.exit");

			n = Integer.parseInt(s.nextLine());

			if (n == 1) {
				hc.insert();
			} else if (n == 2) {
				hc.select();
			} else if (n == 3) {
				hc.delete();
			} else if (n == 4) {
				hc.update();
			} else if (n == 9) {
				System.out.println("종료할게요");
				break;
			}
		}

	}

}
