package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

      Dog dog1 = new Dog();
      dog1.name ="Lucy";
      dog1.breed="Husky";
      dog1.age = 5;
      dog1.gender= 'F';
      dog1.size= "Small";
      dog1.color="White";

      System.out.println(dog1);

      Dog dog2 = new Dog();
      dog2.name ="ACE";
      dog2.breed="Husky";
      dog2.age=5;
      dog2.gender='M';
      dog2.size="Large";
      dog2.color="Black";

      System.out.println(dog2);

      Dog dog3 = new Dog();

      dog3.setInfo("Jack","Husky",5,'M',"Medium","Red");

      System.out.println(dog3);

      dog3.bark();

      Dog dog4 = new Dog();
      Dog dog5 = new Dog();

      dog4.setInfo("Seyma","Kisir",24,'M',"Medium","White");
      dog5.setInfo("Hafsa","Dogurgan",35,'M',"Long","Black");


      System.out.println("==================================");



      Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

      ArrayList<Dog> femaleDogs = new ArrayList<>();
      ArrayList<Dog> maleDogs = new ArrayList<>();



























































    }






}
