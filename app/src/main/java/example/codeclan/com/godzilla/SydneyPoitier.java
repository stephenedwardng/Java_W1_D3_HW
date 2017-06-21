package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class SydneyPoitier extends Kaiju implements Attack{

    int destructiveForce;

    public SydneyPoitier(String name, int healthValue, int destructiveForce){
        super(name, healthValue);
        this.destructiveForce = destructiveForce;
    }

    public int getDestructiveForce(){
        return 40;
    }

    public String roar(){
        return "They call me Mr Poitier";
    }


}
