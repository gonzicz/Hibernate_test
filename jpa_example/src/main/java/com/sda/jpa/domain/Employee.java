package com.sda.jpa.domain;

import javax.persistence.*;

@Entity                      // sprawia że tworz nam się tabelka w bazie danych
@Table(name = "pracownicy")   // nazwa tabeli
public class Employee {
    @Id
    @GeneratedValue         // generator Id
    private long id;    // <- klucz główny

    @Column(name = "imie", columnDefinition = "varchar(45) not null")
    private String firstName;

    @Column(name = "nazwisko", nullable = false, length = 35)
    private String lastName;

    @Column(name = "pensja")
    private double salary;

    //private BigDecimal premia;
    @Column(precision = 7, scale = 2)
    private float premia2;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getPremia2() {
        return premia2;
    }

    public void setPremia2(float premia2) {
        this.premia2 = premia2;
    }
}
