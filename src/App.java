import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JButton btnInicio;
    private JPanel panelSearch;
    private JTextArea textArea1;

    String text = "";

    public App() {

        setContentPane(panelSearch);

        btnInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio();
            }
        });
    }

    private void inicio(){
        //Target
        int t1 = 10;
        int t2 = 64;
        int t3 = 300;
        int t4 = 2412;
        int t5 = 65124;
        int t6 = 999000;
        int t7 = 4000000;

        int[] a1 = createArray(10);
        int[] a2 = createArray(100);
        int[] a3 = createArray(1000);
        int[] a4 = createArray(10000);
        int[] a5 = createArray(100000);
        int[] a6 = createArray(1000000);
        int[] a7 = createArray(10000000);

        text += "------ LINEAL ------\n\n";
        //Busqueda lineal
        busquedaLineal(a1, t1);
        busquedaLineal(a2, t2);
        busquedaLineal(a3, t3);
        busquedaLineal(a4, t4);
        busquedaLineal(a5, t5);
        busquedaLineal(a6, t6);
        busquedaLineal(a7, t7);

        text += "------ BINARIA ------\n\n";
        //Busqueda binaria
        busquedaBinaria(a1, t1);
        busquedaBinaria(a2, t2);
        busquedaBinaria(a3, t3);
        busquedaBinaria(a4, t4);
        busquedaBinaria(a5, t5);
        busquedaBinaria(a6, t6);
        busquedaBinaria(a7, t7);


        textArea1.setText(text);
        text = "";
    }

    private void busquedaBinaria(int[] a, int target){
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
    }

    private void busquedaLineal(int[] a, int target){
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
    }

    private int[] createArray(int t) {
        int[] arreglo = new int[t];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1;
        }
        return arreglo;
    }

}
