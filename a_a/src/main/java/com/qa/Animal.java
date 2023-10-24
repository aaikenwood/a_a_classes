package com.qa;

public class Animal {

    private String name;
    private String favouriteFood;
    private String type;
    private String gender;
    private int age;


    //    public Animal(String name, String favouriteFood, String type, String gender){
//        this.age = 0; //just born
//        this.name = name;
//        this.favouriteFood = favouriteFood;
//        this.type = type;
//        this.gender = gender;
//    }
    public Animal(String name, String favouriteFood, String type, String gender) {
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.type = type;
        this.gender = gender;
    }

    public Animal(String name, String favouriteFood, String type, String gender, int age, int leg) {
        this.age = age;
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.type = type;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
