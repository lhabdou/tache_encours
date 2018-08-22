/**
 * 
 */
package com.dotComIt.learnWith.vos;

import java.time.LocalDate;

/**
 * @author Slhabdou
 *
 */
public class TaskFilterVO {
	
	private int taskCategoryID; 
	
	private Boolean completed; 
	
	private LocalDate endDate; 
	
	private LocalDate startDate; 
	
	private LocalDate scheduledEndDate; 
	
	private LocalDate scheduledStartDate;

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
	 * @return the completed
	 */
	public Boolean getCompleted() {
		return completed;
	}

	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	/**
	 * @return the endDate
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the scheduledEndDate
	 */
	public LocalDate getScheduledEndDate() {
		return scheduledEndDate;
	}

	/**
	 * @param scheduledEndDate the scheduledEndDate to set
	 */
	public void setScheduledEndDate(LocalDate scheduledEndDate) {
		this.scheduledEndDate = scheduledEndDate;
	}

	/**
	 * @return the scheduledStartDate
	 */
	public LocalDate getScheduledStartDate() {
		return scheduledStartDate;
	}

	/**
	 * @param scheduledStartDate the scheduledStartDate to set
	 */
	public void setScheduledStartDate(LocalDate scheduledStartDate) {
		this.scheduledStartDate = scheduledStartDate;
	} 


}
