import java.util.ArrayList;
import java.util.Collections;

public class room {
    public static ArrayList<String> getRoom(){
        ArrayList<String>sites =new ArrayList<>();
        sites.add("A-101");
        sites.add("A-102");
        sites.add("A-103");

        Collections.shuffle(sites);

        return sites;
    }
}
