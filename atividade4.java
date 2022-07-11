public class atividade4 {
    
    public static void main(String[] args){
        long somapar=1;
        int somaimpar=0;
        int i;

    for (i = 0; i <= 30; i++) {
            if (i % 2 == 1)
            somaimpar +=i;
            else
                if (i>0)
                somapar*=i;
            }
            System.out.println(somaimpar + " soma IMPAR.");
        
            System.out.println(somapar + " multiplicação PAR.");
    }

}
