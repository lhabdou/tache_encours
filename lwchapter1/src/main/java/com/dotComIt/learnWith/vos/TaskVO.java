/**
 * 
 */
package com.dotComIt.learnWith.vos;

import java.time.LocalDate;

/**
 * @author Slhabdou
 *
 */
public class TaskVO {
	
	private int taskID; 
	
	private String taskCategory; 
	
	private int taskCategoryID; 
	
	private int userID; 
	
	private boolean completed; 
	
	private LocalDate dateCompleted; 
	
	private LocalDate dateCreated; 
	
	private LocalDate dateScheduled;  
	
	private String description;

	/**
	 * @return the taskID
	 */
	public int getTaskID() {
		return taskID;
	}

	/**
	 * @param taskID the taskID to set
	 */
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	/**
	 * @return the taskCategory
	 */
	public String getTaskCategory() {
		return taskCategory;
	}

	/**
	 * @param taskCategory the taskCategory to set
	 */
	public void setTaskCategory(String taskCategory) {
		this.taskCategory = taskCategory;
	}

	/**
	 * @return the taskCategoryID
	 */
	public int getTaskCategoryID() {
		return taskCategoryID;
	}

	/**
	 * @param taskCategoryID the taskCategoryID to set
	 */
	public void setTaskCategoryID(int taskCategoryID) {
		this.taskCategoryID = taskCategoryID;
	}

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
	 * @return the completed
	 */
	public boolean isCompleted() {
		return completed;
	}

	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}



	/**
	 * @return the dateCompleted
	 */
	public LocalDate getDateCompleted() {
		return dateCompleted;
	}

	/**
	 * @param dateCompleted the dateCompleted to set
	 */
	public void setDateCompleted(LocalDate dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	/**
	 * @return the dateCreated
	 */
	public LocalDate getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the dateScheduled
	 */
	public LocalDate getDateScheduled() {
		return dateScheduled;
	}

	/**
	 * @param dateScheduled the dateScheduled to set
	 */
	public void setDateScheduled(LocalDate dateScheduled) {
		this.dateScheduled = dateScheduled;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	} 
	


}
