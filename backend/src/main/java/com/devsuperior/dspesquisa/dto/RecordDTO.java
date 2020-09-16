package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dspesquisa.entities.Record;
import com.devsuperior.dspesquisa.entities.enums.Platform;

public class RecordDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Instant moment;
	private String name;
	private Integer age;
	private String gameTitle;
	private Platform gamePlatform;
	private String genreName;
	
	public RecordDTO() {
		
	}

	public RecordDTO(Record entity) {
		super();
		this.id = entity.getId();
		this.moment = entity.getMoment();
		this.name = entity.getName();
		this.age = entity.getAge();
		this.gameTitle = entity.getGame().getTitle();
		this.gamePlatform = entity.getGame().getPlatform();
		this.genreName = entity.getGame().getGenre().getName();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the moment
	 */
	public Instant getMoment() {
		return moment;
	}

	/**
	 * @param moment the moment to set
	 */
	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the gameTitle
	 */
	public String getGameTitle() {
		return gameTitle;
	}

	/**
	 * @param gameTitle the gameTitle to set
	 */
	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	/**
	 * @return the gamePlatform
	 */
	public Platform getGamePlatform() {
		return gamePlatform;
	}

	/**
	 * @param gamePlatform the gamePlatform to set
	 */
	public void setGamePlatform(Platform gamePlatform) {
		this.gamePlatform = gamePlatform;
	}

	/**
	 * @return the genreName
	 */
	public String getGenreName() {
		return genreName;
	}

	/**
	 * @param genreName the genreName to set
	 */
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

}
