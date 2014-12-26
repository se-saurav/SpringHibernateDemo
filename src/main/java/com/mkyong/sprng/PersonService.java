package com.mkyong.sprng;

/**
 * Created by saurav on 12/26/14.
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {
    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    @Autowired
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void addPerson(Person person) {
        getPersonDao().insert(person);
    }

    public List<Person> fetchAllPersons() {
        return getPersonDao().selectAll();
    }
}
