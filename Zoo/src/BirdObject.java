import com.sun.corba.se.impl.ior.ObjectAdapterIdNumber;

/**
 * Created by Mr Hung on 3/6/2016.
 */
public abstract class BirdObject extends Animals {

    public BirdObject(int x, int y) {
        super(x,y);
        this.enviroment = "Air";
        this.move = "Fly";
    }

}
