package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import bean.InputException;
import bean.PhoneCompanyInfo;
import bean.PhoneInfo;
import bean.PhoneUnivInfo;
import common.JdbcUtil;

public class PhoneBookManager {
	final int MAX = 100;
	private PhoneInfo[] phoneList = new PhoneInfo[MAX];
	private int cnt = 0;
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;

	public void inputData() {
		int inputNum;
		System.out.print("입력할 그룹 선택:");
		System.out.println("1.일반친구 , 2.대학친구 , 3.회사동료");
		inputNum = PhoneBook.sc.nextInt();
		
		PhoneInfo info = null;
		switch (inputNum) {
		case INPUT_NUM.NORMAL:
			nInsert();
			break;
		case INPUT_NUM.UNIV:
			uInsert();
			break;
		case INPUT_NUM.COMPANY:
			cInsert();
			break;
		default:
		}

		phoneList[cnt++] = info;
		System.out.println("입력이 완료되었습니다.");
	}

	public void cInsert() {
		con = JdbcUtil.getConnection();
		System.out.print("이름:");
		String name = PhoneBook.sc.next();
		System.out.print("전화번호:");
		String phone = PhoneBook.sc.next();
		System.out.print("전공:");
		String major = PhoneBook.sc.next();
		System.out.print("회사:");
		String company = PhoneBook.sc.next();
		System.out.print("종류:");
		String kind = PhoneBook.sc.next();
		try {
			String sql = "INSERT INTO PHONEMEMBER VALUES(?,?,?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, phone);
			stmt.setString(3, major);
			stmt.setNull(4, Types.INTEGER);
			stmt.setString(5, company);
			stmt.setString(6, kind);

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

	public void uInsert() {
		con = JdbcUtil.getConnection();
		System.out.print("이름:");
		String name = PhoneBook.sc.next();
		System.out.print("전화번호:");
		String phone = PhoneBook.sc.next();
		System.out.print("전공:");
		String major = PhoneBook.sc.next();
		System.out.print("학번:");
		int year = PhoneBook.sc.nextInt();
		System.out.print("종류:");
		String kind = PhoneBook.sc.next();
		try {
			String sql = "INSERT INTO PHONEMEMBER VALUES(?,?,?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, phone);
			stmt.setString(3, major);
			stmt.setInt(4, year);
			stmt.setNull(5, Types.NVARCHAR);
			stmt.setString(6, kind);

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

	private void nInsert() {
		con = JdbcUtil.getConnection();
		System.out.print("이름:");
		String name = PhoneBook.sc.next();
		System.out.print("전화번호:");
		String phone = PhoneBook.sc.next();
		System.out.print("종류:");
		String kind = PhoneBook.sc.next();
		try {
			String sql = "INSERT INTO PHONEMEMBER VALUES(?,?,?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, phone);
			stmt.setNull(3, Types.NVARCHAR);
			stmt.setNull(4, Types.INTEGER);
			stmt.setNull(5, Types.NVARCHAR);
			
			stmt.setString(6, kind);

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

	public int searchIdx(String name) {
		for (int i = 0; i < cnt; i++) {
			if (name.equals(phoneList[i].getName())) {
				return i;
			}
		}
		return -1;
	}

	public void deleteData() {
		con=JdbcUtil.getConnection();
		System.out.print("삭제할 이름 입력:");
		String name = PhoneBook.sc.next();
		try {
			String sql = "DELETE PHONEMEMBER WHERE NAME = ?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			int count = stmt.executeUpdate();
			if (count > 0)
				System.out.println("삭제완료");

			else
				System.out.println("삭제성공");

		} catch (SQLException se) {
			System.out.println("삭제실패");
			se.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void searchData() {

		con = JdbcUtil.getConnection();
		System.out.print("검색할 이름 :");
		String name = PhoneBook.sc.next();

		String sql = "SELECT * FROM PHONEMEMBER WHERE NAME=?";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("이름 : " + rs.getString("NAME") + ",전화번호 : " + rs.getString("PHONE") + ",전공: "
						+ rs.getString("MAJOR") + ",학번 : " + rs.getInt("YEAR") + ", 회사: " + rs.getString("COMPANY")
						+ ", 종류: " + rs.getString("KIND"));
			}
			System.out.println("--------------------");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			JdbcUtil.close(rs, stmt, con);
		}

	}// select End

	public void showAllData() {
		con = JdbcUtil.getConnection();
		String sql = "SELECT * FROM PHONEMEMBER";
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("이름 : " + rs.getString("NAME") + ",전화번호 : " + rs.getString("PHONE") + ",전공: "
						+ rs.getString("MAJOR") + ",학번 : " + rs.getInt("YEAR") + ", 회사: " + rs.getString("COMPANY")
						+ ", 종류: " + rs.getString("KIND"));
			}
			System.out.println("--------------------");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			JdbcUtil.close(rs, stmt, con);
		}

	}

}
