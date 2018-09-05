package com.example.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.three.PersonDao;
import com.example.three.repo.beans.Person;

@Component
public class MyRun implements CommandLineRunner {

	@Autowired
	PersonDao personDao;

	@Override
	public void run(String... args) throws Exception {
		Person p = new Person();
		p.setName("Ron");
		System.out.println("PERSON 1 " + personDao.addPerson(p));
		personDao.getFirst();
	}

}
