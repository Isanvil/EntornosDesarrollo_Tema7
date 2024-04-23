import java.util.Arrays;

public class OperacionesTDD {
    private String numeros;

    public OperacionesTDD() {
        this.numeros = numeros;
    }

    public int suma(String s){
        int resultado = 0;
        int valor;
        if (s.length() == 0){
            return 0;
        }
        String[] nums = s.split(",");
        for (String n: nums) {
            valor = Integer.valueOf(n);
            if(valor >= 0){
                resultado += valor;
            }
        }
        return resultado;
    }
}
