package metodos;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("a Tv esta ligada? " + smartTv.ligada);
        System.out.println("canal atual " + smartTv.canal);
        System.out.println("volume atual " + smartTv.volume);

        smartTv.ligar();
        System.out.println("att Status-> a TV esta ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("att Status-> a TV esta ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(35);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

    }
    
}
