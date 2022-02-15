package com.company;

public class Horse extends Animal{
    private String color;

    public Horse(double weight, int age, String color, String gender, String nickName) {
        super(weight, age, gender, nickName);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + getWeight() +
                ", age=" + getAge() +
                ", color='" + getColor() +
                ", gender='" + getGender() + '\'' +
                ", nickName='" + getNickName() + '\'' +
                '}';
    }
}
