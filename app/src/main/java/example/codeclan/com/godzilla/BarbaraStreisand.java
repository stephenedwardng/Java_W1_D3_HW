package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class BarbaraStreisand extends Kaiju implements Attack{

    public BarbaraStreisand(String name, int healthValue){
        super(name, healthValue);
    }

    public int getDestructiveForce(){
        return 70;
    }

    public String roar(){
        return "Oooh ooh ooh oooooh ooh ooh oooh";
    }


}
