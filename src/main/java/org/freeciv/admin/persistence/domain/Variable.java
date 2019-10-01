package org.freeciv.admin.persistence.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Variables generated by hbm2java.
 */
@Entity
@Table(name = "variable", catalog = "freeciv_web")
public class Variable implements java.io.Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@EmbeddedId
	private VariableId id;

	/** The value. */
	@Column(name = "value")
	private String value;

	/**
	 * Instantiates a new variables.
	 */
	public Variable() {
		/* nothing to do. */
	}

	/**
	 * Instantiates a new variables.
	 *
	 * @param id the id
	 */
	public Variable(VariableId id) {
		this.id = id;
	}

	/**
	 * Instantiates a new variables.
	 *
	 * @param id    the id
	 * @param value the value
	 */
	public Variable(VariableId id, String value) {
		this.id = id;
		this.value = value;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public VariableId getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(VariableId id) {
		this.id = id;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

}