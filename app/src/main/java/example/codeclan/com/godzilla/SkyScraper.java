package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class SkyScraper extends HumanConstructs implements Destroyable{

    public SkyScraper(String type, int healthValue, int destructiveForce){
        super(type, healthValue);
        this.destructiveForce = destructiveForce;
    }

    public void die(){
        setHealthValue(0);
    }

    public void attack(Kaiju kaiju){
        int health;
        health = getHealthValue() - kaiju.getDestructiveForce();
        setHealthValue(health);
    }

}
