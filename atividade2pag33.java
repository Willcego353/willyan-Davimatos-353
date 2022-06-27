public class atividade2pag33{

    public static void main  (String[] args){
    for (int i = 2; i <= 123; i++){
        if (primo(i))
        System.out.println(i);
    }
}
    
public static boolean primo  (int x){
        for (int p = 2; p < x; p++){
            if (x % p == 0)
            return false;
    }
    return true;
}
}




