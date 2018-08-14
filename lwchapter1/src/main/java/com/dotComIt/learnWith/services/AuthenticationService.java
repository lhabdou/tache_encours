/**
 * 
 */
package com.dotComIt.learnWith.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dotComIt.learnWith.vos.ResultObjectVO;
import com.dotComIt.learnWith.vos.UserVO;

/**
 * @author asoilihi
 *
 */
public class AuthenticationService {

	private Connection connection = null;

	/**
	 * @param connection
	 */
	public AuthenticationService(Connection connection) {

		this.connection = connection;

	}

	public ResultObjectVO authenticate(String username, String password) {
		String SQL;

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultObjectVO ro = new ResultObjectVO();

		try {
			SQL = "SELECT * FROM users where username = ? and password = ?";
			pstmt = connection.prepareStatement(SQL);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();

			if (!rs.isBeforeFirst()) {
				ro.setError(true);
			} else {
				rs.next();
				ro.setError(false);
				UserVO user = new UserVO();
				user.setRoleID(rs.getInt("roleID"));
				user.setUserID(rs.getInt("userID"));
				user.setUsername(rs.getString("username"));
				ro.setResultObject(user);
			}

		} catch (Exception e) {
			e.printStackTrace();
			ro.setError(true);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			if (connection != null)
				try {
					connection.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
		}

		return ro;

	}
}
