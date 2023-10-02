public class Ej2 {

    public int primerPositivoPolarizado(int[] vector){
        int solucion;
        solucion = primerPositivoPolarizadoAux(vector, 0, vector.length-1);
    }

    private int primerPositivoPolarizadoAux(int[] vector, int k0, int kN){
        int solucion;
        if(k0 == kN){
            solucion = k0;
        }else {
            int k = (k0 + kN) / 2;
            if (vector[k] < 0) {
                solucion = primerPositivoPolarizadoAux(vector, k + 1, kN);
            } else {
                solucion = primerPositivoPolarizadoAux(vector, k0, k);
            }
        }
        return solucion;
    }
}
