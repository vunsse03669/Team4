import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by Mr Hung on 3/6/2016.
 */
public class Sparrow extends BirdObject {
    public Sparrow(int x, int y) {
        super(x,y);
        this.weigh = "24 gr - 39 gr";
        this.heigh = "~16 cm";
        this.name = "Sparrow";
        this.food = "bug, paddy,...";

        try {
            this.sprite = ImageIO.read(new File("Resource/chimse.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override

    public void display() {
        System.out.println();
        System.out.println("this is a " + this.name);
        System.out.println("Eviroment: " + this.enviroment);
        System.out.println("Move: " + this.move);
        System.out.println("weigh: " + this.weigh);
        System.out.println("heigh: " + this.heigh);
        System.out.println("food: " + this.food);
    }
}
