package org.freeciv.admin.persistence.pojos;

import java.util.Date;

/**
 * Servers generated by hbm2java.
 */
public class Server implements java.io.Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private ServerId id;

	/** The version. */
	private String version;

	/** The patches. */
	private String patches;

	/** The capability. */
	private String capability;

	/** The state. */
	private String state;

	/** The ruleset. */
	private String ruleset;

	/** The topic. */
	private String topic;

	/** The type. */
	private String type;

	/** The humans. */
	private String humans;

	/** The message. */
	private String message;

	/** The stamp. */
	private Date stamp;

	/** The available. */
	private Integer available;

	/** The serverid. */
	private String serverid;

	/**
	 * Instantiates a new servers.
	 */
	public Server() {
		/* nothing to do. */
	}

	/**
	 * Instantiates a new servers.
	 *
	 * @param id    the id
	 * @param stamp the stamp
	 */
	public Server(ServerId id, Date stamp) {
		this.id = id;
		this.stamp = stamp;
	}

	/**
	 * Instantiates a new servers.
	 *
	 * @param id         the id
	 * @param patches    the patches
	 * @param capability the capability
	 * @param state      the state
	 * @param ruleset    the ruleset
	 * @param topic      the topic
	 * @param type       the type
	 * @param humans     the humans
	 * @param message    the message
	 * @param stamp      the stamp
	 * @param available  the available
	 * @param serverid   the serverid
	 */
	public Server(ServerId id, String patches, String capability, String state, String ruleset, String topic,
			String type, String humans, String message, Date stamp, Integer available, String serverid) {
		this.id = id;
		this.patches = patches;
		this.capability = capability;
		this.state = state;
		this.ruleset = ruleset;
		this.topic = topic;
		this.type = type;
		this.humans = humans;
		this.message = message;
		this.stamp = stamp;
		this.available = available;
		this.serverid = serverid;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public ServerId getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(ServerId id) {
		this.id = id;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public String getVersion() {
		return this.version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Gets the patches.
	 *
	 * @return the patches
	 */
	public String getPatches() {
		return this.patches;
	}

	/**
	 * Sets the patches.
	 *
	 * @param patches the new patches
	 */
	public void setPatches(String patches) {
		this.patches = patches;
	}

	/**
	 * Gets the capability.
	 *
	 * @return the capability
	 */
	public String getCapability() {
		return this.capability;
	}

	/**
	 * Sets the capability.
	 *
	 * @param capability the new capability
	 */
	public void setCapability(String capability) {
		this.capability = capability;
	}

	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the ruleset.
	 *
	 * @return the ruleset
	 */
	public String getRuleset() {
		return this.ruleset;
	}

	/**
	 * Sets the ruleset.
	 *
	 * @param ruleset the new ruleset
	 */
	public void setRuleset(String ruleset) {
		this.ruleset = ruleset;
	}

	/**
	 * Gets the topic.
	 *
	 * @return the topic
	 */
	public String getTopic() {
		return this.topic;
	}

	/**
	 * Sets the topic.
	 *
	 * @param topic the new topic
	 */
	public void setTopic(String topic) {
		this.topic = topic;
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
	 * Gets the humans.
	 *
	 * @return the humans
	 */
	public String getHumans() {
		return this.humans;
	}

	/**
	 * Sets the humans.
	 *
	 * @param humans the new humans
	 */
	public void setHumans(String humans) {
		this.humans = humans;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the stamp.
	 *
	 * @return the stamp
	 */
	public Date getStamp() {
		return this.stamp;
	}

	/**
	 * Sets the stamp.
	 *
	 * @param stamp the new stamp
	 */
	public void setStamp(Date stamp) {
		this.stamp = stamp;
	}

	/**
	 * Gets the available.
	 *
	 * @return the available
	 */
	public Integer getAvailable() {
		return this.available;
	}

	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	public void setAvailable(Integer available) {
		this.available = available;
	}

	/**
	 * Gets the serverid.
	 *
	 * @return the serverid
	 */
	public String getServerid() {
		return this.serverid;
	}

	/**
	 * Sets the serverid.
	 *
	 * @param serverid the new serverid
	 */
	public void setServerid(String serverid) {
		this.serverid = serverid;
	}

}
