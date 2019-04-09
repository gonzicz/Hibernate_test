package com.sda.jpa.app;

import com.sda.jpa.domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee employee = new Employee();
        employee.setFirstName("Rafal");
        employee.setLastName("Nowak");
        employee.setSalary(5000);
        //employee.setId(1L);
        employee.setPremia2(2356.23f);

        /**
         * dodanie obiekru do bazy w tranzakcji
         */
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();

//        Employee employee2 = new Employee();
//        employee2.setFirstName("Jan");
//        employee2.setLastName("Kowalski");
//        employee2.setSalary(3500);
//       // employee2.setId(2L);
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(employee2);
//        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}
