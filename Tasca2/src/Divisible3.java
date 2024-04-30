import java.util.ArrayList;

public class Divisible3 {

    public Divisible3(){

    }

    public String isDivisibleEntre3(long num){
        String numConcatStr = "";

        for (int i = 0; i < num; i++) {
            numConcatStr += Integer.toString(i + 1);
        }

        long numConcatenado = Long.valueOf(numConcatStr);

        if (numConcatenado % 3 == 0){
            return "SI";
        }
        return "NO";
    }

}
