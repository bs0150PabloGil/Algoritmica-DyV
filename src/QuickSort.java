public class QuickSort {
    /*  DyV, algoritmo de ordenacion "parcial"
    *   Se escoge un pivote (ultimo elemento del array) y se colocan todos los valores menores que
    *   el pivote a la izquierda y los mayores a la derecha (del pivote)
    */

    public int ordenarArray(int[] vector){
        int posPivote;
        if(vector.length > 1) posPivote = ordenarArrayAux(vector, 0, vector.length-1);

        return posPivote;
    }

    private int ordenarArrayAux(int[] vector, int i0, int iN){
        int pivote = vector[iN];
        int i = i0;
        int j = iN-1;
        while(i<j){
            while(i<j && vector[i] <= pivote)   i++;
            while(i<j && vector[j] > pivote)    j--;

            int auxiliar = vector[i];
            vector[i] = vector[j];
            vector[j] = auxiliar;
        }

        if(vector[i] > pivote){
            vector[iN] = vector[i];
            vector[i] = pivote;
        }

        return i;
    }

}
