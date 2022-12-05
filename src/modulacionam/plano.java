package modulacionam;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;
public class plano {

    private JPanel p;
    private int w;
    private int h;
    private int escala = 7;
    
    
    public plano(JPanel p) {
        this.p = p;
        w=p.getWidth();
        h=p.getHeight();
    }
    
    public void dibujar(){
        Graphics2D g= (Graphics2D) p.getGraphics();
        
        //lineas verticales
        for(int x=w/2; x<w;x+=escala){
            g.drawLine(x , 0, x,h );            
        }
        for(int x=w/2; x>0;x-=escala){
            g.drawLine(x , 0, x,h );            
        }
        
        //lineas horizontales
        for(int y=h/2; y<h;y+=escala){
            g.drawLine(0 , y, w,y );            
        }
        for(int y=h/2; y>0;y-=escala){
            g.drawLine(0 , y, w,y );            
        }
        
        //Lineas del medio
        g.drawLine(w/2, 0, w/2,h );
        g.drawLine(0, h/2, w,h/2 );
    }
    
    public void dibujarPunto(float x, float y, String color){
        Graphics2D g= (Graphics2D) p.getGraphics();
        int realX = (int) (w/2+x*escala);
        int realY = (int) (h/2-y*escala);
        
        if("rojo".equals(color)){
        g.setColor(Color.red);}
        else{
        g.setColor(Color.blue);}
        
        g.fillOval(realX-2, realY-2, 4, 4);
    }
}
