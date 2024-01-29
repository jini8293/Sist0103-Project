package homework_01;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuizJdbcFoodOrder {
	
	static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";

	public void foodOrder(){
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select order_num ,f.fno , order_name, fname , to_char(price,'L999,999') price , fshopname , shoploc  , order_addr from foodshop f, jumun j where f.fno=j.fno order by order_name";

		try {
			conn = DriverManager.getConnection(URL,"stu","a1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("주문번호\t음식번호\t주문자\t음식명\t         가격\t        상호명\t상점위치\t        주문자위치");
			System.out.println("------------------------------------------------------------------------------------------");
			while(rs.next()) {
				int num = rs.getInt("order_num");
				int fno = rs.getInt("fno");
				String name = rs.getString("order_name");
				String fname = rs.getString("fname");
				String price = rs.getString("price");
				String fshopname = rs.getString("fshopname");
				String shoploc = rs.getString("shoploc");
				String addr = rs.getString("order_addr");
				
				System.out.println(num + "\t" + fno + "\t" + name + "\t" + fname + "\t" + price + "\t" + fshopname + "\t" + shoploc + "\t" + addr);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
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
		QuizJdbcFoodOrder qjfo = new QuizJdbcFoodOrder();
		qjfo.foodOrder();

	}

}
