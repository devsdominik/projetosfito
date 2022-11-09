//ArquivoTxt.java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
public class ArquivoTxt extends JFrame implements ActionListener {
    JLabel L1, L2;
    JButton B1, B2, B3, B4;
    JTextField TF1;
    TextArea TA1;
    FileDialog FDAbrir, FDSalvar;
    public static void main(String args[]) {
        JFrame JATxt = new ArquivoTxt();
        JATxt.setVisible(true);
    }

    ArquivoTxt() {
        setTitle("App Grava/Le Arquivo Texto");
        setSize(500, 300);
        setLocation(300, 300);
        setResizable(false);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(new Color(230, 204, 255));
        L1 = new JLabel("Texto a ser Editado:");
        L1.setForeground(new Color(92, 0, 179));
        L2 = new JLabel("Status do Arquivo:");
        L2.setForeground(new Color(92, 0, 179));
        L1.setFont(new Font(" ", Font.BOLD, 16));
        L2.setFont(new Font(" ", Font.BOLD, 16));
        B2 = new JButton("   Gravar   ");
        B2.addActionListener(this);
        B2.setForeground(new Color(230, 204, 255));
        B2.setBackground(new Color(92, 0, 179));
        B2.setFont(new Font(" ", Font.BOLD, 13));
        B1 = new JButton("   Abrir   ");
        B1.addActionListener(this);
        B1.setForeground(new Color(230, 204, 255));
        B1.setBackground(new Color(92, 0, 179));
        B1.setFont(new Font(" ", Font.BOLD, 13));
        B3 = new JButton("   Limpar   ");
        B3.addActionListener(this);
        B3.setForeground(new Color(230, 204, 255));
        B3.setBackground(new Color(92, 0, 179));
        B3.setFont(new Font(" ", Font.BOLD, 13));
        B4 = new JButton("   Sair   ");
        B4.addActionListener(this);
        B4.setForeground(new Color(230, 204, 255));
        B4.setBackground(new Color(92, 0, 179));
        B4.setFont(new Font(" ", Font.BOLD, 13));
        TF1 = new JTextField(35);
        TF1.setForeground(Color.red);
        TF1.setEditable(false);
        TA1 = new TextArea(8, 60);
        FDAbrir = new FileDialog(this, "Abrir Arquivo", FileDialog.LOAD);
        FDSalvar = new FileDialog(this, "Salvar Arquivo", FileDialog.SAVE);
        getContentPane().add(L1);
        getContentPane().add(TA1);
        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(B3);
        getContentPane().add(B4);
        getContentPane().add(L2);
        getContentPane().add(TF1);
    }

    public void actionPerformed(ActionEvent e) {
        String Nome_do_Arquivo;
        if (e.getSource() == B4)
            System.exit(0);
        if (e.getSource() == B3) {
            TF1.setText(null);
            TA1.setText(null);
        }
        if (e.getSource() == B2) {
            try {
                FDSalvar.setVisible(true);
                if (FDSalvar.getFile() == null) return;
                Nome_do_Arquivo = FDSalvar.getDirectory() + FDSalvar.getFile();
                FileWriter out = new FileWriter(Nome_do_Arquivo);
                out.write(TA1.getText());
                out.close();
                TF1.setText("Arquivo gravado com sucesso!");
            } catch (IOException erro) {
                TF1.setText("Erro ao gravar no Arquivo!");
            }
        }
        if (e.getSource() == B1) {
            try {
                FDAbrir.setVisible(true);
                if (FDAbrir.getFile() == null) return;
                Nome_do_Arquivo = FDAbrir.getDirectory() + FDAbrir.getFile();
                FileReader in = new FileReader(Nome_do_Arquivo);
                String s = "";
                int i = in .read();
                while (i != -1) {
                    s = s + (char) i;
                    i = in .read();
                }
                TA1.setText(s); in .close();
                TF1.setText("Arquivo aberto com sucesso!");
            } catch (IOException erro) {
                TF1.setText("Erro ao abrir o Arquivo!");
            }
        }
    }
}
