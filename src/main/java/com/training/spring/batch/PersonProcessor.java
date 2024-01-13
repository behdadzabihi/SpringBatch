package com.training.spring.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;


@Component
public class PersonProcessor implements ItemProcessor<Person, Person> {

    public Person process(Person item) {
        item.setId(null);
        return item;
    }
}
