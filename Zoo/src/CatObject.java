/**
 * Created by Mr Hung on 3/6/2016.
 */
public abstract class CatObject extends Animals {
    public CatObject(int x, int y) {
        super(x,y);
        this.enviroment = "Forest";
        this.move = "Run";
    }
}
