import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    @Test
    public void testOrigenCeroDestinoCero(){
        Zapping z = new Zapping();
        assertEquals(0, z.salida(0, 0));
    }

    @Test
    public void testOrigenDosDestino1(){
        Zapping z = new Zapping();
        assertEquals(1, z.salida(2, 1));
    }
}