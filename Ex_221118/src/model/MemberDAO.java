package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO : Data Access Object
// membership 테이블과 데이터를 주고받는 기능들을 모아둔 클래스
public class MemberDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	boolean result;
	public boolean login(String id, String pw) {
		connect();
		
		try {
			String sql = "select * from membership where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery(); // 전송
			
			if(rs.next() == true) {
				result = true;
			}else {
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

			String sql = "insert into membership values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			psmt.setInt(4, age);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 4. 통로닫기 종료
		close();
		return cnt;
	}
	public int update(MemberDTO dto) {
		connect();
		
		try {
			String id = dto.getId();
			String pw = dto.getPw();
			
			String sql = "update membership set pw = ? where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pw);
			psmt.setString(2, id);
			
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			
		}
		
		
		close();
		return cnt;
	}
	public void select(MemberDTO dto) {
		connect();
		close();
	}
	
	public int delete(MemberDTO dto) {
		connect();
		try {
			String id = dto.getId();
			String pw = dto.getPw();
			String sql = "delete from membership where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			cnt = psmt.executeUpdate();
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
			// 1. JDBC 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결");
		}
	

		
	}



}
