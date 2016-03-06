import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by Mr Hung on 3/6/2016.
 */
public class Eagle extends BirdObject {
    public Eagle(int x, int y){
        super(x,y);
        this.weigh = "0.5 kg - 7 kg";
        this.heigh = "0.4 m - 1m";
        this.name = "Eagle";
        this.food = "Meat, Fish,...";

        try {
            this.sprite = ImageIO.read(new File("Resource/daibang.jpg"));
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
