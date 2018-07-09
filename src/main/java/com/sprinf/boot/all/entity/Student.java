package com.sprinf.boot.all.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "Student")
@EntityListeners(AuditingEntityListener.class)
public class Student {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "qualification")
	private String qualification;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
