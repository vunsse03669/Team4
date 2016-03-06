import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by Mr Hung on 3/6/2016.
 */
public class Dove extends BirdObject {
    public Dove(int x, int y) {
       super(x,y);
        this.weigh = "0.5 kg - 1.2 kg";
        this.heigh = "25 cm - 30cm";
        this.name = "Dove";
        this.food = "Corn, pea,...";

        try {
            this.sprite = ImageIO.read(new File("Resource/bocau.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("this is a " +this.name);
        System.out.println("Eviroment: " + this.enviroment);
        System.out.println("Move: " + this.move);
        System.out.println("weigh: " + this.weigh);
        System.out.println("heigh: " + this.heigh);
        System.out.println("food: " + this.food);
    }
}
