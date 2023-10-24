package tn.esprit.gestionzoo.main;
import  tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
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

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);


        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        dolphin.swim();
        penguin.swim();

        Dolphin dolphin1 = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Skipper", 10, true, "Ocean", 25.3f);
        System.out.println(myZoo.addAquaticAnimal(dolphin1));
        System.out.println(myZoo.addAquaticAnimal(penguin2));
        System.out.println(dolphin1);
        System.out.println(penguin2);
        System.out.println("-----------------------------------");
        dolphin1.swim();
        penguin2.swim();
        System.out.println("*************************************");
        System.out.println("la profondeur maximale dans mon Zoo est : "+myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        System.out.println(penguin.equals(penguin2));


    }

}
