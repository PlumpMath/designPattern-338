import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Termex on 11/02/2016.
 */
public class Fenetre extends JFrame{

    private JPanel panel = new JPanel();
    public Fenetre(){

        Brightness luminosite = new Brightness();
        Command brightnessUp = new highterBrightness(luminosite);
        Command brightnessDown = new downBrightness(luminosite);

        MemoryCommand mc = new MemoryCommand();

        this.setTitle("Commande");
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pnlButton = new JPanel();
        JButton btnUpBrightness = new JButton();
        btnUpBrightness.setText("Augmente Luminosite");
        JButton btnDownBrightness = new JButton();
        btnDownBrightness.setText("Diminue Luminosite");
        pnlButton.add(btnDownBrightness);
        pnlButton.add(btnUpBrightness);

        JTextArea textArea = new JTextArea();

        panel.setLayout(new BorderLayout());
        //On ajoute le bouton au content pane de la JFrame
        //Au centre
        panel.add(pnlButton, BorderLayout.NORTH);
        //Au nord
        panel.add(textArea, BorderLayout.CENTER);

        btnDownBrightness.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mc.storeAndExecute(brightnessDown);
                textArea.setText(textArea.getText()+brightnessDown.name()+"\n");
            }
        });

        btnUpBrightness.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mc.storeAndExecute(brightnessUp);
                textArea.setText(textArea.getText()+brightnessUp.name()+"\n");
            }
        });

        this.setContentPane(panel);
        this.setVisible(true);
    }
}
