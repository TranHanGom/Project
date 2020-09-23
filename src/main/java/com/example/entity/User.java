package com.example.entity;
// Generated Sep 23, 2020, 1:40:32 PM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", schema = "public", uniqueConstraints = { @UniqueConstraint(columnNames = "email"),
		@UniqueConstraint(columnNames = "username") })
public class User implements java.io.Serializable {

	private int userId;
	private Role role;
	private String username;
	private String password;
	private String lastName;
	private String firstName;
	private int age;
	private Date dateOfBirth;
	private String email;
	private Date dayOfRegistration;

	public User() {
	}

	public User(int userId, Role role, String username, String password, String lastName, String firstName, int age,
			Date dateOfBirth, String email) {
		this.userId = userId;
		this.role = role;
		this.username = username;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}

	public User(int userId, Role role, String username, String password, String lastName, String firstName, int age,
			Date dateOfBirth, String email, Date dayOfRegistration) {
		this.userId = userId;
		this.role = role;
		this.username = username;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.dayOfRegistration = dayOfRegistration;
	}

	@Id

	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "username", unique = true, nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "last_name", nullable = false, length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "first_name", nullable = false, length = 50)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "age", nullable = false)
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_birth", nullable = false, length = 13)
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column(name = "email", unique = true, nullable = false)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "day_of_registration", length = 29)
	public Date getDayOfRegistration() {
		return this.dayOfRegistration;
	}

	public void setDayOfRegistration(Date dayOfRegistration) {
		this.dayOfRegistration = dayOfRegistration;
	}

}
