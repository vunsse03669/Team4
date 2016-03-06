import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

/**
 * Created by TrungNT on 3/6/2016.
 */
public class Window extends Frame implements MouseListener {
    Vector<Animals> animalsVector = new Vector<>();

    public static int SIZE = 300;

    public Window() {
        this.setTitle("Animals World");
        this.setSize(900, 900);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                for (Animals animal : animalsVector)
                    if (animal.x <= x && x < animal.x + SIZE && animal.y <= y && y < animal.y + SIZE) {
                        animal.display();
                    }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        this.init();
        repaint();
    }

    public void init(){
        animalsVector.add(new Dove(0,0));
        animalsVector.add(new Eagle(301,0));
        animalsVector.add(new Lion(601,0));
        animalsVector.add(new Crocodile(0,301));
        animalsVector.add(new Sparrow(301,301));
        animalsVector.add(new Tiger(601,301));
        animalsVector.add(new Panther(0,601));
        animalsVector.add(new Dolphin(301,601));

//        animalsVector.add(new Lion(601,0));
//        animalsVector.add(new Lion(601,0));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Animals animal : animalsVector)
            animal.draw(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
