package view;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class mainMenuScreen {
    public mainMenuScreen() {
        JFrame frame = new JFrame("Pilih Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);


        JLabel instructionLabel = new JLabel("Silakan Pilih Menu :");
        panel.add(instructionLabel);

        JButton menu1Button = new JButton("Input data KTP");
        JButton menu2Button = new JButton("Lihat hasil KTP");
        panel.add(menu1Button);
        panel.add(menu2Button);


        ActionListener menuActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String menu = button.getText();
                if (menu.equals("Input data KTP")) {
                    new inputKTP();
                }
                // } else if (menu.equals("Lihat data seluruh KTP")) {
                //     new outputAllKTP();
                // } belum ada DB nya jadi belum bisa
                frame.dispose();
            }
        };

        menu1Button.addActionListener(menuActionListener);
        menu2Button.addActionListener(menuActionListener);

        frame.setVisible(true);
    }
}
