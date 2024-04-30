import java.util.ArrayList;

public class Divisible3 {

    public Divisible3(){

    }

    public String isDivisibleEntre3(long num){
        long numConcatenado = concatenarNumero(num);
        return verificarSiEsDivisible(numConcatenado);
    }

    public long concatenarNumero(long num){
        String numConcatStr = "";

        for (int i = 0; i < num; i++) {
            numConcatStr += Integer.toString(i + 1);
        }
        return Long.valueOf(numConcatStr);
    }

    public String verificarSiEsDivisible(long numConcatenado){
        if (numConcatenado % 3 == 0){
            return "SI";
        }
        return "NO";
    }
}
