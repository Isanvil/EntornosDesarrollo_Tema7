public class PasswordVerify {
    private int cantidadNumeros = 0;
    private int cantidadMayusucla = 0;
    private int cantidadCaracterEspecial = 0;
    private String mensajeSalida = "";
    private boolean cumpleRequisito = true;
    private final String MSG_ERROR_8_CARACTERES = "La contrasenya ha de tenir almenys 8 caràcters\n";
    private final String MSG_ERROR_2_NUMEROS = "La contrasenya ha de contenir almenys 2 números\n";
    private final String MSG_ERROR_FALTA_MAYUSCULA = "La contrasenya ha de contenir almenys una lletra majúscula\n";
    private final String MSG_ERROR_FALTA_CARACTER_ESPECIAL = "La contrasenya ha de contenir almenys un caràcter especial";
    public PasswordVerify(){

    }

    public EsCorrecto verificaContrasenya(String password){

        cuentaCantidadesDeAtributos(password);

        if (password.length() == 0){
            return new EsCorrecto(false, MSG_ERROR_8_CARACTERES +
                    MSG_ERROR_2_NUMEROS +
                    MSG_ERROR_FALTA_MAYUSCULA +
                    MSG_ERROR_FALTA_CARACTER_ESPECIAL);
        }

        anyadePromptdeErrores(password);

        if (mensajeAcabaEnSaltoDeLinea()){
            mensajeSalida = mensajeSalida.substring(0, mensajeSalida.length() - 1);
        }

        return new EsCorrecto(cumpleRequisito, mensajeSalida);
    }

    public void cuentaCantidadesDeAtributos(String password){
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57){
                cantidadNumeros++;
            }
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90){
                cantidadMayusucla++;
            }
            if (password.charAt(i) >= 33 && password.charAt(i) <= 47){
                cantidadCaracterEspecial++;
            }
        }
    }

    public void anyadePromptdeErrores(String password){
        if (password.length() < 8 && password.length() > 0){
            cumpleRequisito = false;
            mensajeSalida+= MSG_ERROR_8_CARACTERES;
        }
        if (cantidadNumeros < 2){
            mensajeSalida+= MSG_ERROR_2_NUMEROS;
            cumpleRequisito = false;
        }
        if (cantidadMayusucla < 1){
            mensajeSalida+= MSG_ERROR_FALTA_MAYUSCULA;
            cumpleRequisito = false;
        }
        if (cantidadCaracterEspecial < 1){
            mensajeSalida+= MSG_ERROR_FALTA_CARACTER_ESPECIAL;
            cumpleRequisito = false;
        }
    }

    public boolean mensajeAcabaEnSaltoDeLinea(){
        if (mensajeSalida.length() != 0 && mensajeSalida.substring(mensajeSalida.length() - 1).equals("\n")){
            return true;
        }
        return false;
    }
}
