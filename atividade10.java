import java.util.Scanner;

import javax.swing.JOptionPane;
public class atividade10 {

    public static void main  (String[] args){
        int idade;
        String aux = "";
        float nota1=6, nota2=8, trabalho=9, media=5;
        
        aux = JOptionPane.showMessageDialog("Nota1");
        nota1 = Float parseFloat(aux);

        aux = JOptionPane.showMessageDialog("Nota2");
        nota2 = Float parseFloat(aux);

        aux = JOptionPane.showMessageDialog("Nota do trabalho");
        trabalho = Float parseFloat(aux);

        aux = JOptionPane.showMessageDialog("Média");
        media = Float parseFloat(aux);

        media = (nota1 + nota2 + trabalho)/3;
        JOptionPane.showMessageDialog(null "media");
    }
        (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "dados invalidos")
        }
    }

