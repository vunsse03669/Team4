/**
 * Created by Mr Hung on 3/6/2016.
 */
public abstract class FishObject extends Animals {
    public FishObject(int x, int y) {
        super(x,y);
        this.enviroment = "Ocean";
        this.move = "Swim";

    }
}
