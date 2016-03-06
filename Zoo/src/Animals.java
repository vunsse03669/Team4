import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Mr Hung on 3/6/2016.
 */
public abstract class Animals {
    protected int x;
    protected int y;
    protected String enviroment;
    protected String move;
    protected BufferedImage sprite;
    protected String weigh ;
    protected String heigh;
    protected String food;
    protected String name;

    public Animals(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public String getMove() {
        return move;
    }

    public String getEnviroment() {
        return enviroment;
    }

    public int getY() {
        return y;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }

    public abstract void display();
    public void draw(Graphics g){
        g.drawImage(this.sprite,this.x,this.y,null);
    }

}
