import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InserareCandidati extends JFrame implements ActionListener {
//interfata pentru a adauga un candidat in tabela respectiva
    ListaCandidati candidati = ListaCandidati.getInstance();

    private Container c;
    private JLabel title;

    private JLabel etichetaCNP;
    private JTextField CNP;

    private JLabel etichetaNume;
    private JTextField nume;

    private JLabel etichetaPrenume;
    private JTextField prenume;

    private JLabel etichetaLiceu;
    private JTextField liceu;

    private JLabel raspuns;
    private JButton accept;
    private JButton reset;


    public InserareCandidati() throws HeadlessException {

        setTitle("Candidati");//titlul cointainerului
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Inserare Candidat");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        etichetaCNP = new JLabel("CNP");
        etichetaCNP.setFont(new Font("Arial", Font.PLAIN, 20));
        etichetaCNP.setSize(100, 20);
        etichetaCNP.setLocation(100, 100);
        c.add(etichetaCNP);

        CNP = new JTextField();
        CNP.setFont(new Font("Arial", Font.PLAIN, 15));
        CNP.setSize(190, 20);
        CNP.setLocation(200, 100);
        c.add(CNP);

        etichetaNume = new JLabel("Nume");
        etichetaNume.setFont(new Font("Arial", Font.PLAIN, 20));
        etichetaNume.setSize(100, 20);
        etichetaNume.setLocation(100, 150);
        c.add(etichetaNume);

        nume = new JTextField();
        nume.setFont(new Font("Arial", Font.PLAIN, 15));
        nume.setSize(150, 20);
        nume.setLocation(200, 150);
        c.add(nume);

        etichetaPrenume = new JLabel("Prenume");
        etichetaPrenume.setFont(new Font("Arial", Font.PLAIN, 20));
        etichetaPrenume.setSize(100, 20);
        etichetaPrenume.setLocation(100, 200);
        c.add(etichetaPrenume);

        prenume = new JTextField();
        prenume.setFont(new Font("Arial", Font.PLAIN, 15));
        prenume.setSize(150, 20);
        prenume.setLocation(200, 200);
        c.add(prenume);

        etichetaLiceu = new JLabel("Liceu");
        etichetaLiceu.setFont(new Font("Arial", Font.PLAIN, 20));
        etichetaLiceu.setSize(100, 20);
        etichetaLiceu.setLocation(100, 250);
        c.add(etichetaLiceu);

        liceu = new JTextField();
        liceu.setFont(new Font("Arial", Font.PLAIN, 15));
        liceu.setSize(150, 20);
        liceu.setLocation(200, 250);
        c.add(liceu);

        accept = new JButton("Accept");
        accept.setFont(new Font("Arial", Font.PLAIN, 15));
        accept.setSize(100, 20);
        accept.setLocation(150, 450);
        accept.addActionListener(this);
        c.add(accept);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        raspuns = new JLabel();
        raspuns.setFont(new Font("Arial", Font.PLAIN, 20));
        raspuns.setSize(500, 25);
        raspuns.setLocation(100, 500);
        c.add(raspuns);



        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)//implementarea cu actionlistner pentru a face butonul sa reactioneze la apasare
    {
        if (e.getSource() == accept) {//in cazul in care este apasat butonul de accept
            if(CNP.getText().isEmpty() || nume.getText().isEmpty() || prenume.getText().isEmpty() || liceu.getText().isEmpty()) {
                raspuns.setText("Nu ati completat toate datele");
            }
            else {
                String[] valori = new String[4];
                valori[0] = "'" +  CNP.getText() + "'";
                valori[1] = "'" + nume.getText() + "'";
                valori[2] = "'" + prenume.getText() + "'";
                valori[3] = "'" + liceu.getText() + "'";
                candidati.insereazaData(valori);

                raspuns.setText("Candidat adaugat cu succes");
            }

        }

        else if (e.getSource() == reset) {//in cazul in care este apasat butonul de reset
            CNP.setText("");
            nume.setText("");
            liceu.setText("");
            prenume.setText("");
            raspuns.setText("");
        }
    }





}
