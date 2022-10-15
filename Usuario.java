public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

            //escolher canal
            smartTv.escolherCanal(14);
            System.out.println("Canal atual seleciondo " + smartTv.canal);


            //aumenta canais.
            smartTv.aumentarCanal();
            smartTv.aumentarCanal();
            smartTv.aumentarCanal();
            System.out.println("Aumenta canal Atual " + smartTv.canal);

            smartTv.diminuirCanal();
            smartTv.diminuirCanal();
            System.out.println("Diminui canal Atual " + smartTv.canal);
            

            //diminui volume e aumenta um.
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.aumentarVolume();
            System.out.println("Volume Atual " + smartTv.volume);



            System.out.println("Tv está ligada " + smartTv.ligada);
            System.out.println("Canal Atual " + smartTv.canal);
            System.out.println("Volume Atual " + smartTv.volume);

            smartTv.ligar();
             System.out.println("Novo status Tv está ligada " + smartTv.ligada);
            smartTv.desligar(); 
             System.out.println("Novo status Tv está ligada " + smartTv.ligada);
    
    }
}
