import javax.swing.*;
import java.awt.*;

public class Grid {

    JFrame jframe = new JFrame("Teste Grid");

    private JButton [][] quadrados = new JButton[8][8];

    JPanel panel = new JPanel();


    public Grid() {
        panel.setLayout(new GridLayout(quadrados.length,quadrados.length,1,1));

        for (int i = 0; i <quadrados.length; i++){
            for (int j = 0; j <quadrados.length; j++) {
                quadrados[i][j] = new JButton();
                panel.add(quadrados[i][j]);
            }
        }

        jframe.add(panel);

        jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setSize(640, 480);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Grid();
            }
        });
    }
}
