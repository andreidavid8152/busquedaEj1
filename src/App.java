import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JButton btnInicio;
    private JPanel panelSearch;
    private JTextArea textArea1;

    Busqueda b = new Busqueda();

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
        textArea1.setText("");

        //Target
        int t1 = -1;
        int t2 = -1;
        int t3 = -1;
        int t4 = -1;
        int t5 = -1;
        int t6 = -1;
        int t7 = -1;


        textArea1.append("------ LINEAL ------\n\n");
        //Busqueda lineal
        textArea1.append(b.busquedaLineal(b.getA1(), t1));
        textArea1.append(b.busquedaLineal(b.getA2(), t2));
        textArea1.append(b.busquedaLineal(b.getA3(), t3));
        textArea1.append(b.busquedaLineal(b.getA4(), t4));
        textArea1.append(b.busquedaLineal(b.getA5(), t5));
        textArea1.append(b.busquedaLineal(b.getA6(), t6));
        textArea1.append(b.busquedaLineal(b.getA7(), t7));

        textArea1.append( "------ BINARIA ------\n\n");
        //Busqueda binaria
        textArea1.append(b.busquedaBinaria(b.getA1(), t1));
        textArea1.append(b.busquedaBinaria(b.getA2(), t2));
        b.busquedaBinaria(b.getA3(), t3);
        textArea1.append(b.busquedaBinaria(b.getA4(), t4));
        textArea1.append(b.busquedaBinaria(b.getA5(), t5));
        textArea1.append(b.busquedaBinaria(b.getA6(), t6));
        textArea1.append(b.busquedaBinaria(b.getA7(), t7));

    }



}
