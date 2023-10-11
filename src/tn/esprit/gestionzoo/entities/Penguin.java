package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimmingDepth;

    public Penguin(float swimmingDepth,String habitat,String family, String name, int age, boolean isMammal){
        super(habitat,family,name,age,isMammal);
        this.swimmingDepth=swimmingDepth;
    }

    public float getSwimmingSpeed() {
        return swimmingDepth;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingDepth = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+"Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }
}
