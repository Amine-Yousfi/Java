package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family, name;
    private int age;
    private boolean isMammal;

    public boolean isMammal() {
        return isMammal;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        {
            if(age<0){
                System.out.println("l'age doit etre positif");

            }else {
                this.age = age;
            }

        }

    }

    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return super.toString()+"Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}

