import java.util.Locale;
import java.util.Scanner;


public class Methode4 {

int snelheid=0;
String merk = "Toyota";
int kilometerStand=23000;

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

        System.out.println("De kilomerstand van de " + merk + "is : " + kilometerStand);
        return kilometerStand;
    }

    void setKilometerStand(int stand) {
        System.out.println("De kilomerstand van de " + merk + "is : " + stand);
    }
}

