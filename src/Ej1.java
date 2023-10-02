public class Ej1 {
    public int ejercicio(int[] vector){
        boolean encontrado = false;
        int i=0, solucion = -1;
        while(!encontrado && i>=vector[i]){
            if(i == vector[i]){
                encontrado = true;
                solucion = i;
            }
        }
        return solucion;
    }

    /*
    * TEOREMA MAESTRO (no me acuerdo como era)
    */
}
