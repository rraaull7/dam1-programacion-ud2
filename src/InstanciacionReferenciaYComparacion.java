import utilidades.Cancion;
import utilidades.Pelicula;

public class InstanciacionReferenciaYComparacion {
public static void main(String[] args) {
    
Cancion u1 = new Cancion();                                        // 1. Crea un objeto Cancion (c1) usando el constructor por defecto.
Cancion u2 = new Cancion("Clocks","Coldplay");      //2. Crea un objeto Cancion (c1) usando el constructor por defecto. 

System.out.println(u1);        // 3. Muestra por consola ambas canciones con System.out.println().
System.out.println(u2);        // 3. Muestra por consola ambas canciones con System.out.println().


       


Cancion u3 = new Cancion("MANDANGA STYLE","AMADOR RIVAS");
Cancion u4 = new Cancion("DESPACITO","HECTOR LUNA");

System.out.println(u3 == u4);           // EJERCICIO 2: Comparación con ==



System.out.println(u3.equals(u4));       // EJERCICIO 3: Comparación con equals()


Pelicula p1 = new Pelicula("titulo", 2004);


    }
}









