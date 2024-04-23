public class FizzBuzz {
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    public String compruebaFizzBuzz(int n) {
        String respuesta = "";
        if (n % 3 == 0 && n % 5 == 0) {
            return respuesta = "FizzBuzz";
        } else if (n % 3 == 0) {
            respuesta = "Fizz";
        } else if (n % 5 == 0) {
            respuesta = "Buzz";
        } else {
            respuesta = String.valueOf(n);
        }
        return respuesta;
    }
}
