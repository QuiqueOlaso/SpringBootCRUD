package com.quiqueolaso.persistence.pojos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Player.
 */
@Entity
@Table(name = "TODO")
public class Player implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new player.
	 */
	public Player() {
		super();
	}

	/**
	 * Instantiates a new player.
	 *
	 * @param id       the id
	 * @param taskName the task name
	 * @param taskDesc the task desc
	 * @param status   the status
	 */
	public Player(Long id, String taskName, String taskDesc, String status) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskDesc = taskDesc;
		this.status = status;
	}

	/** The id. */
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The task name. */
	@Column(name = "TASK_NAME")
	private String taskName;

	/** The task desc. */
	@Column(name = "TASK_DESC")
	private String taskDesc;

	/** The status. */
	@Column(name = "STATUS")
	private String status;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the task name.
	 *
	 * @return the task name
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * Sets the task name.
	 *
	 * @param taskName the new task name
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * Gets the task desc.
	 *
	 * @return the task desc
	 */
	public String getTaskDesc() {
		return taskDesc;
	}

	/**
	 * Sets the task desc.
	 *
	 * @param taskDesc the new task desc
	 */
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
