import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //crear lista
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        //añadir datos

        while (continuar) {
            System.out.println("intoducca nombre: ");
            String Nombre = sc.nextLine();
            System.out.println("intoducca edad: ");
            int edad = sc.nextInt();
                if (Nombre.equalsIgnoreCase("salir")){
                    continuar = false;
                }else {
                    lista.add(Nombre + " ");
                    lista.add(edad + " años");
                }
        }



        //Iterator
        Iterator<String> it =lista.iterator();
        //mostrar lista
        System.out.println("lista completa: " + lista);

        while(it.hasNext()){
            int valor = it.hashCode();
            if (valor <= 18){
                it.remove();
            }
        }
        //mostrar listra tras eliminar los menores de 18 años
        System.out.println("lista con elementos tras la eliminacion: " + lista);
    }
}