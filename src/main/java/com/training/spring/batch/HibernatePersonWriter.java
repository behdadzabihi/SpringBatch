package com.training.spring.batch;

import org.hibernate.SessionFactory;
import org.springframework.batch.item.database.HibernateItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 *         Date: 5/16/19
 *         Time: 1:12 AM
 */
@Transactional
@Component
public class HibernatePersonWriter extends HibernateItemWriter<Person> {

    @Override
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
