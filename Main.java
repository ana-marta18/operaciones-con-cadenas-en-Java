import javax.swing.*;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner an = new Scanner(System.in);
            boolean salir = false;
            int opcion;

            while (!salir) {
                System.out.println("----------");
                System.out.println("Bienvenido");
                System.out.println("----------");
                System.out.println("Elige la opción que deseas realizar");
                System.out.println("1. Ver el tamaño de la cadena");
                System.out.println("2. Ver la Subcadena");
                System.out.println("3. comparar las palabras");
                System.out.println("4. Comparar el tamaño");
                System.out.println("5. salir");

                opcion = an.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Bienvenido a la primera opción");
                        System.out.println("Aquí vamos a ver el tamaño de tu cadena");
                        System.out.println("Ingresa una oración");
                        Scanner ep = new Scanner(System.in);
                        String cad1 = ep.nextLine();
                        int V1 = cad1.length();
                        System.out.println("El tamaño es:");
                        System.out.println(V1);
                    }
                    case 2 -> {
                        System.out.println("Bienvenido a la segunda opción");
                        System.out.println("Aquí vamos a ver una subcadena");
                        System.out.println("Ingrese una oración");
                        Scanner san = new Scanner(System.in);
                        String sub = san.nextLine();
                        int c = sub.length();

                        Scanner indic = new Scanner(System.in);
                        System.out.println("Ingrece el indice de su cadena: ");
                        int numin = indic.nextInt();

                        Scanner tamañ = new Scanner(System.in);
                        System.out.println("Ingrese el tamaño de su cadena: ");
                        int numtam = tamañ.nextInt();

                        if (numtam>c){
                            Scanner men = new Scanner(System.in);
                            System.out.println("Ese numero es mayor al tamaño de su cadena, por favor igrese otro");
                            int segundonum = men.nextInt();
                            String subcad = sub.substring(numin, segundonum);
                            System.out.println(" La subcadena es: "+subcad+"\n");
                        } else {
                            String  subcad = sub.substring(numin,numtam);
                            System.out.println(" La subcadena es: "+subcad+"\n");
                        }
                        }
                    case 3 -> {
                        String palbra1, palbra2;
                        System.out.println("Bienvenido a la tercera opción");
                        System.out.println("Aquí vamos a comparar las palabras ");
                        Scanner ma = new Scanner(System.in);
                        System.out.println("Ingrese la primera palabra:  ");
                        palbra1= ma.nextLine();
                        System.out.println("Ingrese la segunda palabra:  ");
                        palbra2= ma.nextLine();
                        if(palbra1.equals(palbra2)){
                            System.out.println("Las palabras ingresadas son iguales ");
                        } else{
                            System.out.println("Las palabras ingresadas no son iguales ");
                        }
                    }
                    case 4 -> {
                        System.out.println("Bienvenido a la cuarta opción");
                        System.out.println("Aquí vamos a comparar el tamaño");
                        System.out.println("Ingresa una oración: ");
                        Scanner ce = new Scanner(System.in);
                        String a = ce.nextLine();

                        System.out.println("¿Quieres eliminar los espacios?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        opcion = an.nextInt();

                        switch (opcion){
                            case 1:
                                System.out.println(a.replaceAll(" ", ""));
                            case 2:
                                System.out.println(a);
                        }
                    }
                    case 5 -> salir = true;
                    default -> System.out.println("Las opciones son del 1 al 5");
                }
            }
            System.out.println("Este es el fin del programa, hasta pronto");
        }
    }
