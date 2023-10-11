import java.util.Scanner;

public class TiendaHelados {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println(" Tamaño mediano pulsa(M), Tamaño pequeño pulsa(P) y tamaño grande pulsa(G)");
        char tamano = entrada.next().charAt(0);
        System.out.println(" Topping Kitkat pulsa(K), brownie pulsa(B), lacasitos pulsa(L) ");
        char topping = entrada.next().charAt(0);

        float precio = calcularPrecio(tamano, topping);

        System.out.println("El precio total es: " + precio);

    }

    public static float calcularPrecio(char tamano, char topping){
        float precioHelado = 0 ;



        if (tamano == 'P')
            precioHelado=1;

        if (tamano == 'M')
            precioHelado=2;

        if (tamano == 'G')
            precioHelado=3;


        if (topping == 'K')
            precioHelado = precioHelado + 1;

        if (topping == 'B')
            precioHelado = precioHelado +   1.5f;

        if (topping == 'L')
            precioHelado = precioHelado +  0.8f;

        return precioHelado;

    }
}