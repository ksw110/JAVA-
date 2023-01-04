package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("회원 아이디 : ");
		String id = sc.next();

		System.out.print("현재 비밀번호 : ");
		String pw1 = sc.next();
		System.out.print("변경할 비밀번호 : ");
		String pw = sc.next();
		
		
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			String sql = "update member set pw = ? where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pw);
			psmt.setString(2, id);
			psmt.setString(3, pw1);
			int cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("비밀번호 변경 성공");
			} else {
				System.out.println("비밀번호 변경 실패");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("동적로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		} finally {
			try {
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

}
