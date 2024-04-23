import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FizzBuzzTest {
    @Test
    public void testNum_1_2(){
        FizzBuzz n = new FizzBuzz(1);
        FizzBuzz n2 = new FizzBuzz(2);
        assertEquals("1", n.compruebaFizzBuzz(1));
        assertEquals("2", n2.compruebaFizzBuzz(2));
    }

    @Test
    public void testNum_3(){
        FizzBuzz n = new FizzBuzz(3);
        assertEquals("Fizz", n.compruebaFizzBuzz(3));
    }

    @Test
    public void testNum_4_5(){
        FizzBuzz n = new FizzBuzz(4);
        FizzBuzz n2 = new FizzBuzz(5);
        assertEquals("4", n.compruebaFizzBuzz(4));
        assertEquals("Buzz", n2.compruebaFizzBuzz(5));
    }

    @Test
    public void testNum_6(){
        FizzBuzz n = new FizzBuzz(6);
        assertEquals("Fizz", n.compruebaFizzBuzz(6));
    }

}