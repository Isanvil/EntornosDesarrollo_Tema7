import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    public void testNum_7_8_9(){
        FizzBuzz n = new FizzBuzz(7);
        FizzBuzz n2 = new FizzBuzz(8);
        FizzBuzz n3 = new FizzBuzz(9);
        assertEquals("7", n.compruebaFizzBuzz(7));
        assertEquals("8", n2.compruebaFizzBuzz(8));
        assertEquals("Fizz", n3.compruebaFizzBuzz(9));
    }

    @Test
    public void testNum_10(){
        FizzBuzz n = new FizzBuzz(10);
        assertEquals("Buzz", n.compruebaFizzBuzz(10));
    }

    @Test
    public void testNum_11_Al_14() {
        FizzBuzz n = new FizzBuzz(11);
        FizzBuzz n2 = new FizzBuzz(12);
        FizzBuzz n3 = new FizzBuzz(13);
        FizzBuzz n4 = new FizzBuzz(14);
        assertEquals("11", n.compruebaFizzBuzz(11));
        assertEquals("Fizz", n2.compruebaFizzBuzz(12));
        assertEquals("13", n3.compruebaFizzBuzz(13));
        assertEquals("14", n4.compruebaFizzBuzz(14));
    }

    @Test
    public void testNum_15(){
        FizzBuzz n = new FizzBuzz(15);
        assertEquals("FizzBuzz", n.compruebaFizzBuzz(15));
    }
}