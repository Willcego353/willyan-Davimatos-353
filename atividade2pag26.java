import java.util.Scanner;
public class atividade2pag26{

    public static void main  (String[] args){
    Scanner entrada = new Scanner(System.in);

    Double altura, menor, maior, area1;
    Integer area2;
    System.out.println("informe a altura do trapézio em metros:");
    altura = entrada.nextDouble();
    System.out.println("informe a base menor do trapézio em metros:");
    menor = entrada.nextDouble();
    System.out.println("informe a base maior do trapézio em metros:");
    maior = entrada.nextDouble();
    area1 = (altura * (menor + maior)) / 2;
    area2 = (int) ((altura * (menor + maior)) / 2);
    System.out.println("A área exata do trapezio é :" + area1 + " metros " );
    System.out.println("E a área arredondada do trapezio é :" + area2 + " metros " );
    entrada.close();

}

}