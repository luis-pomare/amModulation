package modulacionam;
public class imprimir {
    public static void seno(plano p,int amplitud,int frecuencia){
        for (float x=-30;x<30;x+=0.001){
            float y = amplitud*(float) Math.sin(frecuencia* x);
            p.dibujarPunto(x,y,"rojo");
        }
    }
    public static void cuadrada(plano p,int amplitud,int frecuencia){
        for (float x=-30;x<30;x+=0.001){
            float seno = amplitud*(float) Math.sin(frecuencia* x);
            float y=0;
         
            if (seno>0){
                y = amplitud;
            } else {
                if(seno<0){
                    y =-amplitud;
                }
            }
            p.dibujarPunto(x,y,"azul");
        }
    }
}
