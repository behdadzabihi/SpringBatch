package com.training.spring.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;



public class PersonFieldSetMapper implements FieldSetMapper<Person> {

    public Person mapFieldSet(FieldSet fieldSet) throws BindException {
        Person person = new Person();
        person.setId(fieldSet.readLong(0));
        person.setFirstName(fieldSet.readRawString(1));
        person.setLastName(fieldSet.readRawString(2));
        return person;
    }
}

