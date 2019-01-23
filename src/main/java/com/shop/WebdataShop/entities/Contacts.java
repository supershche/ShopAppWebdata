package com.shop.WebdataShop.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contacts")
public class Contacts implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	private String contactType;
	
	private String contactDetail;
	
	private String note;
	
	private Boolean mainContactFlag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getContactDetail() {
		return contactDetail;
	}

	public void setContactDetail(String contactDetail) {
		this.contactDetail = contactDetail;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getMainContactFlag() {
		return mainContactFlag;
	}

	public void setMainContactFlag(Boolean mainContactFlag) {
		this.mainContactFlag = mainContactFlag;
	}
	
	
	
}
