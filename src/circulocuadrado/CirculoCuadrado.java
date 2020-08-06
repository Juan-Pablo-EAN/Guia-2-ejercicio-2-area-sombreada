package circulocuadrado;

import java.util.Scanner;
import java.text.DecimalFormat;
        
public class CirculoCuadrado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.0");
        
        double r = 0;
        double h = 0;
        double ac = 0;
        double ao = 0;
        double s = 0;
        
        System.out.println("Hola! Escribe el radio del circulo");
        r = entrada.nextDouble();
        h = Math.sqrt(Math.pow(r, 2) + Math.pow(r, 2));
        ac = h * h;
        ao = Math.PI*(Math.pow(r, 2));
        s = ao - ac;
        
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Resultado:");
        System.out.println("El area de la sombra entre el circulo y el cuadrado es de " + dec.format(s) + " cm^2");
        System.out.println("----------------------------------------------------------------------");
    }
    
}
