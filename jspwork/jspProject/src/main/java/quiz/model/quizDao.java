package quiz.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import oracle.DB.DbConnect;

public class quizDao {

	DbConnect db = new DbConnect();

	public void insertQuiz(quizDto dto) {

		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;

		String sql = "insert into quizinfo values(seq_2.nextval, ?, ?, ?, ? ,sysdate)";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAge());
			pstmt.setString(3, dto.getHp());
			pstmt.setString(4, dto.getDriver());

			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbclose(pstmt, conn);
		}

	}

	public Vector<quizDto> listQuiz() {
		Vector<quizDto> quiz = new Vector<quizDto>();

		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from quizinfo order by no";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				quizDto dto = new quizDto();

				dto.setNo(rs.getString("no"));
				dto.setName(rs.getString("name"));
				dto.setHp(rs.getString("hp"));
				dto.setAge(rs.getString("age"));
				dto.setDriver(rs.getString("driver"));
				dto.setWriteday(rs.getTimestamp("writeday"));

				quiz.add(dto);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbclose(rs, pstmt, conn);
		}

		return quiz;

	}

	public void deleteQuiz() {

	}

	public void updateQuiz() {

	}

	public void getData() {

	}

}
