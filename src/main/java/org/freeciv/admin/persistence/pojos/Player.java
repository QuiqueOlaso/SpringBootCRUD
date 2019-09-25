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
@Table(name = "players")
public class Player implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private PlayerId id;

	/** The name. */
	@Column(name = "name")
	private String name;

	/** The hostport. */
	@Column(name = "hostport")
	private String hostport;

	/** The user. */
	@Column(name = "user")
	private String user;

	/** The nation. */
	@Column(name = "nation")
	private String nation;

	/** The type. */
	@Column(name = "type")
	private String type;

	/** The host. */
	@Column(name = "host")
	private String host;

	/** The flag. */
	@Column(name = "flag")
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
	 * Instantiates a new player.
	 *
	 * @param name     the name
	 * @param hostport the hostport
	 * @param user     the user
	 * @param nation   the nation
	 * @param type     the type
	 * @param host     the host
	 * @param flag     the flag
	 */
	public Player(String name, String hostport, String user, String nation, String type, String host, String flag) {
		super();
		this.name = name;
		this.hostport = hostport;
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

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the hostport.
	 *
	 * @return the hostport
	 */
	public String getHostport() {
		return hostport;
	}

	/**
	 * Sets the hostport.
	 *
	 * @param hostport the new hostport
	 */
	public void setHostport(String hostport) {
		this.hostport = hostport;
	}

}
