package com.example.a1_recyclerviewcustombasicadapter.modul;

public class Member {

    private String name;
    private String surname;

    public Member(String newName, String newSurname){
        this.name = newName;
        this.surname = newSurname;
    }

    public String getFristName() {
        return name;
    }
    public String getLastName() {
        return surname;
    }

//    @Override
//    public String toString() {
//        return "Member{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                '}';
//    }
}
