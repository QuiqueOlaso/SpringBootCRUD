package org.freeciv.admin.persistence.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Player.
 */
@Entity
@Table(name = "players", catalog = "freeciv_web")
public class Player implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The playerId. */
	@EmbeddedId
	private PlayerId playerId;

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
	 * @param playerId the playerId
	 */
	public Player(PlayerId playerId) {
		this.playerId = playerId;
	}

	/**
	 * Instantiates a new player.
	 *
	 * @param playerId the playerId
	 * @param user     the user
	 * @param nation   the nation
	 * @param type     the type
	 * @param host     the host
	 * @param flag     the flag
	 */
	public Player(PlayerId playerId, String user, String nation, String type, String host, String flag) {
		super();
		this.playerId = playerId;
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
		this.playerId.setName(name);
		this.playerId.setHostport(hostport);
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
	public PlayerId getPlayerId() {
		return this.playerId;
	}

	/**
	 * Sets the playerId.
	 *
	 * @param playerId the new playerId
	 */
	public void setPlayerId(PlayerId playerId) {
		this.playerId = playerId;
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
		return this.playerId.getName();
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.playerId.setName(name);
	}

	/**
	 * Gets the hostport.
	 *
	 * @return the hostport
	 */
	public String getHostport() {
		return this.playerId.getHostport();
	}

	/**
	 * Sets the hostport.
	 *
	 * @param hostport the new hostport
	 */
	public void setHostport(String hostport) {
		this.playerId.setHostport(hostport);
	}

}
