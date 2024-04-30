public class Zapping {
    private final int MAX_CHANEL = 99;
    private final int MIN_CHANEL = 1;

    public Zapping() {

    }

    public int salida(int origen, int destino){
        int salida = 1;
        int canalMenor;
        int canalMayor;

        if (comprobarOrigenMayor(origen, destino)){
            canalMenor = destino;
            canalMayor = origen;
        } else {
            canalMenor = origen;
            canalMayor = destino;
        }

        if (comprobarValidezRangoCanal(origen, destino)){
            if(origen == destino){
                salida = 0;
            } else {
                if ( MAX_CHANEL - (canalMayor - canalMenor) < comprobarDiferenciaDe49(canalMenor, canalMayor)){
                    salida = ( MAX_CHANEL - (canalMayor - canalMenor));
                } else {
                    salida = comprobarDiferenciaDe49(canalMenor, canalMayor);
                }
            }
        }
        return salida;
    }

    public boolean comprobarValidezRangoCanal(int origen, int destino){
        if (origen > MAX_CHANEL || origen < MIN_CHANEL || destino > MAX_CHANEL || destino < MIN_CHANEL){
            return false;
        }
        return true;
    }

    public boolean comprobarOrigenMayor(int origen, int destino){
        if (origen > destino){
            return true;
        }
        return false;
    }

    public int comprobarDiferenciaDe49(int menor, int mayor){
        return mayor - menor;
    }

}
