public class PasswordVerify {
    private int cantidadNumeros = 0;
    private int cantidadMayusucla = 0;
    private int cantidadCaracterEspecial = 0;
    public PasswordVerify(){

    }

    public EsCorrecto verificaContrasenya(String password){
        String mensajeSalida = "";
        boolean cumpleRequisito = true;

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57){
                cantidadNumeros++;
            }
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90){
                cantidadMayusucla++;
            }
            if (password.matches("[#!]")){
                cantidadCaracterEspecial++;
            }
        }

        if (password.length() == 0){
            return new EsCorrecto(false, "La contrasenya ha de tenir almenys 8 caràcters\n" +
                    "La contrasenya ha de contenir almenys 2 números\n" +
                    "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                    "La contrasenya ha de contenir almenys un caràcter especial");
        }
        if (password.length() < 8 && password.length() > 0){
            cumpleRequisito = false;
            mensajeSalida+= "La contrasenya ha de tenir almenys 8 caràcters\n";
        }
        if (cantidadNumeros <= 2){
            mensajeSalida+= "La contrasenya ha de contenir almenys 2 números\n";
            cumpleRequisito = false;
        }
        if (cantidadMayusucla <= 1){
            mensajeSalida+= "La contrasenya ha de contenir almenys una lletra majúscula\n";
            cumpleRequisito = false;
        }
        if (cantidadCaracterEspecial <= 1){
            mensajeSalida+= "La contrasenya ha de contenir almenys un caràcter especial";
            cumpleRequisito = false;
        }

        return new EsCorrecto(cumpleRequisito, mensajeSalida);
    }
    
    


}
