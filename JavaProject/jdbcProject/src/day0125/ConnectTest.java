package day0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTest {

	static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";

	public void connectSawon() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select * from sawon order by num";

		try {
			conn = DriverManager.getConnection(URL, "stu", "a1234");

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			// 여러줄을 가져올때는 while문으로 가져옴
			// rs.next() -> 다음 데이터로 이동하면서 true반환, 더이상 데이터가 없으면 false반환
			while (rs.next()) {
				// db로 부터 데이터 가져오기
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String buseo = rs.getString("buseo");
				int pay = rs.getInt("pay");

				System.out.println(num + "\t" + name + "\t" + gender + "\t" + buseo + "\t" + pay);
			}

			System.out.println("오라클 드라이버 연결 성공!!");

		} catch (SQLException e) {

			System.out.println("오라클 드라이버 연결 실패....");

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void connectShop() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select idx,c.num,sangpum,color,cnt,guipday from shop s,cart2 c where s.num=c.num";

		try {
			conn = DriverManager.getConnection(URL, "stu", "a1234");
			System.out.println("연결 성공");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("\t   **회원님 장바구니 리스트**");

			System.out.println("주문번호\t상품번호\t상품명\t색상\t구입갯수\t구입날짜");
			System.out.println("----------------------------------------------");
			while (rs.next()) {
				int idx = rs.getInt("idx");
				int num = rs.getInt("num");
				String sangpum = rs.getString("sangpum");
				String color = rs.getString("color");
				int cnt = rs.getInt("cnt");
				String guipday = rs.getString("guipday");

				System.out.println(idx + "\t" + num + "\t" + sangpum + "\t" + color + "\t" + cnt + "\t" + guipday);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void sawonRead() {

		//부서별 인원수 평균급여
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select buseo, count(*) cnt, round(avg(pay)) pay from sawon group by buseo order by cnt";

		try {
			conn = DriverManager.getConnection(URL, "stu", "a1234");
			System.out.println("연결 성공");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("[부서별 평균 인원및 급여구하기]");

			System.out.println("부서\t인원수\t평균급여");
			System.out.println("------------------------");
			while (rs.next()) {
				String buseo = rs.getString("buseo");
				int cnt = rs.getInt("cnt");
				int pay = rs.getInt("pay");


				System.out.println( buseo+ "\t" + cnt + "\t" + pay);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	
	public static void main(String[] args) {
		ConnectTest ct = new ConnectTest();
		// ct.connectSawon();

		//ct.connectShop();
		
		ct.sawonRead();

	}

}
