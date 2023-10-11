package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public Dolphin(float swimmingSpeed,String habitat,String family, String name, int age, boolean isMammal){
        super(habitat,family,name,age,isMammal);
        this.swimmingSpeed=swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public String toString() {
        return "Penguin{" +
                "swimmingDepth=" + swimmingSpeed +
                '}';
    }

    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
