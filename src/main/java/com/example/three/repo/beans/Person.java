package com.example.three.repo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Persons")
public class Person {

	private int id;
	private String name;
	private int age;

	public Person() {

	}

	@Id
	@GeneratedValue
	@Column(name="id",nullable=false,columnDefinition="integer")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="name",nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="age",nullable=true)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
