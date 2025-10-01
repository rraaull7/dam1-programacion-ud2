import java.util.Scanner;

import utilidades.ProcesadorTexto;
import utilidades.Usuario;
public class DatosUsuario {
public static void main(String[] args) {


Scanner sc = new Scanner(System.in);


System.out.println("Introduce el Nombre");
String nombre = sc.nextLine();

System.out.println("Introduce tu Edad");
int edad = sc.nextInt();
sc.nextLine();
System.out.println("Introduce tu Correo");
String correo = sc.nextLine();

boolean emailValido = ProcesadorTexto.esEmailValido(correo);

if (emailValido) {
            Usuario usuario = new Usuario(nombre, edad, correo);
            usuario.mostrarInformacion();
        } else {
            System.out.println("El usuario no puede ser creado porque el email introducido no es válido.");
        }

} 
    


}

