package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, EmptySourceFileException {

        Person person1 = new Person("Vasia", "Фролов", new Adress("Москва", "Москворечная", 16));
        Person person2 = new Person("Максим", "Потехин", new Adress("Санкт-Петербург", "Ленина", 45));
        Person person3 = new Person("Илья", "Швед", new Adress("Минск", "Победы", 52));

        List<Person> personlist = new ArrayList<>();
        personlist.add(person1);
        personlist.add(person2);
        personlist.add(person3);

        PersonIOUtil.writePerson("Person.txt", personlist);
        System.out.println(PersonIOUtil.readPerson("Person.txt") + "\n");


    }
}

















