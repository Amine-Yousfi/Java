package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public sealed abstract class Aquatic extends Animal permits Dolphin, Penguin{

    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }


    public abstract void swim();

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true; // Les deux objets sont les mêmes en mémoire

        if (obj == null || getClass() != obj.getClass()) return false; // L'objet à comparer est nul ou n'est pas une instance de la classe Aquatic

        //comparaison par rapport au propriétés
        Aquatic aquatic = (Aquatic) obj;
        return this.getName().equals(aquatic.getName())
                && this.getAge() == aquatic.getAge()
                && this.habitat.equals(aquatic.habitat);
    }

}
