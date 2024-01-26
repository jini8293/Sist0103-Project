package day0126;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracleDb.DbConnect;

public class SawonGroup {

	DbConnect db = new DbConnect();

	public void connectSawonGroup() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select gender, count(buseo) count, to_char(round(avg(pay)),'L999,999,999') avg_pay, to_char(max(pay),'L999,999,999') max_pay, to_char(min(pay),'L999,999,999') min_pay from sawon group by gender";

		conn = db.getOracle();
		System.out.println("오라클 연결 성공.");
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			System.out.println("\t**회사 남녀별 급여통계**");
			System.out.println("성별\t인원수\t평균급여\t최고급여\t최저급여");
			System.out.println("--------------------------------------");
			while (rs.next()) {
				String gender = rs.getString("gender");
				int count = rs.getInt("count");
				String avg_pay = rs.getString("avg_pay");
				String max_pay = rs.getString("max_pay");
				String min_pay = rs.getString("min_pay");

				System.out.println(gender + "\t" + count + "\t" + avg_pay + "\t" + max_pay + "\t" + min_pay);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}
	}
	
	public void personGroup() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select job, count(*) count, to_char(avg(ahe)) age from person group by job";
		conn = db.getOracle();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("   **직업별 평균나이**");
			System.out.println("직업\t인원수\t평균나이");
			System.out.println("-----------------------");
			
			while(rs.next()) {
				String job = rs.getString("job");
				int count = rs.getInt("count");
				String age = rs.getString("age");
				
				System.out.println(job+"\t"+count+"\t"+age);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
	}

	public static void main(String[] args) {
		SawonGroup sg = new SawonGroup();
		//sg.connectSawonGroup();
		sg.personGroup();

	}

}
