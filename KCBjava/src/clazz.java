import java.util.ArrayList;
import java.util.Collections;

public class clazz {
    public static ArrayList<String> getClazz() {
        ArrayList<String> sites = new ArrayList<>();
        sites.add("19届一班");
        sites.add("19届二班");
        sites.add("19届三班");

        Collections.shuffle(sites);

        return sites;
    }
}
