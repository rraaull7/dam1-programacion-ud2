import utilidades.CuentaBancaria;
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        // ================================
        // EJERCICIO 1: Uso de atributos
        // ================================
        // 1. Intenta acceder directamente al atributo saldo:
        //    System.out.println(cuenta.saldo);
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        
        // System.out.println(cuenta.saldo);




        // ================================
        // EJERCICIO 2: Métodos públicos
        // ================================
        // 1. Ingresa 100€ usando depositar().
        // 2. Retira 30€ usando retirar().
        // 3. Imprime el saldo con getSaldo().

        // Tu código aquí ↓
        

        cuenta.depositar(100);
        cuenta.retirar(30);
        System.out.println(cuenta.getSaldo());



        // ================================
        // EJERCICIO 3: Métodos privados
        // ================================
        // 1. Intenta llamar al método registrarOperacion("Hackeo", 9999).
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        
        // cuenta.RegistrarOperacion("Hackeo", 9999)





        // ================================
        // EJERCICIO 4: Libre
        // ================================
        // Puedes hacer pruebas adicionales con los métodos disponibles
        // para asegurarte de que comprendes la diferencia entre public y private.




        cuenta.depositar(200);
        cuenta.retirar(50);

        double saldoActual = cuenta.getSaldo();
        System.out.println("Saldo actual después de operaciones: " + saldoActual);

    }
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué diferencia hay entre el constructor por defecto y el parametrizado?
// Respuesta: ... El constructor por defecto no da los valores a los atributos, el parametrizado si que los da
 
// Ejercicio 2: ¿Por qué da false al comparar con == dos objetos con los mismos datos?
// Respuesta: ... Aunque tienen los mismos datos, no son el mismo objeto y entonces se consideran diferentes
 
// Ejercicio 3: ¿Qué diferencia hay entre == y equals()? ¿Por qué ahora sí devuelve true?
// Respuesta: ... Porque "equals()" compara los valores,no sus objetos
 
// Ejercicio 4: ¿Por qué en Pelicula equals no funciona como en Cancion?
// Respuesta: ...
 
// Ejercicio 5: ¿Qué ocurre cuando modificas el objeto a través de c6? ¿Qué demuestra?
// Respuesta: ... El objeto c5 cambia tambien, porque que son iguales
 
// Ejercicio 6: ¿Qué error aparece al acceder a un método de p3 siendo null?
// ¿Qué significa realmente que una variable valga null?
// Respuesta: ... Es que esa variable no tiene ningun valor asignado