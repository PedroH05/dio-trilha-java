public class SmartTv {
    boolean ligada = false;
    boolean desligada = false;

    int canal = 1;

    int volume = 25;

    public void ligar (){
        ligada = true;
    }
    public void desligar(){
        desligada = true;
    }

    public void aumentarVolume(){
        System.out.println("aumentou +1 volume");
        //volume = volume + 1;
        volume++;
    }

    public void diminuirVolume(){
        System.out.println("diminiu -1 volume");
        //volume = volume - 1;
        volume--;
    }

    public void proximoCanal(){
        System.out.println("Aumentou +1 canal");
        canal++;
    }
    
    public void voltarCanal(){
        System.out.println("voltou -1 canal");
        canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

}
