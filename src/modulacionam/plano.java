package modulacionam;
import java.awt.Graphics2D;
import javax.swing.JPanel;
public class plano {

    private JPanel p;
    private int w;
    private int h;
    
    public plano(JPanel p) {
        this.p = p;
        w=p.getWidth();
        h=p.getHeight();
    }
    
    public void dibujar(){
        Graphics2D g= (Graphics2D) p.getGraphics();
        g.drawLine(w/2, 0, w/2,h );
        g.drawLine(0, h/2, w,h/2 );
    }
}
