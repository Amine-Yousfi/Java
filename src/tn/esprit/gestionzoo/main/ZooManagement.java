package tn.esprit.gestionzoo.main;
import  tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        //------------------------------------------
        Terrestrial terrestrial1 = new Terrestrial(4,"Ca-niche", "rex", 3, true);
        Dolphin dolphin1 = new Dolphin(2.1F,"mer","baleine","doph",5,true);
        Penguin penguin1 = new Penguin(1.5F,"Iceberg","Penguins","penguy",4,true);
        Aquatic aquatic1 = new Aquatic("mer","poisson", "Snoopy", 2, true);
        aquatic1.swim();
        dolphin1.swim();
        penguin1.swim();
        //------------------------------------------
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a " + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a " + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a " + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


    }

}
