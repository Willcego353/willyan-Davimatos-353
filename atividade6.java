import java.util.Scanner;
public class atividade6{

    public static void main  (String[] args){
    Scanner entrada = new Scanner(System.in);

    double salario, soma;
    
    System.out.println("Informe suas horas de trabalho:");
    salario = entrada.nextDouble();
    soma = (salario * 10.25);
    System.out.println("seu salario será: " + soma);
    }
}    