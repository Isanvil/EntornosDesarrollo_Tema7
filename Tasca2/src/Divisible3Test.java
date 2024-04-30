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

    @Test
    public void testEntradaCuatro(){
        Divisible3 d = new Divisible3();
        assertEquals("NO", d.isDivisibleEntre3(4));
    }

    @Test
    public void testEntradaSiete(){
        Divisible3 d = new Divisible3();
        assertEquals("NO", d.isDivisibleEntre3(7));
    }

    @Test
    public void testEntradaDiez(){
        Divisible3 d = new Divisible3();
        assertEquals("NO", d.isDivisibleEntre3(10));
    }

    @Test
    public void testEntradaTrece(){
        Divisible3 d = new Divisible3();
        assertEquals("NO", d.isDivisibleEntre3(13));
    }
}