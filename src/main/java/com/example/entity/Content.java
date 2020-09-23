package com.example.entity;
// Generated Sep 23, 2020, 10:36:20 AM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Content generated by hbm2java
 */
@Entity
@Table(name = "content", schema = "public")
public class Content implements java.io.Serializable {

	private int id;
	private String header;
	private String content;
	private Date createdDate;
	private String createdUser;

	public Content() {
	}

	public Content(int id, String header, String content, Date createdDate, String createdUser) {
		this.id = id;
		this.header = header;
		this.content = content;
		this.createdDate = createdDate;
		this.createdUser = createdUser;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "header", nullable = false, length = 50)
	public String getHeader() {
		return this.header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	@Column(name = "content", nullable = false, length = 14000)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false, length = 35)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "created_user", nullable = false, length = 50)
	public String getCreatedUser() {
		return this.createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

}
