import java.util.Scanner;
public class atividade7{

    public static void main  (String[] args){
    Scanner entrada = new Scanner(System.in);

    double salario, soma;
    
    System.out.println("Informe suas horas de trabalho:");
    salario = entrada.nextDouble();
    soma = (salario * 10.25);
        if (soma < 50){
    System.out.println("Atenção, dirija-se à direção do Hotel!");
    System.out.println("seu salario será: " + soma); 
        }else{  
    System.out.println("seu salario será: " + soma);
    }
    }
}

   


