package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Godzilla extends Kaiju implements Attack{

    int destructiveForce;

    public Godzilla(String name, int healthValue, int destructiveForce){
        super(name, healthValue);
        this.destructiveForce = destructiveForce;
    }

    public int getDestructiveForce(){
        return 50;
    }

    public String roar(){
        return "Roooooaooooaaaaaaaaar!!!";
    }

}
