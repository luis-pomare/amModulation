package modulacionam;
public class imprimir {
    public static void dibujar1(plano p){
        for (float x=-30;x<30;x+=0.01){
            float y = 12*(float) Math.sin(x);
            p.dibujarPunto(x,y,"rojo");
        }
    }
    public static void dibujar2(plano p){
        for (float x=-30;x<30;x+=0.01){
            float y = 0;
            p.dibujarPunto(x,y,"azul");
        }
    }
    public static void test2(plano p){
        for (float x=-30;x<30;x+=0.01){
            float y = 5;
            p.dibujarPunto(x,y,"rojo");
        }
    }
    public static void test3(plano p){
        for (float x=-30;x<30;x+=0.01){
            float y = 10;
            p.dibujarPunto(x,y,"azul");
        }
    }
}
