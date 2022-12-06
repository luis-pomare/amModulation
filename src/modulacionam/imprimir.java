package modulacionam;
public class imprimir {
    public static void seno(plano p,int amplitud,int frecuencia){
        for (float x=-30;x<30;x+=0.01){
            float y = amplitud*(float) Math.sin(frecuencia* x);
            p.dibujarPunto(x,y,"rojo");
        }
    }
}
