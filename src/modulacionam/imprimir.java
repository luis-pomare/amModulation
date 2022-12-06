package modulacionam;
public class imprimir {
    public static void seno(plano p,int value){
        for (float x=-30;x<30;x+=0.01){
            float y = value*(float) Math.sin(x);
            p.dibujarPunto(x,y,"rojo");
        }
    }
}
