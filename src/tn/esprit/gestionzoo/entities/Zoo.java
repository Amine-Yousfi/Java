package tn.esprit.gestionzoo.entities;

public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private final Aquatic[] aquaticAnimals=new Aquatic[10];
    private String name, city;
    private int nbrAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public Aquatic[] getAquaticAnimalsAnimals() {
        return aquaticAnimals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        if(name.isBlank()) {  //l'espace ne le prend pas en considération
            System.out.println("le nom est vide");
        }else {
            this.name = name;
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (!isZooFull()) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
        }
        return true;
    }

    public boolean addAquaticAnimal(Aquatic aquatic) {
        if (searchAquaticAnimal(aquatic)!= -1)
            return false;
        if (!isZooFull()) {
            aquaticAnimals[nbrAnimals] = aquatic;
            nbrAnimals++;
        }
        return true;
    }

    private int searchAquaticAnimal(Aquatic aquatic) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (aquaticAnimals[i] != null && aquatic.getName().equals(aquaticAnimals[i].getName())) {
                return i;
            }
        }
        return index;
    }


    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    public float maxPenguinSwimmingDepth(){
        float maxDepth = 0;
        for (int i = 0; i < nbrAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (penguin.getSwimmingDepth() > maxDepth)
                    maxDepth = penguin.getSwimmingDepth();
            }
        }
        return maxDepth;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }

    public void displayNumberOfAquaticsByType() {
        int number_Dolphins = 0;
        int number_Penguins = 0;

        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                number_Dolphins++;
            } else if (aquatic instanceof Penguin) {
                number_Penguins++;
            }
        }

        System.out.println("Number of Dolphins: " + number_Dolphins);
        System.out.println("Number of Penguins: " + number_Penguins);
    }
}

