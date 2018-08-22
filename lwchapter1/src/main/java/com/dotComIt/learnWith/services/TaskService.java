/**
 * 
 */
package com.dotComIt.learnWith.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dotComIt.learnWith.vos.ResultObjectVO;
import com.dotComIt.learnWith.vos.TaskFilterVO;
import com.dotComIt.learnWith.vos.TaskVO;

/**
 * @author Slhabdou
 *
 */
public class TaskService {

	Connection connection = null;

	public TaskService(Connection connection) {
		this.connection = connection;
	}

	public ResultObjectVO getFilteredTasks(TaskFilterVO filter) {

		String SQL;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultObjectVO ro = new ResultObjectVO();
		try {
			SQL = "select tasks.*, taskCategories.taskCategory" + "from tasks join taskCategories on "
					+ "(tasks.taskCategoryID = taskCategories.taskCategoryID)";
			SQL += " where 0=0 ";

			if (filter.getCompleted() != null) {
				SQL += "and completed = ?";

			}

			if (filter.getStartDate() != null) {
				SQL += "and dateCreated>=?";
				SQL += "order by dateCreated ";
			}

			pstmt = connection.prepareStatement(SQL);

			int parameterCounter = 1;

			if (filter.getCompleted() != null) {
				pstmt.setBoolean(parameterCounter, filter.getCompleted());
				parameterCounter++;
			}

			if (filter.getStartDate() != null) {
				pstmt.setDate(parameterCounter, java.sql.Date.valueOf(filter.getStartDate()));
				parameterCounter++;
			}
			rs = pstmt.executeQuery();
			ro.setError(false);
			List<TaskVO> tasks = new ArrayList<TaskVO>();
			while (rs.next()) {
				TaskVO task = new TaskVO();
				task.setTaskID(rs.getInt("taskID"));
				task.setTaskCategoryID(rs.getInt("taskCategoryID"));
				task.setTaskCategory(rs.getString("taskCategory"));
				task.setUserID(rs.getInt("userID"));
				task.setDescription(rs.getString("description"));

				if (rs.getBoolean("completed")) {
					task.setCompleted(true);
				} else {
					task.setCompleted(false);
				}
				task.setDateCreated(rs.getDate("dateCreated").toLocalDate());
				if (rs.getDate("dateCompleted") != null) {
					task.setDateCompleted(rs.getDate("dateCompleted").toLocalDate());
				}
				if (rs.getDate("dateScheduled") != null) {
					task.setDateScheduled(rs.getDate("dateScheduled").toLocalDate());
				}
				tasks.add(task);

			}
			ro.setResultObject(tasks);
		} catch (

		Exception e) {
			e.printStackTrace();
			ro.setError(true);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (Exception e) {
				}
			if (connection != null)
				try {
					connection.close();
				} catch (Exception e) {
				}
		}
		
		return ro; 

	}

}
