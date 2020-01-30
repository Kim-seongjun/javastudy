package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//디비접속, 디비종료, TX(commit, rollback)
public class JdbcUtil {
	//Connetion con;
	static { // 초기화 1번만
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cne) {
			System.out.println("드라이버 로딩 실패");
			cne.printStackTrace();
		}
	}//static End
	
	public static Connection getConnection() {
		Connection con=null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ICIA", "1111");
			System.out.println("DB접속 성공");
			//con.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("DB접속 실패");
			e.printStackTrace();
		}
		return con;
	}//End getConnection

	public static void close(ResultSet rs, PreparedStatement stmt, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();

		} catch (SQLException e) {
			System.out.println("close 에러");
			e.printStackTrace();
		}
		System.out.println("close OK");
	}//close End
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}//class End









