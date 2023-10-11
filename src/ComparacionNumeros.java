import java.util.Scanner;

public class ComparacionNumeros {

    public static void main(String[] args){

        Scanner  s = new Scanner(System.in);
        System.out.println(" Introduce un numero entero ");
        int n1 = s.nextInt();
        System.out.println(" Introduce segundo entero: ");
        int n2 = s.nextInt();

        if(n1>n2) {

            System.out.println("El número mayor es " +n1);

        } else {
            System.out.println("El numero mayor es "+n2);
        }

    }


}
