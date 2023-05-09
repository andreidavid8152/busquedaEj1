import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        App b = new App();
        //Titulo del JFrame
        b.setTitle("Search GPT");
        //Tamanio del JFrame
        b.setSize(1000, 1000);
        //Hace visible el browser (JFrame)
        b.setVisible(true);
        //Indica que la aplicación debe finalizar completamente cuando se cierra la ventana JFrame
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}