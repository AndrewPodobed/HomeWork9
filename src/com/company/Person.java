package com.company;

public class Person {
    public String name;
    public String lastName;
    public Adress adress;

    public Person(String name, String lastName, Adress adress) throws NullFieldException{
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;

    }

    public String getName() throws NullFieldException{
        if(name == null){
            throw new NullFieldException("Введено недопустимое значение null");
        }
        return name;
    }

    public String getLastName() throws NullFieldException {
        if(lastName == null){
            throw new NullFieldException("Введено недопустимое значение null");
        }
        return lastName;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAdress(Adress adress){
        this.adress = adress;
    }

    public Adress getAdress() throws NullFieldException {
        if(adress == null){
            throw new NullFieldException("Введено недопустимое значение null");
        }
        return adress;
    }


        @Override
    public String toString(){
        return "Имя: " + name + " Фамилия: " + lastName + " " + getAdress();
    }


}
