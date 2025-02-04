public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("No canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - A tv esta ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(5);
        System.out.println("No canal: " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.desligar();
        System.out.println("Novo status - A tv esta ligada? " + smartTv.ligada);

    }
}
