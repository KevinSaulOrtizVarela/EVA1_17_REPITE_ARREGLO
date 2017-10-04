
import java.util.Scanner;

/**
 * @author 16550549
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sC = new Scanner(System.in);
        System.out.println("Indica el tamaño del arreglo ");
        int iTamaño = sC.nextInt();
        //SE CREA UN ARREGLO CON EL TAMAÑO INGRESADO POR EL USUARIO
        int ArreUsuario[] = new int[iTamaño];
        // EL ARREGLO SE LLENA CON VALORES INGRESADOS POR EL USUARIO
        for (int i = 0; i < iTamaño; i++) {
            System.out.println("Llena los valores del arreglo [" + i + "]");
            ArreUsuario[i] = sC.nextInt();
        }
        int iCont = 0;
        System.out.println("¿Que valor quieres encontrar? ");
        int iValor = sC.nextInt();
        for (int i = 0; i < iTamaño; i++) {
            if (ArreUsuario[i] == iValor) { // CADA VEZ QUE SE REPITA iCont AUMENTA
                iCont++;
            }
        }
        // SE IMPRIME EL VALOR Y SU REPETICIÓN
        System.out.println("El valor " + iValor + " se repite " + iCont + " veces");
    }

}
