import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void sumaTest() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5.0, calculadora.suma(2.0, 3.0));
        assertEquals(-1.0, calculadora.suma(-2.0, 1.0));
        assertEquals(0.0, calculadora.suma(0.0, 0.0));
    }

    @Test
    void restaTest() {
        Calculadora calculadora = new Calculadora();
        assertEquals(-1.0, calculadora.resta(2.0, 3.0));
        assertEquals(-5.0, calculadora.resta(2.0, 7.0));
        assertEquals(0.0, calculadora.resta(10.0, 10.0));
    }

    @Test
    void multiplicacionTest() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6.0, calculadora.multiplicacion(2.0, 3.0));
        assertEquals(-14.0, calculadora.multiplicacion(2.0, -7.0));
        assertEquals(0.0, calculadora.multiplicacion(10.0, 0.0));
    }

    @Test
    void divisionTest() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2.0, calculadora.division(6.0, 3.0));
        assertEquals(-2.0, calculadora.division(6.0, -3.0));
        assertEquals(Double.POSITIVE_INFINITY, calculadora.division(5.0, 0.0));
    }

    @Test
    void divisionPorCeroTest() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calculadora.division(5.0, 0.0));
        assertThrows(ArithmeticException.class, () -> calculadora.division(-10.0, 0.0));
        assertThrows(ArithmeticException.class, () -> calculadora.division(0.0, 0.0));
    }
}