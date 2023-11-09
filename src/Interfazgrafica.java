import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfazgrafica {
    public static void Ventana() throws InterruptedException {
        JFrame ventana = new JFrame("Una ventana nueva");
        ventana.setSize(250, 200);
        ventana.setLocation(200, 300);


        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JButton b1 = new JButton("PB-421");
        b1.setBounds(85, 50, 75, 50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose();
                Imagen();
            }
        });
        panel.add(b1);
        ventana.add(panel);
        ventana.setVisible(true);

/*
        while (true) {

            for (int i = 0; i <= 1000; i++) {
                ventana.setLocation(i, 200);
                Thread.sleep(2);
            }

            for (int i = 1000; i >= 0; i--) {
                ventana.setLocation(i, 200);
                Thread.sleep(2);
            }
        }
        */

    }

    public static void main(String[] args) throws InterruptedException {
        Ventana();
    }

    public static void Imagen() {
        JFrame ventIM = new JFrame("PB-421");
        ventIM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventIM.setVisible(true);
        JPanel panel = new JPanel();
        JLabel texto = new JLabel("Me quiero morir");
        ventIM.setSize(150, 100);
        panel.add(texto);
        ventIM.add(panel);
        ventIM.setLocation(200, 300);
    }

}
