public class Busqueda {
    private int[] a1;
    private int[] a2;
    private int[] a3;
    private int[] a4;
    private int[] a5;
    private int[] a6;
    private int[] a7;

    public Busqueda(){
        a1 = createArray(10);
        a2 = createArray(100);
        a3 = createArray(1000);
        a4 = createArray(10000);
        a5 = createArray(100000);
        a6 = createArray(1000000);
        a7 = createArray(10000000);
    }

    public int[] getA1() {
        return a1;
    }

    public int[] getA2() {
        return a2;
    }

    public int[] getA3() {
        return a3;
    }

    public int[] getA4() {
        return a4;
    }

    public int[] getA5() {
        return a5;
    }

    public int[] getA6() {
        return a6;
    }

    public int[] getA7() {
        return a7;
    }

    private int[] createArray(int t) {
        int[] arreglo = new int[t];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1;
        }
        return arreglo;
    }

    public String busquedaBinaria(int[] a, int target){
        String text = "";
        int res = -1;
        int izq = 0;
        int dere = a.length - 1;

        text += "--- Iniciando busqueda binaria en arreglo " + a.length + " ---\n";

        long tInicio = System.nanoTime();

        while (izq <= dere) {
            int mid = (izq + dere) / 2;

            if (a[mid] == target) {
                res = mid;
                break;
            } else if (a[mid] < target) {
                izq = mid + 1;
            } else {
                dere = mid - 1;
            }
        }

        long tFinal = System.nanoTime();

        text += "\nTarget: " + target + "\n";

        text += "Tiempo: " + (tFinal - tInicio) + "ns\n";

        if(res != -1){
            text += "Posicion: " + res + "\n\n";
        }else{
            text += "No se encontro el target\n\n";
        }

        return text;
    }

    public String busquedaLineal(int[] a, int target){
        String text = "";
        int res = -1;

        text += "--- Iniciando busqueda lineal en arreglo " + a.length + " ---\n";

        long tInicio = System.nanoTime();

        for (int i = 0; i < a.length; i++) {
            if(a[i] == target){
                res = i;
                break;
            }
        }

        long tFinal = System.nanoTime();

        text += "\nTarget: " + target + "\n";

        text += "Tiempo: " + (tFinal - tInicio) + "ns\n";

        if(res != -1){
            text += "Posicion: " + res + "\n\n";
        }else{
            text += "No se encontro el target\n\n";
        }

        return text;
    }
}
