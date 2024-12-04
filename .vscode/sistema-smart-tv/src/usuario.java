public class usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("canal tv: " + smartTv.canal);
        System.out.println("volume da tv: " + smartTv.volume);
            
    }
}
