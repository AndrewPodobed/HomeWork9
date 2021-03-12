package com.company;

public class Person {
    public String name;
    public String lastName;
    public Adress adress;

    public Person(String name, String lastName, Adress adress) throws NullFieldException{
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        if(name == null || lastName == null || adress == null){
            throw new NullFieldException("Введено недопустимое значение null");
        }

    }

    public String getName(){
       return name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setName(String name) throws NullFieldException{
        this.name = name;
        if(name == null){
            throw new NullFieldException("Введено недопустимое значение null");
        }

    }

    public void setLastName(String lastName) throws NullFieldException{
        this.lastName = lastName;
        if(lastName == null){
            throw new NullFieldException("Введено недопустимое значение null");
        }
    }

    public void setAdress(Adress adress) throws NullFieldException {
        this.adress = adress;
        if(adress == null){
            throw new NullFieldException("Введено недопустимое значение null");
        }
    }

    public Adress getAdress(){
       return adress;
    }


        @Override
    public String toString(){
        return "Имя: " + name + " Фамилия: " + lastName + " " + getAdress();
    }


}
