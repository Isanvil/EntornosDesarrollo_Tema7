import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {

    @Test
    public void testEntradaDos(){
        Divisible3 d = new Divisible3();
        assertEquals("SI", d.isDivisibleEntre3(2));
    }

    @Test
    public void testEntradaSeis(){
        Divisible3 d = new Divisible3();
        assertEquals("SI", d.isDivisibleEntre3(6));
    }
}