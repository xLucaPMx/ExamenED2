import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void caso1() {
        assertEquals(113.48, FacturaElectrica.calcularTotalFactura(500, 600, 5, 30, true, false, true), 0.01);
    }

    @Test
    void caso2() {
        assertEquals(204.72, FacturaElectrica.calcularTotalFactura(800, 300, 5, 30, false, true, false), 0.01);
    }

    @Test
    void caso3() {
        assertEquals(52.96, FacturaElectrica.calcularTotalFactura(60, 600, 13, 31, false, true, true), 0.01);
    }
}