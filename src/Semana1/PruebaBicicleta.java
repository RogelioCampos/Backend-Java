package Semana1;

public class PruebaBicicleta {
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        Bicicleta biciMountain = new Bicicleta();
        biciMountain.setColor("Negra");
        biciMountain.setPins(6);
        biciMountain.setRodada(26);
        biciMountain.setVel(13.2);
        String msg = "Soy una bici de montaña con estas características; ";
        msg += "\nColor: "+biciMountain.getColor();
        msg += "\nPins: "+biciMountain.getPins();
        msg += "\nRodada: "+biciMountain.getRodada();
        msg += "\nVelocidad: "+biciMountain.getVel();

        System.out.print(msg);
    }

}
