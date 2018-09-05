package com.example.three;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.three.repo.beans.Person;

@Transactional
@Repository
public class PersonDao {

	@Autowired
	EntityManager manager;

	public int addPerson(Person p) {
		manager.persist(p);
		return p.getId();
	}

	public void removePerson(Person p) {
		manager.remove(p);
	}
	
	public void getFirst() {
		System.out.println(manager.find(Person.class, 1).getName());
	}
}
