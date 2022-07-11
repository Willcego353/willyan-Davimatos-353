import java.util.Scanner;
public class atividade1{

    public static void main  (String[] args){
    Scanner entrada = new Scanner(System.in);

    Double altura, menor, maior, area;
    System.out.println("informe a altura do trapézio em metros:");
    altura = entrada.nextDouble();
    System.out.println("informe a base menor do trapézio em metros:");
    menor = entrada.nextDouble();
    System.out.println("informe a base maior do trapézio em metros:");
    maior = entrada.nextDouble();
    area = (altura * (menor + maior)) / 2;
    System.out.println("A área do trapézio é :" + area + " metros " );
    entrada.close();

}

}