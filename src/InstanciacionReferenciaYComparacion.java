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


Pelicula p1 = new Pelicula ("El Gran Hotel Budapest", 2014);
Pelicula p2 = new Pelicula ("El Gran Hotel Budapest", 2014);
 
System.out.println(p1 == p2);
System.out.println(p1.equals(p2));                // EJERCICIO 4: Comparación en Pelicula


Cancion c5 = new Cancion("Dog Days Are Over","Florence");     
Cancion c6 = c5;
 
System.out.println(c5 == c6);
       
c6.setTitutlo("Buenas");
System.out.println(c5);                    // EJERCICIO 5: Referencias


Pelicula p3 = new Pelicula("null", 1900);                 // EJERCICIO 6: null
p3.getTitulo();


// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Cuál es la diferencia entre el constructor por defecto y el parametrizado?
// Respuesta: ... El constructor por defecto no inicializa los atributos con valores específicos, mientras que el parametrizado sí los establece desde el inicio.
 
// Ejercicio 2: ¿Por qué la comparación con == entre dos objetos con los mismos datos da false?
// Respuesta: ... Porque aunque los objetos contienen información idéntica, son dos instancias distintas en memoria, por eso == los considera diferentes.
 
// Ejercicio 3: ¿En qué se diferencia == de equals()? ¿Por qué ahora equals() devuelve true?
// Respuesta: ... Porque equals() compara el contenido o los valores internos de los objetos, no su referencia en memoria como ==.
 
// Ejercicio 4: ¿Por qué el método equals no funciona igual en Pelicula que en Cancion?
// Respuesta: ... Probablemente porque la clase Pelicula no ha sobrescrito correctamente el método equals, a diferencia de Cancion que sí implementa esa comparación basada en atributos.
 
// Ejercicio 5: ¿Qué sucede cuando cambias el objeto mediante c6? ¿Qué evidencia esto?
// Respuesta: ... Los cambios también se reflejan en c5 porque ambas referencias apuntan al mismo objeto en memoria.
 
// Ejercicio 6: ¿Qué error se genera al invocar un método en p3 siendo null? ¿Qué implica que una variable tenga valor null?
// Respuesta: ... Se produce un error de tipo NullPointerException, lo que significa que la variable no apunta a ningún objeto, es decir, no tiene asignado ningún valor válido.


    }
}









