import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    @Test
    public void testVacio(){
        OperacionesTDD op = new OperacionesTDD();
        assertEquals(0, op.suma(""));
    }

    @Test
    public void test_Solo1(){
        OperacionesTDD op = new OperacionesTDD();
        assertEquals(1, op.suma("1"));
    }

    @Test
    public void test_1Mas2(){
        OperacionesTDD op = new OperacionesTDD();
        assertEquals(3, op.suma("1,2"));
    }

    @Test
    public void test_1Mas1Mas2(){
        OperacionesTDD op = new OperacionesTDD();
        assertEquals(4, op.suma("1,1,2"));
    }

    @Test
    public void test_separadorSinNumero(){
        OperacionesTDD op = new OperacionesTDD();
        assertEquals(-1, op.suma("1,2,"));
    }

    @Test
    public void test_valorNegativo(){
        OperacionesTDD op = new OperacionesTDD();
        assertEquals(-1, op.suma("1,2,-2"));
    }
}