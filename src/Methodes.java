public class Methodes {
    public static void main(String[] args) {

        Methode4 auto1 = new Methode4();
        auto1.start();
        auto1.geefGas();
        auto1.stop();
        auto1.getKilometerStand();
        Methode4 auto2= new Methode4();
        auto2.setKilometerStand(50000);
        Methode4 auto3= new Methode4();
        auto3.setMerk2("Volvo");
        auto3.setKilometerStand2(10000);
        auto3.geefGas2();

    }


}



