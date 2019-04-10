package com.sda;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "Osoba")
@SecondaryTable(name = "Adres1",pkJoinColumns = @PrimaryKeyJoinColumn(name = "id_osoba"))
public class Person {
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Person(String name, String surname, int age, double salary, String location, String strit, String zipCode) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.location = location;
        this.strit = strit;
        this.zipCode = zipCode;
    }


    @Id
    @GeneratedValue
    private int id;

    @Column(name = "Imie", nullable = false, length = 50)
    private String name;

    @Column(name = "Nazwisko", columnDefinition = "varchar(100) not null")
    private String surname;

    @Column(name = "Wiek")
    private int age;

    @Column(name = "Zarobki")
    private double salary;

    @Column(table = "Adres1", name="miasto")
    private String location;

    @Column(table = "Adres1", name="ulica")
    private String strit;

    @Column(table = "Adres1", name="kod_pocztowy")
    private String zipCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStrit() {
        return strit;
    }

    public void setStrit(String strit) {
        this.strit = strit;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    //    @Transient
//    private String description;
//
//    private short poleShort;
//    private long poleLong;
//    private BigDecimal poleBigDecimal;
//    private BigInteger poleBigInteger;
//    private boolean poleBoolean;
//    private int[] poleIntArray;
//    private Integer[] poleIntegerAray;
//
//    private java.sql.Time poleTime;
//    private java.sql.Date poleDate;
//    private java.sql.Timestamp poleTimestamp;
//
//    @Temporal(TemporalType.TIME)
//    private Date poleUtlDate;
//    @Temporal(TemporalType.DATE)
//    private Calendar poleCalendar;
}
