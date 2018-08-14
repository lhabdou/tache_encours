/**
 * 
 */
package com.dotComIt.learnWith.vos;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author asoilihi
 *
 */
@XmlRootElement
public class UserVO {

	public UserVO() {

	}
	
	private int userID; 
	
	private String username; 
	
	private int roleID;
	
	private String password; 

	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}

	/**
	 * @return the roleID
	 */
	public int getRoleID() {
		return roleID;
	}

	/**
	 * @param roleID the roleID to set
	 */
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "{userID:" + userID + ", username:" + username + ", roleID:" + roleID + "}";
	} 
	
	
	
}
