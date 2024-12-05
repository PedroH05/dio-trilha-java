public class usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv ();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal: " + smartTv.canal); 

        System.out.println("\n");
    
        System.out.println("Tv ligada? "+ smartTv.ligada);
        //System.out.println("Canal: " + smartTv.canal); 
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada "+ smartTv.ligada);


        System.out.println("\n");
    }
}
