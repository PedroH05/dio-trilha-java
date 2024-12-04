public class Usuario {
    
    public static void main(String[] args) throws Exception {

    SmartTv smartTv = new SmartTv();

    System.out.println("Tv ligada? " + smartTv.ligada);
    System.out.println("canal tv: " + smartTv.canal);
    System.out.println("volume da tv: " + smartTv.volume);
        
    smartTv.ligar ();
    System.out.println(" novo status -> Tv ligada? " + smartTv.ligada);

    }
}
