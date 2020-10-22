import java.util.Locale;
import java.util.Scanner;


public class Methode4 {

int snelheid=0;
String merk = "Toyota";
int kilometerStand=23000;
    String merk2= "Volvo";
    int kilometerStand2;
    int kilometerUur=20;

        void start(){

            System.out.println("de " + merk + " start");

 }

        void stop(){

            System.out.println("de " + merk + " stopt");
    }

        void geefGas(){
            System.out.println("de " + merk + " rijdt");

    }

    int getKilometerStand(){

        System.out.println("De kilomerstand van de " + merk + " is : " + kilometerStand);
        return kilometerStand;
    }

    void setKilometerStand(int stand) {
        System.out.println("De kilomerstand van de " + merk + " is : " + stand);
    }
    void setMerk2(String merk2) {
        System.out.println("de "+ merk2 + " start");
    }
    void setKilometerStand2(int stand) {
        System.out.println("De kilomerstand van de " + merk2 + " is : " + stand);

    }
    void geefGas2(){

            System.out.println("de " + merk2 + " rijdt met "+kilometerUur+" / uur");
            kilometerUur+=20;
        System.out.println("de " + merk2 + " rijdt met "+kilometerUur+" / uur");
        kilometerUur+=20;
        System.out.println("de " + merk2 + " rijdt met "+kilometerUur+" / uur");
        System.out.println("de kilometerstand van " + merk2 + " is:"+ (10000+kilometerUur));

    }
}

