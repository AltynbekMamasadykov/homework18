package com.company;

public class Main {

    public static void main(String[] args) {
        //farm1

	    Sheep sheep1 = new Sheep(50.0,3,"male","ak kochkor");
	    Sheep sheep2 = new Sheep(60.0,3,"male","kok kochkor");
	    Sheep sheep3 = new Sheep(55.0,3,"male","kara kochkor");
        Cow cow1 = new Cow(120.0,2,"female","masha");
        Cow cow2 = new Cow(125.0,2,"female","dasha");
        Cow cow3 = new Cow(115.0,2,"male","sasha");
        Cow cow4 = new Cow(110.0,2,"male","kesha");
        Cow cow5 = new Cow(130.0,2,"male","lesha");
        Horse horse1 = new Horse(200.0,5,"yellow","male","Gulsary");
        Horse horse2 = new Horse(200.0,5,"white","male","Akkula");

        Sheep[] sheepFarm1 = {sheep1,sheep2,sheep3};
        Cow[] cowsFarm1 = {cow1,cow2,cow3,cow4,cow5};
        Horse[] horsesFarm1 = {horse1,horse2};

        Farm farm1 = new Farm("Susamyr",cowsFarm1,sheepFarm1,horsesFarm1,"Take");

        System.out.println(farm1);


        //farm2

        Sheep sheep4 = new Sheep(20.0,1,"male","Ak kozu");
        Cow cow6 = new Cow(150.0,2,"female","botokoz");
        Horse horse3 = new Horse(200.0,5,"brown","male","Teltoru");

        Sheep[] sheepFarm2 = {sheep4};
        Cow[] cowsFarm2 = {cow6};
        Horse[] horsesFarm2 = {horse3};

        Farm farm2 = new Farm("Arslanbob",cowsFarm2,sheepFarm2,horsesFarm2,"Asake");

        System.out.println(farm2);


    }
}
