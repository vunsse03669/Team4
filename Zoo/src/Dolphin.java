import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by Mr Hung on 3/6/2016.
 */
public class Dolphin extends FishObject {
    public Dolphin(int x, int y) {
        super(x,y);
        this.weigh = "50 kg - 10,000 kg";
        this.heigh = "1.7 m - 9.5m";
        this.name = "Dolphin";
        this.food = "squid, Fish,...";
        this.move = "Swim";

        try {
            this.sprite = ImageIO.read(new File("Resource/caheo.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println();
        System.out.println("this is a " + this.name);
        System.out.println("Eviroment: " + this.enviroment);
        System.out.println("Move: " + this.move);
        System.out.println("weigh: " + this.weigh);
        System.out.println("heigh: " + this.heigh);
        System.out.println("food: " + this.food);
    }
}
