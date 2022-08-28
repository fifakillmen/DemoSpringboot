package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakePersonDataAccessService")
public class FakePersonDataAccessService implements PersonDao {
    private static List<Person> db = new ArrayList<>();

    @Override
    public int insertPersonID(UUID id, Person person) {
        db.add(new Person(id, person.getName()));
        return 1;
    }
}
