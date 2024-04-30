public class Zapping {
    private final int MAX_CHANEL = 99;
    private final int MIN_CHANEL = 0;

    public Zapping() {

    }

    public int salida(int origen, int destino){
        int salida = 0;

        if (comprobarValidezRangoCanal(origen, destino)){
            if(origen == destino){
                salida = 0;
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

}
