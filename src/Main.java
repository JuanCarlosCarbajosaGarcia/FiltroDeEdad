import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    //clase Persona
    static class Persona{
        String Nombre;
        int Edad;

        Persona(String Nombre, int Edad){
            this.Nombre = Nombre;
            this.Edad = Edad;
        }

        @Override
        public String toString () {
            return Nombre + " (" + Edad + " años)";
        }
    }

    public static void main(String[] args) {


        //crear lista
        ArrayList<Persona> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        //añadir datos
        System.out.println("a continuacion introducta los datos solicitados(escriva fin para finalizar): ");
        while (continuar) {
            System.out.println("intoducca nombre: ");
            String Nombre = sc.nextLine();
                if (Nombre.equalsIgnoreCase("fin")){
                    continuar = false;
                }else {
                    System.out.println("intoducca Edad: ");
                    try{
                        int Edad = Integer.parseInt(sc.nextLine());
                        lista.add(new Persona(Nombre, Edad));
                    }catch (NumberFormatException e){
                        System.out.println("Formato de edad invalido, intente de nuevo: ");
                    }
                }
        }

        //mostrar lista
        System.out.println("lista completa: ");
        for (Persona p : lista){
            System.out.println(p);
            System.out.println("--------------------");
        }

        //Iterator
        Iterator<Persona> it =lista.iterator();

        //eliminar a los menores de 18
        while (it.hasNext()) {
            Persona p = it.next();
            if (p.Edad <= 18){
                it.remove();
            }
        }
        //mostrar listra tras eliminar los menores de 18 años
        System.out.println("lista con elementos tras la eliminacion: ");
        System.out.println("--------------------");
        for (Persona p : lista){
            System.out.println(p);
            System.out.println("--------------------");
        }
        sc.close();
    }
}