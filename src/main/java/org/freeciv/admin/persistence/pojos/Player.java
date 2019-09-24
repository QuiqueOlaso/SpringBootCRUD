package org.freeciv.admin.persistence.pojos;

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

	/** The id. */
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private PlayerId id;

	/** The user. */
	@Column(name = "TASK_NAME")
	private String user;

	/** The nation. */
	@Column(name = "TASK_NAME")
	private String nation;

	/** The type. */
	@Column(name = "TASK_NAME")
	private String type;

	/** The host. */
	@Column(name = "TASK_NAME")
	private String host;

	/** The flag. */
	@Column(name = "TASK_NAME")
	private String flag;

	/**
	 * Instantiates a new player.
	 */
	public Player() {
		super();
	}

	/**
	 * Instantiates a new players.
	 *
	 * @param id the id
	 */
	public Player(PlayerId id) {
		this.id = id;
	}

	/**
	 * Instantiates a new player.
	 *
	 * @param id     the id
	 * @param user   the user
	 * @param nation the nation
	 * @param type   the type
	 * @param host   the host
	 * @param flag   the flag
	 */
	public Player(PlayerId id, String user, String nation, String type, String host, String flag) {
		super();
		this.id = id;
		this.user = user;
		this.nation = nation;
		this.type = type;
		this.host = host;
		this.flag = flag;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public PlayerId getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(PlayerId id) {
		this.id = id;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public String getUser() {
		return this.user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user the new user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * Gets the nation.
	 *
	 * @return the nation
	 */
	public String getNation() {
		return this.nation;
	}

	/**
	 * Sets the nation.
	 *
	 * @param nation the new nation
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the host.
	 *
	 * @return the host
	 */
	public String getHost() {
		return this.host;
	}

	/**
	 * Sets the host.
	 *
	 * @param host the new host
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * Gets the flag.
	 *
	 * @return the flag
	 */
	public String getFlag() {
		return this.flag;
	}

	/**
	 * Sets the flag.
	 *
	 * @param flag the new flag
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

}
