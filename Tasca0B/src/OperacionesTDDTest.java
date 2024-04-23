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
}