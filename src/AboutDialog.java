import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutDialog extends JDialog {

    public AboutDialog(){
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        add(Box.createRigidArea(new Dimension(0,10)));

        ImageIcon icon = new ImageIcon("res/icon.png");
        JLabel label = new JLabel(icon);
        label.setAlignmentX(0.5f);
        add(label);

        add(Box.createRigidArea(new Dimension(0,10)));

        JLabel name = new JLabel("Snake 101");
        JLabel name2= new JLabel("Antonio Sebastià");
        name.setFont(new Font("Helvetica", Font.BOLD, 14));
        name.setAlignmentX(0.5f);
        name2.setFont(new Font("Helvetica", Font.ITALIC, 12));
        name2.setAlignmentX(0.5f);
        add(name);
        add(name2);

        add(Box.createRigidArea(new Dimension(0,50)));

        JButton close = new JButton("Close");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        close.setAlignmentX(0.5f);
        add(close);

        setModalityType(ModalityType.APPLICATION_MODAL);
        setTitle("About");
        setIconImage(new ImageIcon("res/notes.png").getImage());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 200);

    }
}
