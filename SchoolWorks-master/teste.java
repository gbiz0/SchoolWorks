import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class teste
{
  public static void main(String[] args)
  {
    String msg = "bom dia pessoal<3";

    // Cria um JFrame
    JFrame frame = new JFrame("JOptionPane exemplo");

    // Cria o JOptionPane por showMessageDialog
    JOptionPane.showMessageDialog(frame,
        "Tenha um otimo dia:\n\n '" + msg + "'.", //mensagem
        "Aviso para Você", // titulo da janela 
        JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
}