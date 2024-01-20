import CCuenta.CCuenta;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CCuentaTest {

    @Test
    @DisplayName("Test método ingresar VÁLIDO")
    void testIngresarValido(){

        // Creamos un objeto CCuenta
        CCuenta c1 = new CCuenta("David", "BBVA", 1.0);

        // Llamamos al método ingresar y le ponemos de cantidad 1.0 (un valor válido)
        // Esto lo guardamos en una variable llamada r1 (respuesta 1)
        String r1 = c1.ingresar(1.0);

        // Utilizamos el método assertEquals para nuestras pruebas unitarias

        // Este primer aE compara nuestra respuesta1 con lo que se espera ("El ingreso ha sido correcto")
        assertEquals("El ingreso ha sido correcto", r1);

        // Con este método esperamos que el saldo sea 2.0 y lo comprobamos
        assertEquals(2.0, c1.getSaldo());
    }

    @Test
    @DisplayName("Test método ingresar NO VÁLIDO")
    void testIngresarNOValido(){

        // Creamos un nuevo objeto CCuenta
        CCuenta c2 = new CCuenta("Juan", "Nombre de cuenta 2", 1.0);

        // Llamamos al método ingresar y le ponemos de cantidad -500.0 (un valor NO válido)
        // Esto lo guardamos en una variable llamada r2 (respuesta 2)
        String r2 = c2.ingresar(-500.0);

        // Utilizamos el método assertEquals para nuestras pruebas unitarias

        // Este aE compara nuestra respuesta2 con lo que se espera ("No se puede ingresar una cantidad negativa")
        assertEquals("No se puede ingresar una cantidad negativa", r2);
    }

    @Test
    @DisplayName("Test método retirar VÁLIDO")
    void testRetirarValido(){

        // Creamos un nuevo objeto CCuenta
        CCuenta c3 = new CCuenta("Pepe", "Cuenta de banco 2", 2.0);

        // Llamamos al método retirar y le ponemos de cantidad 1.0 (un valor válido)
        // Esto lo guardamos en una variable llamada r3 (respuesta 3)
        String r3 = c3.retirar(1.0);

        // Utilizamos el método assertEquals para nuestras pruebas unitarias

        // Con este método esperamos que el saldo sea 1.0 y lo comprobamos
        assertEquals(1.0, c3.getSaldo());

        // Este aE compara nuestra respuesta2 con lo que se espera ("Dinero retirado satisfactoriamente")
        assertEquals("Dinero retirado satisfactoriamente", r3);
    }

    @Test
    @DisplayName("Test método retirar NO VÁLIDO")
    void testRetirarNOValido(){

        // Creamos un nuevo objeto CCuenta
        CCuenta c4 = new CCuenta("Javi", "Cuenta de banco 4", -200.0);

        // Llamamos al método retirar y le ponemos de cantidad -1.0 (un valor NO   válido)
        String r4 = c4.retirar(-1.0);

        // Utilizamos el método assertEquals para nuestras pruebas unitarias

        // Este aE compara nuestra respuesta2 con lo que se espera ("No se puede retirar una cantidad negativa")
        assertEquals("No se puede retirar una cantidad negativa", r4);

    }
}
