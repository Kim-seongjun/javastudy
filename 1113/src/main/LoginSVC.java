package main;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import been.Mamber;

public class LoginSVC {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs = null;
	ArrayList<Mamber> mamber=null;
	static {// 초기화 1번만
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cne) {
			System.out.println("드라이버 로딩 실패");
			cne.printStackTrace();
		}
	}// static End

	public void connect() {// db접속
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ICIA", "1111");
			System.out.println("DB접속 성공");
		} catch (SQLException e) {
			System.out.println("DB접속 실패");
			e.printStackTrace();
		}

	}

	public void close() {

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

	}

	public void select() {
		try {
			String sql = "SELECT * FROM MEMBER";
			stmt = con.prepareStatement(sql);
			
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("아이디 = " + rs.getString("id") + ", 비밀번호 = " + rs.getString("pw") + ", 이름 = "
						+ rs.getString("name") + ",나이 =" + rs.getString("age") + ", 이메일 = " + rs.getString("email"));

			}
			System.out.println("=========================");
		} catch (SQLException e) { 
			System.out.println("select 예외");
			e.printStackTrace();
		}

	}

	public void insert() {
		try {
			String sql = "INSERT INTO MEMBER " + "VALUES(?,?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1,"id");
			stmt.setString(2,"pw");
			stmt.setString(3,"name");
			stmt.setString(4,"age");
			stmt.setString(5,"email");
			
			int cnt = stmt.executeUpdate();
			if (cnt != 0)
				System.out.println("insert OK");
			else// cnt<=0
				System.out.println("insert Fail");
		} catch (SQLException e) {
			System.out.println("insert 예외");
			e.printStackTrace();
		}

	}

	public void update() {
		
		try {
			
			String sql = "UPDATE member SET pw =?  WHERE id = ?";
			stmt=con.prepareStatement(sql);
			stmt.setString(1, "id");
			stmt.setString(2, "pw");
			int cnt = stmt.executeUpdate(sql);
			if (cnt != 0) {
				System.out.println("update OK");
			} else {
				System.out.println("update Fail");
			}

		} catch (SQLException e) {
			System.out.println("update 예외");
			e.printStackTrace();
		}
	}

	public void delete() {

		try {
			
			String sql = "DELETE member WHERE id = ?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, "id");
			
			int cnt = stmt.executeUpdate(sql);
			if (cnt != 0) {
				System.out.println("delete OK");
			} else {
				System.out.println("delete fail");
			}

		} catch (SQLException e) {
			System.out.println("delete 예외");
			e.printStackTrace();

		}
	}
	public Mamber login(String id, String pw) {
		Mamber mb=null;
		try {
			connect();
			
			String sql="SELECT * FROM MEMBER WHERE ID=? AND PW=?";
			stmt=con.prepareStatement(sql);
			stmt.setNString(1,id);
			stmt.setNString(2,pw);
			rs=stmt.executeQuery();
			if(rs.next()) {
				mb=new Mamber();
				mb.setId(rs.getNString("ID"));
				mb.setPw(rs.getNString("PW"));
				mb.setName=(rs.getNString("NAME"));
				mb.setAge(rs.getInt("AGE"));
				mb.setEmail(rs.getNString("EMAIL"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return mb;
	
	}//login end

	public List<Mamber> getMamber() {
		List<Mamber> mList= new ArrayList <Mamber>();
		Mamber mb=null;
		String sql="SELECT * FROM MEMBER";
		try {
			stmt=con.prepareStatement(sql);
			rs=stmt.executeQuery();
			while(rs.next()) {
				mb=new Mamber();
				mb.setId(rs.getNString("ID"));
				mb.setPw(rs.getNString("PW"));
				mb.setName(rs.getNString("NAME"));
				mb.setAge(rs.getInt("AGE"));
				mb.setEmail(rs.getNString("EMAIL"));
				mList.add(mb);
				
			}
			return mList;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	public void printMetaData() {
		ResultSetMetaData rsmd;
		try {

			String sql = "SELECT * FROM member";
			stmt = con.prepareStatement(sql);
			rs= stmt.executeQuery();
			rsmd = rs.getMetaData();
			
			while(rs.next()) {
				for(int i=1;i<=rsmd.getColumnCount();i++) {
					System.out.print(rsmd.getColumnName(i)+":");
					System.out.print(rs.getObject(rsmd.getColumnClassName(i))+", ");
					
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}// class end

