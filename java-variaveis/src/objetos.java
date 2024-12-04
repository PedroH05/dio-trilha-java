public class objetos {
    
    public static void main(String[] args) {

            int numeroUm = 1;
            int numeroDois = 2;

            boolean simNao = numeroUm == numeroDois;
            System.out.println("NumeroUm e igual a numeroDois?" );
            System.out.println(simNao);
                
            simNao = numeroUm != numeroDois;
            System.out.println("NumeroUm e diferente de numeroDois?");
            System.out.println(simNao);

            simNao = numeroUm > numeroDois;
            System.out.println("numeroUm e maior que numeroDois?");
            System.out.println(simNao);

            //objetos

            String nomeUm = "Pedro";
            String nomeDois = "Pedro";
            System.out.println(nomeUm == nomeDois);

            String nomeTres = "Henrique";
            String nomeQuattro= new String("Carvalho");
            System.out.println(nomeTres.equals(nomeQuattro));
            //serve para conseguir comparar duas string. Objetos nao sao guardados na memoria igual um numero    
    }
}