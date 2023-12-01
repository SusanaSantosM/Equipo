import SeleccionFutbol.Entrenador;
import SeleccionFutbol.Futbolista;
import SeleccionFutbol.SeleccionFutbol;

import java.util.Scanner;

public class Boletin15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Futbolista fut = new Futbolista(9,"lateral",20,"Cristobal","Malaga",21);

        System.out.println("Teclee el id");
        fut.setEdade(sc.nextInt());

        System.out.println(fut.toString());

        SeleccionFutbol ent = new Entrenador("15AA", 25, "Freddy", "Cueva", 39);

        System.out.println(ent);
    }
}