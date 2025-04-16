import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidadorCpfTest {

    @Test
    public void testCpfCom11Digitos() {
        assertTrue(ValidadorCpf.validarTamanhoCpf("12345678901"));
    }

    @Test
    public void testCpfCurto() {
        assertFalse(ValidadorCpf.validarTamanhoCpf("12345"));
    }

    @Test
    public void testCpfLongo() {
        assertFalse(ValidadorCpf.validarTamanhoCpf("123456789012345"));
    }

    @Test
    public void testCpfVazio() {
        assertFalse(ValidadorCpf.validarTamanhoCpf(""));
    }

    @Test
    public void testCpfNulo() {
        assertFalse(ValidadorCpf.validarTamanhoCpf(null));
    }
}
