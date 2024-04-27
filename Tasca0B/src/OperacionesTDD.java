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
        String last = s.substring(s.length() - 1);

        String[] nums = s.split(",");
        for (String n: nums) {
            valor = Integer.valueOf(n);
            if (!last.matches("[0-9]") || valor < 0){
                if (!last.matches("[0-9]")) {
                    System.err.println("Numero negativo no permitido");
                }
                return -1;
            }
            if(valor >= 0){
                if (valor >= 1000){
                    valor = 0;
                    System.err.println("Numero superior a 1000 ignorado");
                }
                resultado += valor;
            }
        }
        return resultado;
    }
}
