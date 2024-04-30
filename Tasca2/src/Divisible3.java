import java.util.ArrayList;

public class Divisible3 {

    public Divisible3(){

    }

    public String isDivisibleEntre3(int num){
        String numConcatStr = "";

        for (int i = 0; i < num; i++) {
            numConcatStr += Integer.toString(i + 1);
        }

        int numConcatenado = Integer.valueOf(numConcatStr);

        if (numConcatenado % 3 == 0){
            return "SI";
        }
        return "NO";
    }

}
