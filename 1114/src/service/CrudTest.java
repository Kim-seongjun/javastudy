package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.JdbcUtil;

public class CrudTest {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;

	public void select() {
		// db접속
		con = JdbcUtil.getConnection();
		String sql = "SELECT * FROM PHONEMEMBER";
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("이름 : " + rs.getString("NAME") + ",전화번호 : " + rs.getString("PHONE") + ",전공: "
						+ rs.getString("MAJOR") + ",학번 : " + rs.getInt("YEAR") + ", 회사: " + rs.getString("COMPANY")+ ", 종류: " + rs.getString("KIND"));
			}
			System.out.println("--------------------");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 접속 종료
			// JdbcUtil.commit(con);
			// JdbcUtil.rollback(con);
			JdbcUtil.close(rs, stmt, con);
		}

	}// select End

	public void insert() {
		con = JdbcUtil.getConnection();
		try {
			String sql = "INSERT INTO MEMBER  VALUES(?,?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, "xxx");
			stmt.setString(2, "1111");
			stmt.setString(3, "통신");
			stmt.setInt(4,16 );
			stmt.setString(5, "ICIA");
			stmt.setString(6, "종류");

			int cnt = stmt.executeUpdate();
			if (cnt != 0)
				System.out.println("insert OK");
			else
				System.out.println("insert Fail");

		} catch (SQLException e) {
			System.out.println("insert 예외");
			e.printStackTrace();
		}
	}
}
