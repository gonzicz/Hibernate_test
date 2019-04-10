package com.sda.db;

import com.sda.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Person person = new Person("Rafal", "Lewandowski", 36, 10000, "Torun", "Warszawska","87-100");

        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();
        Person findPerson = entityManager.find(Person.class, 1);// 1 nr wiersza
        entityManager.getTransaction().commit();

        System.out.println(findPerson);


        entityManager.close();
        entityManagerFactory.close();
    }
}
