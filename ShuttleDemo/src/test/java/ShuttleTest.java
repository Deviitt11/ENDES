import org.example.Shuttle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShuttleTest {

    @Test
    @DisplayName("Test constructor válido")

    void testConstructor(){

        Shuttle s = new Shuttle(1);
        assertEquals(1,s.getNumEmpAlojamiento());
        assertEquals(0,s.getNumEmpFabrik());
    }

    @Test
    @DisplayName("Test constructor NO válido")

    void testConstructorNoValido(){

        Shuttle s = new Shuttle(0);
        assertEquals(1,s.getNumEmpAlojamiento());
        assertEquals(0,s.getNumEmpFabrik());
    }

    @Test
    @DisplayName("Test convocar valido")
    void testConvocarValido(){
        Shuttle shuttle = new Shuttle(25);
        String respuesta = shuttle.convocar(20);

        assertEquals("Operación realizada", respuesta);
        // miro que los de aloj sean 5
        assertEquals(5, shuttle.getNumEmpAlojamiento());
        // miro los de fábrica q sea igual a 20
        assertEquals(20, shuttle.getNumEmpFabrik());
    }

    @Test
    @DisplayName("Test convocar demasiados")
    void testConvocarDemasiados(){
        Shuttle shuttle = new Shuttle(15);
        String respuesta = shuttle.convocar(20);

        assertEquals("Operación realizada", respuesta);
        // miro que los de aloj sean 5
        assertEquals(15, shuttle.getNumEmpAlojamiento());
        // miro los de fábrica q sea igual a 20
        assertEquals(0, shuttle.getNumEmpFabrik());
    }

    @Test
    @DisplayName("Test liberar válido")
    void testLiberarVálido(){
        Shuttle shuttle = new Shuttle(20);
        shuttle.convocar(20);


        shuttle.setNumEmpFabrik(20);
        // Test
        String respuesta = shuttle.convocar(20);

        assertEquals("Operación realizada", respuesta);
        // miro que los de aloj sean 5
        assertEquals(20, shuttle.getNumEmpAlojamiento());
        // miro los de fábrica q sea igual a 20
        assertEquals(0, shuttle.getNumEmpFabrik());
    }
}
