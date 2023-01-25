package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	Connection conn = null;
	int cnt = 0;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	boolean result;

	public boolean login(String id, String pw) {
		connect();

		try {
			String sql = "select * from mc_member where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next() == true) {
				result = true;
				
			} else {
				result = false;
				
				
			}

		} catch (SQLException e) {
			
		}
		close();
		return result;

	}

	public int insert(DTO dto) {
		connect();

		try {
			String id = dto.getId();
			String pw = dto.getPw();
			String nick = dto.getNick();

			String sql = "insert into mc_member values(?,?,?)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);

			cnt = psmt.executeUpdate();
			if(cnt > 0 ) {
				System.out.println("회원가입 성공");
			}

		} catch (SQLException e) {
				System.out.println("회원가입 실패");
		}
		close();
		return cnt;

	}

	public int update(DTO dto) {

		connect();

		try {
			String id = dto.getId();
			String pw1 = dto.getPw();
			String pw = dto.getPw();

			String sql = "update mc_member set pw = ? where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, pw);
			psmt.setString(2, id);
			psmt.setString(3, pw1);

			cnt = psmt.executeUpdate();
			if(cnt > 0) {
				System.out.println("회원정보 수정완료");
			}else {
				System.out.println("회원정보 수정실패");
			}

		} catch (SQLException e) {
			System.out.println("실패");
		}

		close();
		return cnt;
	}
	public int delete(DTO dto) {
		connect();
		try {
			String id = dto.getId();
			String pw = dto.getPw();
			String nick = dto.getNick();
			String sql = "delete mc_mamber where id = ? and pw = ?, nick = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			cnt = psmt.executeUpdate();
			if(cnt > 0) {
				System.out.println("회원 탈퇴 완료");
			}else {
				System.out.println("회원 탈퇴 실패");
			}
		} catch (SQLException e) {

		}

		close();
		return cnt;
	}
	
	
	
	
	
	

	private void close() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void connect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_a_1123_1";
			String db_pw = "smhrd1";

			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩");
		} catch (SQLException e) {
			System.out.println("DB연결");
		}

	}

}
