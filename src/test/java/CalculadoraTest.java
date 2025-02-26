import br.com.zup.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSomar() {
        double number = calculadora.somar(5, 7);
        assertEquals(12, number);
    }

    @Test
    public void testSubtrair() {
        double number = calculadora.subtrair(10, 8);
        assertEquals(2, number);
    }

    @Test
    public void testDividir() {
        double number = calculadora.dividir(10, 2);
        assertEquals(5, number);
    }

    @Test
    public void testMultiplicar() {
        double number = calculadora.multiplicar(5, 5);
        assertEquals(25, number);
    }

    @Test
    public void testModulo() {
        double number = calculadora.modulo(10, 2);
        assertEquals(0, number);
    }
}
