import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    @Test
    public void testOrigenCeroDestinoCero(){
        Zapping z = new Zapping();
        assertEquals(0, z.salida(1, 1));
    }

    @Test
    public void testOrigenDosDestino1(){
        Zapping z = new Zapping();
        assertEquals(1, z.salida(2, 1));
    }

    @Test
    public void testOrigenDiezDestinoTreinta(){
        Zapping z = new Zapping();
        assertEquals(20, z.salida(10, 30));
    }

    @Test
    public void testOrigenDosDestino99(){
        Zapping z = new Zapping();
        assertEquals(20, z.salida(10, 30));
    }
}