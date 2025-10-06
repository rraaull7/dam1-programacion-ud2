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
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta: No puedo acceder al saldo directamente porque es un atributo privado y está protegido por encapsulamiento.

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y getSaldo()?
// Respuesta: Puedo usar los métodos públicos porque están diseñados para interactuar con el objeto desde fuera de su clase.

// Ejercicio 3: ¿qué significa el error al intentar llamar a registrarOperacion()?
// Respuesta: El error ocurre porque registrarOperacion es privado y no se puede invocar desde otra clase.

// Ejercicio 4: 
// - ¿Qué ventajas tiene que saldo sea private?
// - ¿Qué pasaría si saldo fuera public?
// - ¿Por qué registrarOperacion es private en lugar de public?
// Respuesta: 
// Tener saldo como privado evita modificaciones indebidas y protege la lógica interna.

// Si fuera público, cualquier clase podría alterarlo sin control, generando errores.

// registrarOperacion es privado porque solo debe usarse dentro de la clase para mantener la coherencia de las operaciones.