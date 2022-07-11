import javax.swing.JOptionPane;
import java.util.Scanner;

public class atividade9{
public static void main(String[] args) 
{
    Scanner entrada = new Scanner(System.in);
    
    int idade;

    System.out.println("Digite o valor da sua idade.");
    idade = entrada.nextInt();

         if (idade >= 0 && idade <= 3)
    {    
        JOptionPane.showMessageDialog(null, "Você é bebê"); 
    }
    else if (idade >=4 && idade <=10){
        JOptionPane.showMessageDialog(null, "Você é criança"); 
    }
    else if (idade >=11 && idade <=14){
        JOptionPane.showMessageDialog(null, "Você é pré-adolescente"); 
    }
    else if (idade >=15 && idade <=17){
        JOptionPane.showMessageDialog(null, "Você é adolescente"); 
    }
    else if (idade >=18 && idade <=25){
        JOptionPane.showMessageDialog(null, "Você é jovem"); 
    }
    else if (idade >=26 && idade <=50){
        JOptionPane.showMessageDialog(null, "Você é adulto"); 
    }
    else if (idade >=51 && idade <=60){
        JOptionPane.showMessageDialog(null, "Você é velho"); 
    }
    else if (idade >=61){
        JOptionPane.showMessageDialog(null, "Você é idoso"); 
    } 
}
}