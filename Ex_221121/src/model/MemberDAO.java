package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	boolean result;
	
	public boolean login(String id, String pw) {
		connect();

		try {
			String sql = "select * from member3 where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery(); // 전송

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
	public int insert(MemberDTO dto) {
		connect();

		// 3. sql문 작성 및 전송
		try {
			String id = dto.getId();
			String pw = dto.getPw();
			String nick = dto.getNick();
			int age = dto.getAge();

			String sql = "insert into member3 values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			psmt.setInt(4, age);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("중복된 아이디입니다");
		}

		// 4. 통로닫기 종료
		close();
		return cnt;
	}
	
	
	
	
	
	
	
	
	
	private void connect() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결");
		}		
		
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
}
