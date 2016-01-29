import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tarvi on 29.01.2016.
 */
public class Laev{

    ArrayList<String> reisijad = new ArrayList<String>();
    ArrayList<String> laevad = new ArrayList<String>();

    public Laev(String laevaNimi) {
    }

    public void lisaReisija(String nimi){
        reisijad.add(nimi);
    }

    public void eemaldaReisija(String nimi) {
        reisijad.remove(nimi);
    }

    public ArrayList<String> votaReisijad() {
        return reisijad;
    }

    public int reisijateArv() {
        return reisijad.size();
    }


    public String misNimi() {
        return "Laineraidur";
    }

    public void kalaHammustasKummipaatiAugu() {
        reisijad.remove("Maire Kaunaste");
    }
}
