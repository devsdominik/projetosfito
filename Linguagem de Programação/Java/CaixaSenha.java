//CaixaSenha.java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class CaixaSenha extends JFrame implements ActionListener
{
	JLabel L1,L2;
	JTextField TF1;JPasswordField PW;
	public static void main(String args [])
	{
		JFrame JCSenha = new CaixaSenha();
	    JCSenha.setVisible(true);
	}
	CaixaSenha()
	{
		setTitle ("Verifica Senha");
		setBounds(200,50,350,100);
		setLocation(300,300);
		getContentPane().setBackground(new Color(230, 204, 255));
		getContentPane().setLayout(new GridLayout(2,2));
		L1 = new JLabel("Digite a Senha: ");
		L1.setForeground(new Color(92, 0, 179));
		L2 = new JLabel("Validacao: ");
		L2.setForeground(new Color(92, 0, 179));
		L1.setFont(new Font(" ",Font.BOLD,14));
		L2.setFont(new Font(" ",Font.BOLD,14));
		TF1 = new JTextField();
		TF1.setForeground(Color.red);
		PW = new JPasswordField();
		PW.setEchoChar('*');
		PW.addActionListener(this);
		getContentPane().add(L1);
		getContentPane().add(PW);
		getContentPane().add(L2);
		getContentPane().add(TF1);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(new String(PW.getPassword()).equals("12345"))
		{
			TF1.setText("Senha valida");
			JFrame JArquivo = new ArquivoTxt();
			JArquivo.setVisible(true);
		}
	     else
		    TF1.setText("Senha Invalida");
}}
